# Gradle PMD plugin does not function with Java 9

This is a simple project illustrated problems with Java 9 and the Gradle PMD plugin.


## Environment
* The project was created with a text editor (Atom) and subsequently edited via Intellij.
```
IntelliJ IDEA 2017.2.6
Build #IU-172.4574.11, built on November 13, 2017
Licensed to Me
You have a perpetual fallback license for this version
Subscription is active until December 7, 1941
JRE: 1.8.0_152-release-915-b12 x86_64
JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
Mac OS X 10.13.1
```
* The project was developed and run on MacOS 10.13.1 (High Sierra)
* The shell is standard MacOS bash
* The JVM used is Java 9
```bash
java -version
java version "9"
Java(TM) SE Runtime Environment (build 9+181)
Java HotSpot(TM) 64-Bit Server VM (build 9+181, mixed mode)
```
* Gradle version is 4.3.1 executed via gradle wrapper
```bash
./gradlew -version
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.codehaus.groovy.reflection.CachedClass (file:/Users/me/.gradle/wrapper/dists/gradle-4.3.1-bin/7yzdu24db77gi3zukl2a7o0xx/gradle-4.3.1/lib/groovy-all-2.4.12.jar) to method java.lang.Object.finalize()
WARNING: Please consider reporting this to the maintainers of org.codehaus.groovy.reflection.CachedClass
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release

------------------------------------------------------------
Gradle 4.3.1
------------------------------------------------------------

Build time:   2017-11-08 08:59:45 UTC
Revision:     e4f4804807ef7c2829da51877861ff06e07e006d

Groovy:       2.4.12
Ant:          Apache Ant(TM) version 1.9.6 compiled on June 29 2015
JVM:          9 (Oracle Corporation 9+181)
OS:           Mac OS X 10.13.1 x86_64
```

* All gradle runs were executed with on the command line.

## Behavior
### Running
Running gradle clean check results in:
```bash
./gradlew clean check

BUILD SUCCESSFUL in 3s
3 actionable tasks: 3 executed
```

### Output
XML output from pmd, found in  buld/reports/pmd is:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<pmd version="5.6.1" timestamp="2017-11-17T11:19:31.617">
<error filename="<...>/pmdTest/src/main/java/foo/HelloWorld.java" msg="Error while processing <...>/pmdTest/src/main/java/foo/HelloWorld.java"/>
</pmd>
```

Attempting to analyze the single Java class (and all other classes attempted in other projects) results in an Error.

## Analysis
### Debug
Running gradle with --debug [(full capture here)](./debugCapture.md) reveals:
```bash
net.sourceforge.pmd.PMDException: Error while processing me/repos/pmdTest/src/main/java/foo/HelloWorld.java
	at net.sourceforge.pmd.SourceCodeProcessor.processSourceCode(SourceCodeProcessor.java:103)
	at net.sourceforge.pmd.SourceCodeProcessor.processSourceCode(SourceCodeProcessor.java:52)
	at net.sourceforge.pmd.processor.PmdRunnable.call(PmdRunnable.java:88)
	at net.sourceforge.pmd.processor.MonoThreadProcessor.runAnalysis(MonoThreadProcessor.java:29)
	at net.sourceforge.pmd.processor.AbstractPMDProcessor.processFiles(AbstractPMDProcessor.java:75)
	at net.sourceforge.pmd.PMD.processFiles(PMD.java:410)
...
...
	at java.base/java.lang.Thread.run(Thread.java:844)
Caused by: java.lang.IllegalArgumentException
	at org.objectweb.asm.ClassReader.<init>(Unknown Source)
	at org.objectweb.asm.ClassReader.<init>(Unknown Source)
	at org.objectweb.asm.ClassReader.<init>(Unknown Source)
	at net.sourceforge.pmd.lang.java.typeresolution.PMDASMClassLoader.getImportedClasses(PMDASMClassLoader.java:107)
	at net.sourceforge.pmd.lang.java.typeresolution.ClassTypeResolver.populateClassName(ClassTypeResolver.java:775)
	at net.sourceforge.pmd.lang.java.typeresolution.ClassTypeResolver.visit(ClassTypeResolver.java:156)
...
...
```

This seems to indicate that asm does not accept the arguments to ClassReader.

### Dependencies
The Depedency Tree is as follows:
```
./gradlew dependencies

> Task :dependencies

------------------------------------------------------------
Root project
------------------------------------------------------------

[ A large list of tasks with no dependencies ]

pmd - The PMD libraries to be used for this project.
\--- net.sourceforge.pmd:pmd-java:5.6.1
     +--- jaxen:jaxen:1.1.6
     +--- net.java.dev.javacc:javacc:5.0
     +--- net.sourceforge.pmd:pmd-core:5.6.1
     |    +--- com.beust:jcommander:1.48
     |    +--- commons-io:commons-io:2.4
     |    +--- jaxen:jaxen:1.1.6
     |    +--- net.java.dev.javacc:javacc:5.0
     |    +--- net.sourceforge.saxon:saxon:9.1.0.8
     |    +--- org.apache.commons:commons-lang3:3.4
     |    +--- org.ow2.asm:asm:5.0.4
     |    \--- com.google.code.gson:gson:2.5
     +--- net.sourceforge.saxon:saxon:9.1.0.8
     \--- org.ow2.asm:asm:5.0.4

[ Another large list of tasks with no dependencies ]

(*) - dependencies omitted (listed previously)


BUILD SUCCESSFUL in 1s
1 actionable task: 1 executed
```

### Searches
Searching reveals many cases of issues with asm similar to this in many other products and scenarios. In most cases those issues were resolved with the release of asm5.0.3
asm5.0.4 is in use here. Attempts were made to exclude asm5.0.4 and use asm6.0. These did not function either, though the actual use of 6.0 was not confirmed.
