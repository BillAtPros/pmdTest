
# Capture of ./gradlew -debug clean check
```bash
11:26:43.381 [INFO] [org.gradle.internal.nativeintegration.services.NativeServices] Initialized native services in: me/.gradle/native
11:26:43.586 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClient] Executing build dc3d502c-478f-49eb-98c4-23f3356489a7.1 in daemon client {pid=61175}
11:26:43.612 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface utun0
11:26:43.613 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
11:26:43.613 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a multicast interface? true
11:26:43.614 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote address /fe80:0:0:0:eec9:77dc:bebe:3a10%utun0
11:26:43.614 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote multicast interface utun0
11:26:43.615 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface awdl0
11:26:43.616 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
11:26:43.616 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a multicast interface? true
11:26:43.616 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote address /fe80:0:0:0:7075:4dff:fe26:151c%awdl0
11:26:43.617 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote multicast interface awdl0
11:26:43.617 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface gpd0
11:26:43.617 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
11:26:43.617 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a multicast interface? true
11:26:43.618 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote address /10.102.113.36
11:26:43.618 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote multicast interface gpd0
11:26:43.618 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface en0
11:26:43.619 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
11:26:43.619 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a multicast interface? true
11:26:43.619 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote address /fe80:0:0:0:14a0:c217:77ae:59b5%en0
11:26:43.620 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote address /172.31.200.148
11:26:43.620 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote multicast interface en0
11:26:43.620 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface lo0
11:26:43.621 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? true
11:26:43.621 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a multicast interface? true
11:26:43.621 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Ignoring remote address on loopback interface /fe80:0:0:0:0:0:0:1%lo0
11:26:43.622 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding loopback address /0:0:0:0:0:0:0:1%lo0
11:26:43.622 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding loopback address /127.0.0.1
11:26:43.622 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding loopback multicast interface lo0
11:26:43.640 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
11:26:43.645 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
11:26:43.654 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
11:26:43.659 [DEBUG] [org.gradle.internal.remote.internal.inet.TcpOutgoingConnector] Attempting to connect to [66d8ab91-38b0-46e8-af84-306e8f30995d port:65347, addresses:[/0:0:0:0:0:0:0:1, /127.0.0.1]].
11:26:43.660 [DEBUG] [org.gradle.internal.remote.internal.inet.TcpOutgoingConnector] Trying to connect to address /0:0:0:0:0:0:0:1.
11:26:43.677 [DEBUG] [org.gradle.internal.remote.internal.inet.TcpOutgoingConnector] Connected to address /0:0:0:0:0:0:0:1:65347.
11:26:43.723 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClient] Connected to daemon DaemonInfo{pid=60000, address=[66d8ab91-38b0-46e8-af84-306e8f30995d port:65347, addresses:[/0:0:0:0:0:0:0:1, /127.0.0.1]], state=Idle, lastBusy=1510939169800, context=DefaultDaemonContext[uid=3e904587-e12a-4690-8f94-2f2d1d48b174,javaHome=/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home,daemonRegistryDir=me/.gradle/daemon,pid=60000,idleTimeout=10800000,daemonOpts=-XX:+HeapDumpOnOutOfMemoryError,-Xmx1024m,-Dfile.encoding=UTF-8,-Duser.country=US,-Duser.language=en,-Duser.variant]}. Dispatching request Build{id=dc3d502c-478f-49eb-98c4-23f3356489a7.1, currentDir=me/repos/pmdTest}.
11:26:43.723 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClientConnection] thread 1: dispatching class org.gradle.launcher.daemon.protocol.Build
11:26:43.876 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClient] Received result org.gradle.launcher.daemon.protocol.BuildStarted@12ed9db6 from daemon DaemonInfo{pid=60000, address=[66d8ab91-38b0-46e8-af84-306e8f30995d port:65347, addresses:[/0:0:0:0:0:0:0:1, /127.0.0.1]], state=Idle, lastBusy=1510939169800, context=DefaultDaemonContext[uid=3e904587-e12a-4690-8f94-2f2d1d48b174,javaHome=/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home,daemonRegistryDir=me/.gradle/daemon,pid=60000,idleTimeout=10800000,daemonOpts=-XX:+HeapDumpOnOutOfMemoryError,-Xmx1024m,-Dfile.encoding=UTF-8,-Duser.country=US,-Duser.language=en,-Duser.variant]} (build should be starting).
11:26:43.868 [INFO] [org.gradle.launcher.daemon.server.exec.LogToClient] The client will now receive all logging from the daemon (pid: 60000). The daemon log file: me/.gradle/daemon/4.3.1/daemon-60000.out.log
11:26:43.872 [INFO] [org.gradle.launcher.daemon.server.exec.LogAndCheckHealth] Starting 4th build in daemon [uptime: 12 mins 40.512 secs, performance: 99%, no major garbage collections]
11:26:43.874 [DEBUG] [org.gradle.launcher.daemon.server.exec.ExecuteBuild] The daemon has started executing the build.
11:26:43.874 [DEBUG] [org.gradle.launcher.daemon.server.exec.ExecuteBuild] Executing build with daemon context: DefaultDaemonContext[uid=3e904587-e12a-4690-8f94-2f2d1d48b174,javaHome=/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home,daemonRegistryDir=me/.gradle/daemon,pid=60000,idleTimeout=10800000,daemonOpts=-XX:+HeapDumpOnOutOfMemoryError,-Xmx1024m,-Dfile.encoding=UTF-8,-Duser.country=US,-Duser.language=en,-Duser.variant]
11:26:43.894 [INFO] [org.gradle.internal.work.DefaultWorkerLeaseService] Using 8 worker leases.
11:26:43.906 [INFO] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for fileHashes, path me/repos/pmdTest/.gradle/4.3.1/fileHashes/fileHashes.bin, access org.gradle.cache.internal.DefaultCacheAccess@ecaeddb
11:26:43.907 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for file hash cache (me/repos/pmdTest/.gradle/4.3.1/fileHashes)
11:26:43.907 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on file hash cache (me/repos/pmdTest/.gradle/4.3.1/fileHashes).
11:26:43.915 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on file hash cache (me/repos/pmdTest/.gradle/4.3.1/fileHashes).
11:26:43.931 [INFO] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for plugin-use-metadata, path me/.gradle/caches/4.3.1/plugin-resolution/plugin-use-metadata.bin, access org.gradle.cache.internal.DefaultCacheAccess@704495b0
11:26:43.932 [INFO] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for client-status, path me/.gradle/caches/4.3.1/plugin-resolution/client-status.bin, access org.gradle.cache.internal.DefaultCacheAccess@704495b0
11:26:44.047 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Run build' started
11:26:44.049 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1 started (1 worker(s) in use).
11:26:44.049 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 3: acquired lock on root.1
11:26:44.050 [INFO] [org.gradle.internal.buildevents.BuildLogger] Starting Build
11:26:44.051 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Gradle user home: me/.gradle
11:26:44.052 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Current dir: me/repos/pmdTest
11:26:44.052 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Settings file: null
11:26:44.052 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Build file: null
11:26:44.053 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Load build' started
11:26:44.055 [DEBUG] [org.gradle.initialization.buildsrc.BuildSourceBuilder] Starting to build the build sources.
11:26:44.055 [DEBUG] [org.gradle.initialization.buildsrc.BuildSourceBuilder] Gradle source dir does not exist. We leave.
11:26:44.056 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Evaluate settings' started
11:26:44.058 [DEBUG] [org.gradle.initialization.DefaultGradlePropertiesLoader] Found env project properties: []
11:26:44.058 [DEBUG] [org.gradle.initialization.DefaultGradlePropertiesLoader] Found system project properties: []
11:26:44.070 [DEBUG] [org.gradle.initialization.ScriptEvaluatingSettingsProcessor] Timing: Processing settings took: 0.011 secs
11:26:44.071 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Evaluate settings'
11:26:44.073 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Evaluate settings' completed
11:26:44.076 [INFO] [org.gradle.internal.buildevents.BuildLogger] Settings evaluated using settings file '/master/settings.gradle'.
11:26:44.076 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Load build'
11:26:44.076 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Load build' completed
11:26:44.076 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Configure build' started
11:26:44.077 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Load projects' started
11:26:44.078 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element '<root>' from state Registered to Created
11:26:44.078 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element '<root>' to state Discovered.
11:26:44.079 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element '<root>' to state Created.
11:26:44.081 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks' (hidden = false)
11:26:44.081 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks' from state Registered to Created
11:26:44.082 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks' rule action Project.<init>.tasks()
11:26:44.082 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks using Project.<init>.tasks()
11:26:44.082 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks' to state Discovered.
11:26:44.082 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks' rule action Project.<init>.tasks()
11:26:44.082 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks using Project.<init>.tasks()
11:26:44.083 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks' to state Created.
11:26:44.083 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'serviceRegistry' (hidden = true)
11:26:44.083 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'buildDir' (hidden = true)
11:26:44.083 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'projectIdentifier' (hidden = true)
11:26:44.083 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'extensionContainer' (hidden = true)
11:26:44.084 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'fileOperations' (hidden = true)
11:26:44.085 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'sourceDirectorySetFactory' (hidden = true)
11:26:44.085 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'taskFactory' (hidden = true)
11:26:44.085 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'instantiator' (hidden = true)
11:26:44.086 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'typeConverter' (hidden = true)
11:26:44.086 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'nodeInitializerRegistry' (hidden = true)
11:26:44.086 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'structBindingsStore' (hidden = true)
11:26:44.087 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'proxyFactory' (hidden = true)
11:26:44.087 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'schemaStore' (hidden = true)
11:26:44.088 [DEBUG] [org.gradle.initialization.ProjectPropertySettingBuildLoader] Looking for project properties from: me/repos/pmdTest/gradle.properties
11:26:44.088 [DEBUG] [org.gradle.initialization.ProjectPropertySettingBuildLoader] project property file does not exists. We continue!
11:26:44.088 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Load projects'
11:26:44.088 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Load projects' completed
11:26:44.090 [INFO] [org.gradle.internal.buildevents.BuildLogger] Projects loaded. Root project using build file 'me/repos/pmdTest/build.gradle'.
11:26:44.090 [INFO] [org.gradle.internal.buildevents.BuildLogger] Included projects: [root project 'pmdTest']
11:26:44.091 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Execute 'rootProject {}' action' started
11:26:44.091 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Cross-configure project :' started
11:26:44.091 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Cross-configure project :'
11:26:44.091 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Cross-configure project :' completed
11:26:44.091 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Execute 'rootProject {}' action'
11:26:44.091 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Execute 'rootProject {}' action' completed
11:26:44.092 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Configure project :' started
11:26:44.093 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.init' (hidden = false)
11:26:44.093 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.wrapper' (hidden = false)
11:26:44.103 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.help-tasks to root project 'pmdTest'' started
11:26:44.103 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.help' (hidden = false)
11:26:44.103 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.projects' (hidden = false)
11:26:44.104 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.tasks' (hidden = false)
11:26:44.104 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.properties' (hidden = false)
11:26:44.104 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.dependencyInsight' (hidden = false)
11:26:44.104 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.dependencies' (hidden = false)
11:26:44.104 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.buildEnvironment' (hidden = false)
11:26:44.104 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.components' (hidden = false)
11:26:44.105 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.model' (hidden = false)
11:26:44.105 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.dependentComponents' (hidden = false)
11:26:44.105 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.help-tasks to root project 'pmdTest''
11:26:44.105 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.help-tasks to root project 'pmdTest'' completed
11:26:44.105 [INFO] [org.gradle.configuration.project.BuildScriptProcessor] Evaluating root project 'pmdTest' using build file 'me/repos/pmdTest/build.gradle'.
11:26:44.106 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply script build.gradle to root project 'pmdTest'' started
11:26:44.112 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.java to root project 'pmdTest'' started
11:26:44.112 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.JavaBasePlugin to root project 'pmdTest'' started
11:26:44.113 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.BasePlugin to root project 'pmdTest'' started
11:26:44.114 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.language.base.plugins.LifecycleBasePlugin to root project 'pmdTest'' started
11:26:44.114 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.clean' (hidden = false)
11:26:44.114 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.assemble' (hidden = false)
11:26:44.114 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.check' (hidden = false)
11:26:44.114 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.build' (hidden = false)
11:26:44.114 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.language.base.plugins.LifecycleBasePlugin to root project 'pmdTest''
11:26:44.115 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.language.base.plugins.LifecycleBasePlugin to root project 'pmdTest'' completed
11:26:44.117 [DEBUG] [org.gradle.api.internal.artifacts.mvnsettings.DefaultLocalMavenRepositoryLocator] No local repository in Settings file defined. Using default path: me/.m2/repository
11:26:44.118 [INFO] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for metadata-1.1/results, path me/.gradle/caches/transforms-1/metadata-1.1/results.bin, access org.gradle.cache.internal.DefaultCacheAccess@30382431
11:26:44.118 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for Artifact transforms cache (me/.gradle/caches/transforms-1)
11:26:44.119 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on Artifact transforms cache (me/.gradle/caches/transforms-1).
11:26:44.119 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on Artifact transforms cache (me/.gradle/caches/transforms-1).
11:26:44.127 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.assemble' from state Registered to Initialized
11:26:44.128 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.assemble' rule action tasks.addPlaceholderAction(assemble)
11:26:44.128 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.assemble using tasks.addPlaceholderAction(assemble)
11:26:44.128 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.assemble' to state Discovered.
11:26:44.128 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.assemble' rule action tasks.addPlaceholderAction(assemble)
11:26:44.129 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.assemble using tasks.addPlaceholderAction(assemble)
11:26:44.132 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.assemble' to state Created.
11:26:44.132 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.assemble' to state DefaultsApplied.
11:26:44.132 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.assemble' rule action copyToTaskContainer
11:26:44.132 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.assemble using copyToTaskContainer
11:26:44.133 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.assemble' to state Initialized.
11:26:44.133 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.api.plugins.BasePlugin to root project 'pmdTest''
11:26:44.133 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.BasePlugin to root project 'pmdTest'' completed
11:26:44.133 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.ReportingBasePlugin to root project 'pmdTest'' started
11:26:44.134 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.api.plugins.ReportingBasePlugin to root project 'pmdTest''
11:26:44.134 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.ReportingBasePlugin to root project 'pmdTest'' completed
11:26:44.134 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.language.base.plugins.LanguageBasePlugin to root project 'pmdTest'' started
11:26:44.134 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.platform.base.plugins.ComponentBasePlugin to root project 'pmdTest'' started
11:26:44.135 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'componentSpecFactory' (hidden = true)
11:26:44.135 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'components' (hidden = false)
11:26:44.135 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.platform.base.plugins.ComponentBasePlugin to root project 'pmdTest''
11:26:44.136 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.platform.base.plugins.ComponentBasePlugin to root project 'pmdTest'' completed
11:26:44.136 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'sources' (hidden = false)
11:26:44.136 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.language.base.plugins.LanguageBasePlugin to root project 'pmdTest''
11:26:44.136 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.language.base.plugins.LanguageBasePlugin to root project 'pmdTest'' completed
11:26:44.136 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.platform.base.plugins.BinaryBasePlugin to root project 'pmdTest'' started
11:26:44.136 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'binaries' (hidden = false)
11:26:44.137 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.platform.base.plugins.BinaryBasePlugin to root project 'pmdTest''
11:26:44.137 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.platform.base.plugins.BinaryBasePlugin to root project 'pmdTest'' completed
11:26:44.137 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'bridgedBinaries' (hidden = true)
11:26:44.138 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.buildNeeded' (hidden = false)
11:26:44.138 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.buildDependents' (hidden = false)
11:26:44.144 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.api.plugins.JavaBasePlugin to root project 'pmdTest''
11:26:44.144 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.JavaBasePlugin to root project 'pmdTest'' completed
11:26:44.152 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.processResources' (hidden = false)
11:26:44.154 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.compileJava' (hidden = false)
11:26:44.155 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.classes' (hidden = false)
11:26:44.158 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.processTestResources' (hidden = false)
11:26:44.158 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.compileTestJava' (hidden = false)
11:26:44.158 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.testClasses' (hidden = false)
11:26:44.161 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.javadoc' (hidden = false)
11:26:44.170 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.test' (hidden = false)
11:26:44.170 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.check' from state Registered to Initialized
11:26:44.170 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.check' rule action tasks.addPlaceholderAction(check)
11:26:44.170 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.check using tasks.addPlaceholderAction(check)
11:26:44.170 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.check' to state Discovered.
11:26:44.170 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.check' rule action tasks.addPlaceholderAction(check)
11:26:44.170 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.check using tasks.addPlaceholderAction(check)
11:26:44.171 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.check' to state Created.
11:26:44.171 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.check' to state DefaultsApplied.
11:26:44.171 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.check' rule action copyToTaskContainer
11:26:44.171 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.check using copyToTaskContainer
11:26:44.171 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.check' to state Initialized.
11:26:44.173 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.jar' (hidden = false)
11:26:44.174 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.java to root project 'pmdTest''
11:26:44.174 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.java to root project 'pmdTest'' completed
11:26:44.175 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.pmd to root project 'pmdTest'' started
11:26:44.179 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.pmdMain' (hidden = false)
11:26:44.181 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.pmdTest' (hidden = false)
11:26:44.181 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.pmd to root project 'pmdTest''
11:26:44.181 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.pmd to root project 'pmdTest'' completed
11:26:44.185 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'tasks.wrapper' (hidden = false)
11:26:44.186 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Apply script build.gradle to root project 'pmdTest''
11:26:44.187 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Apply script build.gradle to root project 'pmdTest'' completed
11:26:44.187 [DEBUG] [org.gradle.configuration.project.BuildScriptProcessor] Timing: Running the build script took 0.081 secs
11:26:44.187 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Configure project :'
11:26:44.187 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Configure project :' completed
11:26:44.187 [INFO] [org.gradle.internal.buildevents.BuildLogger] All projects evaluated.
11:26:44.188 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Configure build'
11:26:44.188 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Configure build' completed
11:26:44.188 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Calculate task graph' started
11:26:44.188 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks' from state Created to SelfClosed
11:26:44.188 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks' to state DefaultsApplied.
11:26:44.188 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks' to state Initialized.
11:26:44.191 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries' rule action BinaryBasePlugin.Rules#binaries(BinaryContainer)
11:26:44.191 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries using BinaryBasePlugin.Rules#binaries(BinaryContainer)
11:26:44.191 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries' to state Discovered.
11:26:44.192 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'bridgedBinaries' rule action JavaBasePlugin.apply()
11:26:44.192 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating bridgedBinaries using JavaBasePlugin.apply()
11:26:44.192 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'bridgedBinaries' to state Discovered.
11:26:44.192 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'buildDir' rule action Project.<init>.buildDir()
11:26:44.192 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating buildDir using Project.<init>.buildDir()
11:26:44.193 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'buildDir' to state Discovered.
11:26:44.193 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'componentSpecFactory' rule action ComponentBasePlugin.PluginRules#componentSpecFactory(ProjectIdentifier, Instantiator, ITaskFactory, SourceDirectorySetFactory)
11:26:44.193 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating componentSpecFactory using ComponentBasePlugin.PluginRules#componentSpecFactory(ProjectIdentifier, Instantiator, ITaskFactory, SourceDirectorySetFactory)
11:26:44.193 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'componentSpecFactory' to state Discovered.
11:26:44.193 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'components' rule action ComponentBasePlugin.PluginRules#components(ComponentSpecContainer)
11:26:44.193 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating components using ComponentBasePlugin.PluginRules#components(ComponentSpecContainer)
11:26:44.193 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'components' to state Discovered.
11:26:44.194 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'extensionContainer' rule action Project.<init>.extensionContainer()
11:26:44.194 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating extensionContainer using Project.<init>.extensionContainer()
11:26:44.194 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'extensionContainer' to state Discovered.
11:26:44.194 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'fileOperations' rule action DefaultProject.BasicServicesRules#fileOperations(ServiceRegistry)
11:26:44.194 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating fileOperations using DefaultProject.BasicServicesRules#fileOperations(ServiceRegistry)
11:26:44.194 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'fileOperations' to state Discovered.
11:26:44.194 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'instantiator' rule action DefaultProject.BasicServicesRules#instantiator(ServiceRegistry)
11:26:44.194 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating instantiator using DefaultProject.BasicServicesRules#instantiator(ServiceRegistry)
11:26:44.194 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'instantiator' to state Discovered.
11:26:44.195 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'nodeInitializerRegistry' rule action DefaultProject.BasicServicesRules#nodeInitializerRegistry(ModelSchemaStore, StructBindingsStore)
11:26:44.195 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating nodeInitializerRegistry using DefaultProject.BasicServicesRules#nodeInitializerRegistry(ModelSchemaStore, StructBindingsStore)
11:26:44.195 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'nodeInitializerRegistry' to state Discovered.
11:26:44.195 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'projectIdentifier' rule action Project.<init>.projectIdentifier()
11:26:44.195 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating projectIdentifier using Project.<init>.projectIdentifier()
11:26:44.196 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'projectIdentifier' to state Discovered.
11:26:44.196 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'proxyFactory' rule action DefaultProject.BasicServicesRules#proxyFactory(ServiceRegistry)
11:26:44.196 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating proxyFactory using DefaultProject.BasicServicesRules#proxyFactory(ServiceRegistry)
11:26:44.196 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'proxyFactory' to state Discovered.
11:26:44.196 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'schemaStore' rule action DefaultProject.BasicServicesRules#schemaStore(ServiceRegistry)
11:26:44.197 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating schemaStore using DefaultProject.BasicServicesRules#schemaStore(ServiceRegistry)
11:26:44.197 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'schemaStore' to state Discovered.
11:26:44.197 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'serviceRegistry' rule action Project.<init>.serviceRegistry()
11:26:44.197 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating serviceRegistry using Project.<init>.serviceRegistry()
11:26:44.197 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'serviceRegistry' to state Discovered.
11:26:44.197 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'sourceDirectorySetFactory' rule action DefaultProject.BasicServicesRules#sourceDirectorySetFactory(ServiceRegistry)
11:26:44.198 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating sourceDirectorySetFactory using DefaultProject.BasicServicesRules#sourceDirectorySetFactory(ServiceRegistry)
11:26:44.198 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'sourceDirectorySetFactory' to state Discovered.
11:26:44.198 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'sources' rule action LanguageBasePlugin.Rules#sources(Instantiator)
11:26:44.198 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating sources using LanguageBasePlugin.Rules#sources(Instantiator)
11:26:44.198 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'sources' to state Discovered.
11:26:44.198 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'structBindingsStore' rule action DefaultProject.BasicServicesRules#structBindingsStore(ServiceRegistry)
11:26:44.199 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating structBindingsStore using DefaultProject.BasicServicesRules#structBindingsStore(ServiceRegistry)
11:26:44.199 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'structBindingsStore' to state Discovered.
11:26:44.199 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'taskFactory' rule action DefaultProject.BasicServicesRules#taskFactory(ServiceRegistry)
11:26:44.199 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating taskFactory using DefaultProject.BasicServicesRules#taskFactory(ServiceRegistry)
11:26:44.199 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'taskFactory' to state Discovered.
11:26:44.199 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'typeConverter' rule action DefaultProject.BasicServicesRules#typeConverter(ServiceRegistry)
11:26:44.199 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating typeConverter using DefaultProject.BasicServicesRules#typeConverter(ServiceRegistry)
11:26:44.199 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'typeConverter' to state Discovered.
11:26:44.201 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'serviceRegistry' rule action Project.<init>.serviceRegistry()
11:26:44.201 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating serviceRegistry using Project.<init>.serviceRegistry()
11:26:44.201 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'serviceRegistry' to state Created.
11:26:44.201 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'serviceRegistry' to state DefaultsApplied.
11:26:44.202 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'serviceRegistry' to state Initialized.
11:26:44.202 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'serviceRegistry' to state Mutated.
11:26:44.202 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'serviceRegistry' to state Finalized.
11:26:44.202 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'serviceRegistry' to state SelfClosed.
11:26:44.202 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'serviceRegistry' to state GraphClosed.
11:26:44.202 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'schemaStore' rule action DefaultProject.BasicServicesRules#schemaStore(ServiceRegistry)
11:26:44.202 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating schemaStore using DefaultProject.BasicServicesRules#schemaStore(ServiceRegistry)
11:26:44.203 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'schemaStore' to state Created.
11:26:44.203 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'schemaStore' to state DefaultsApplied.
11:26:44.203 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'schemaStore' to state Initialized.
11:26:44.203 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'schemaStore' to state Mutated.
11:26:44.203 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'schemaStore' to state Finalized.
11:26:44.203 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'schemaStore' to state SelfClosed.
11:26:44.204 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'schemaStore' to state GraphClosed.
11:26:44.204 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'structBindingsStore' rule action DefaultProject.BasicServicesRules#structBindingsStore(ServiceRegistry)
11:26:44.204 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating structBindingsStore using DefaultProject.BasicServicesRules#structBindingsStore(ServiceRegistry)
11:26:44.204 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'structBindingsStore' to state Created.
11:26:44.204 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'structBindingsStore' to state DefaultsApplied.
11:26:44.205 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'structBindingsStore' to state Initialized.
11:26:44.205 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'structBindingsStore' to state Mutated.
11:26:44.205 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'structBindingsStore' to state Finalized.
11:26:44.205 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'structBindingsStore' to state SelfClosed.
11:26:44.205 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'structBindingsStore' to state GraphClosed.
11:26:44.205 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'nodeInitializerRegistry' rule action DefaultProject.BasicServicesRules#nodeInitializerRegistry(ModelSchemaStore, StructBindingsStore)
11:26:44.206 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating nodeInitializerRegistry using DefaultProject.BasicServicesRules#nodeInitializerRegistry(ModelSchemaStore, StructBindingsStore)
11:26:44.206 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'nodeInitializerRegistry' to state Created.
11:26:44.206 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'nodeInitializerRegistry' to state DefaultsApplied.
11:26:44.206 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'nodeInitializerRegistry' to state Initialized.
11:26:44.207 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'projectIdentifier' rule action Project.<init>.projectIdentifier()
11:26:44.207 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating projectIdentifier using Project.<init>.projectIdentifier()
11:26:44.207 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'projectIdentifier' to state Created.
11:26:44.207 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'projectIdentifier' to state DefaultsApplied.
11:26:44.207 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'projectIdentifier' to state Initialized.
11:26:44.207 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'projectIdentifier' to state Mutated.
11:26:44.207 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'projectIdentifier' to state Finalized.
11:26:44.207 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'projectIdentifier' to state SelfClosed.
11:26:44.208 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'projectIdentifier' to state GraphClosed.
11:26:44.208 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'instantiator' rule action DefaultProject.BasicServicesRules#instantiator(ServiceRegistry)
11:26:44.208 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating instantiator using DefaultProject.BasicServicesRules#instantiator(ServiceRegistry)
11:26:44.208 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'instantiator' to state Created.
11:26:44.208 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'instantiator' to state DefaultsApplied.
11:26:44.209 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'instantiator' to state Initialized.
11:26:44.209 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'instantiator' to state Mutated.
11:26:44.209 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'instantiator' to state Finalized.
11:26:44.209 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'instantiator' to state SelfClosed.
11:26:44.209 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'instantiator' to state GraphClosed.
11:26:44.210 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'taskFactory' rule action DefaultProject.BasicServicesRules#taskFactory(ServiceRegistry)
11:26:44.210 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating taskFactory using DefaultProject.BasicServicesRules#taskFactory(ServiceRegistry)
11:26:44.210 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'taskFactory' to state Created.
11:26:44.210 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'taskFactory' to state DefaultsApplied.
11:26:44.211 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'taskFactory' to state Initialized.
11:26:44.211 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'taskFactory' to state Mutated.
11:26:44.211 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'taskFactory' to state Finalized.
11:26:44.211 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'taskFactory' to state SelfClosed.
11:26:44.211 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'taskFactory' to state GraphClosed.
11:26:44.212 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'sourceDirectorySetFactory' rule action DefaultProject.BasicServicesRules#sourceDirectorySetFactory(ServiceRegistry)
11:26:44.212 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating sourceDirectorySetFactory using DefaultProject.BasicServicesRules#sourceDirectorySetFactory(ServiceRegistry)
11:26:44.212 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'sourceDirectorySetFactory' to state Created.
11:26:44.212 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'sourceDirectorySetFactory' to state DefaultsApplied.
11:26:44.212 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'sourceDirectorySetFactory' to state Initialized.
11:26:44.212 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'sourceDirectorySetFactory' to state Mutated.
11:26:44.213 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'sourceDirectorySetFactory' to state Finalized.
11:26:44.213 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'sourceDirectorySetFactory' to state SelfClosed.
11:26:44.213 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'sourceDirectorySetFactory' to state GraphClosed.
11:26:44.213 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'componentSpecFactory' rule action ComponentBasePlugin.PluginRules#componentSpecFactory(ProjectIdentifier, Instantiator, ITaskFactory, SourceDirectorySetFactory)
11:26:44.213 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating componentSpecFactory using ComponentBasePlugin.PluginRules#componentSpecFactory(ProjectIdentifier, Instantiator, ITaskFactory, SourceDirectorySetFactory)
11:26:44.214 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'componentSpecFactory' to state Created.
11:26:44.214 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'componentSpecFactory' to state DefaultsApplied.
11:26:44.214 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'componentSpecFactory' to state Initialized.
11:26:44.215 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'componentSpecFactory' rule action ComponentBasePlugin.PluginRules#registerComponentSpec(TypeBuilder<ComponentSpec>)
11:26:44.215 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating componentSpecFactory using ComponentBasePlugin.PluginRules#registerComponentSpec(TypeBuilder<ComponentSpec>)
11:26:44.215 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'componentSpecFactory' rule action LanguageBasePlugin.Rules#registerBaseLanguageSourceSet(TypeBuilder<LanguageSourceSet>)
11:26:44.215 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating componentSpecFactory using LanguageBasePlugin.Rules#registerBaseLanguageSourceSet(TypeBuilder<LanguageSourceSet>)
11:26:44.216 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'componentSpecFactory' rule action BinaryBasePlugin.Rules#registerBaseBinarySpec(TypeBuilder<BinarySpec>)
11:26:44.216 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating componentSpecFactory using BinaryBasePlugin.Rules#registerBaseBinarySpec(TypeBuilder<BinarySpec>)
11:26:44.216 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'componentSpecFactory' to state Mutated.
11:26:44.216 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'componentSpecFactory' to state Finalized.
11:26:44.216 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'componentSpecFactory' rule action ComponentBasePlugin.PluginRules#validateComponentSpecRegistrations(ComponentSpecFactory)
11:26:44.217 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating componentSpecFactory using ComponentBasePlugin.PluginRules#validateComponentSpecRegistrations(ComponentSpecFactory)
11:26:44.217 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'componentSpecFactory' to state SelfClosed.
11:26:44.217 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'componentSpecFactory' to state GraphClosed.
11:26:44.217 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'nodeInitializerRegistry' rule action ComponentBasePlugin.PluginRules#registerNodeInitializerExtractors(NodeInitializerRegistry, ComponentSpecFactory, StructBindingsStore)
11:26:44.217 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating nodeInitializerRegistry using ComponentBasePlugin.PluginRules#registerNodeInitializerExtractors(NodeInitializerRegistry, ComponentSpecFactory, StructBindingsStore)
11:26:44.218 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'nodeInitializerRegistry' to state Mutated.
11:26:44.218 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'nodeInitializerRegistry' to state Finalized.
11:26:44.218 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'nodeInitializerRegistry' to state SelfClosed.
11:26:44.218 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'nodeInitializerRegistry' to state GraphClosed.
11:26:44.218 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries' rule action BinaryBasePlugin.Rules#binaries(BinaryContainer)
11:26:44.218 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries using BinaryBasePlugin.Rules#binaries(BinaryContainer)
11:26:44.219 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries' to state Created.
11:26:44.219 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries' to state DefaultsApplied.
11:26:44.219 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries' rule action BinaryBasePlugin.Rules#binaries(BinaryContainer)
11:26:44.219 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries using BinaryBasePlugin.Rules#binaries(BinaryContainer)
11:26:44.220 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries' to state Initialized.
11:26:44.220 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'bridgedBinaries' rule action JavaBasePlugin.apply()
11:26:44.220 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating bridgedBinaries using JavaBasePlugin.apply()
11:26:44.220 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'bridgedBinaries' to state Created.
11:26:44.220 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'bridgedBinaries' to state DefaultsApplied.
11:26:44.220 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'bridgedBinaries' to state Initialized.
11:26:44.220 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'bridgedBinaries' to state Mutated.
11:26:44.220 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'bridgedBinaries' to state Finalized.
11:26:44.220 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'bridgedBinaries' to state SelfClosed.
11:26:44.221 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'bridgedBinaries' to state GraphClosed.
11:26:44.222 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries' rule action JavaBasePlugin.Rules#attachBridgedBinaries(BinaryContainer, JavaBasePlugin.BridgedBinaries)
11:26:44.222 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries using JavaBasePlugin.Rules#attachBridgedBinaries(BinaryContainer, JavaBasePlugin.BridgedBinaries)
11:26:44.222 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'binaries.main' (hidden = false)
11:26:44.222 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'binaries.test' (hidden = false)
11:26:44.223 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries' to state Mutated.
11:26:44.223 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries' to state Finalized.
11:26:44.223 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries' to state SelfClosed.
11:26:44.224 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries.main' rule action JavaBasePlugin.Rules#attachBridgedBinaries(BinaryContainer, JavaBasePlugin.BridgedBinaries) > put()
11:26:44.224 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries.main using JavaBasePlugin.Rules#attachBridgedBinaries(BinaryContainer, JavaBasePlugin.BridgedBinaries) > put()
11:26:44.224 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.main' to state Discovered.
11:26:44.224 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries.main' rule action JavaBasePlugin.Rules#attachBridgedBinaries(BinaryContainer, JavaBasePlugin.BridgedBinaries) > put()
11:26:44.224 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries.main using JavaBasePlugin.Rules#attachBridgedBinaries(BinaryContainer, JavaBasePlugin.BridgedBinaries) > put()
11:26:44.224 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.main' to state Created.
11:26:44.224 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.main' to state DefaultsApplied.
11:26:44.225 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.main' to state Initialized.
11:26:44.225 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.main' to state Mutated.
11:26:44.225 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries.main' rule action BinaryBasePlugin.Rules#defineBuildLifecycleTask(BinarySpecInternal, ITaskFactory)
11:26:44.225 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries.main using BinaryBasePlugin.Rules#defineBuildLifecycleTask(BinarySpecInternal, ITaskFactory)
11:26:44.225 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries.main' rule action BinaryBasePlugin.Rules#addSourceSetsOwnedByBinariesToTheirInputs(BinarySpecInternal)
11:26:44.225 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries.main using BinaryBasePlugin.Rules#addSourceSetsOwnedByBinariesToTheirInputs(BinarySpecInternal)
11:26:44.225 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.main' to state Finalized.
11:26:44.225 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.main' to state SelfClosed.
11:26:44.225 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.main' to state GraphClosed.
11:26:44.226 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries.test' rule action JavaBasePlugin.Rules#attachBridgedBinaries(BinaryContainer, JavaBasePlugin.BridgedBinaries) > put()
11:26:44.226 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries.test using JavaBasePlugin.Rules#attachBridgedBinaries(BinaryContainer, JavaBasePlugin.BridgedBinaries) > put()
11:26:44.226 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.test' to state Discovered.
11:26:44.226 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries.test' rule action JavaBasePlugin.Rules#attachBridgedBinaries(BinaryContainer, JavaBasePlugin.BridgedBinaries) > put()
11:26:44.226 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries.test using JavaBasePlugin.Rules#attachBridgedBinaries(BinaryContainer, JavaBasePlugin.BridgedBinaries) > put()
11:26:44.226 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.test' to state Created.
11:26:44.227 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.test' to state DefaultsApplied.
11:26:44.227 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.test' to state Initialized.
11:26:44.227 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.test' to state Mutated.
11:26:44.227 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries.test' rule action BinaryBasePlugin.Rules#defineBuildLifecycleTask(BinarySpecInternal, ITaskFactory)
11:26:44.227 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries.test using BinaryBasePlugin.Rules#defineBuildLifecycleTask(BinarySpecInternal, ITaskFactory)
11:26:44.227 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'binaries.test' rule action BinaryBasePlugin.Rules#addSourceSetsOwnedByBinariesToTheirInputs(BinarySpecInternal)
11:26:44.227 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating binaries.test using BinaryBasePlugin.Rules#addSourceSetsOwnedByBinariesToTheirInputs(BinarySpecInternal)
11:26:44.227 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.test' to state Finalized.
11:26:44.228 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.test' to state SelfClosed.
11:26:44.228 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.test' to state GraphClosed.
11:26:44.228 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries' to state GraphClosed.
11:26:44.228 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks' rule action BinaryBasePlugin.Rules#copyBinaryTasksToTaskContainer(TaskContainer, BinaryContainer)
11:26:44.228 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks using BinaryBasePlugin.Rules#copyBinaryTasksToTaskContainer(TaskContainer, BinaryContainer)
11:26:44.228 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.main' from state GraphClosed to Discovered
11:26:44.229 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.test' from state GraphClosed to Discovered
11:26:44.229 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.main' from state GraphClosed to Initialized
11:26:44.229 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.main' from state GraphClosed to Discovered
11:26:44.229 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.test' from state GraphClosed to Initialized
11:26:44.229 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'binaries.test' from state GraphClosed to Discovered
11:26:44.229 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks' to state Mutated.
11:26:44.229 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks' to state Finalized.
11:26:44.229 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks' to state SelfClosed.
11:26:44.229 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.clean' from state Registered to Initialized
11:26:44.230 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.clean' rule action tasks.addPlaceholderAction(clean)
11:26:44.230 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.clean using tasks.addPlaceholderAction(clean)
11:26:44.230 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.clean' to state Discovered.
11:26:44.230 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.clean' rule action tasks.addPlaceholderAction(clean)
11:26:44.230 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.clean using tasks.addPlaceholderAction(clean)
11:26:44.231 [DEBUG] [org.gradle.model.collection.internal.BridgedCollections] Ignoring element 'tasks' added to 'clean' after it is closed.
11:26:44.231 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.clean' to state Created.
11:26:44.231 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.clean' to state DefaultsApplied.
11:26:44.231 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.clean' rule action copyToTaskContainer
11:26:44.231 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.clean using copyToTaskContainer
11:26:44.231 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.clean' to state Initialized.
11:26:44.232 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks' from state SelfClosed to SelfClosed
11:26:44.232 [INFO] [org.gradle.execution.TaskNameResolvingBuildConfigurationAction] Selected primary task 'clean' from project :
11:26:44.232 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.clean' from state Initialized to GraphClosed
11:26:44.232 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.clean' to state Mutated.
11:26:44.232 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.clean' to state Finalized.
11:26:44.232 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.clean' to state SelfClosed.
11:26:44.232 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.clean' to state GraphClosed.
11:26:44.233 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskGraphExecuter] Timing: Creating the DAG took 0.0 secs
11:26:44.233 [INFO] [org.gradle.execution.TaskNameResolvingBuildConfigurationAction] Selected primary task 'check' from project :
11:26:44.233 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.check' from state Initialized to GraphClosed
11:26:44.233 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.check' to state Mutated.
11:26:44.233 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.check' to state Finalized.
11:26:44.233 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.check' to state SelfClosed.
11:26:44.234 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.check' to state GraphClosed.
11:26:44.234 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.test' from state Registered to GraphClosed
11:26:44.235 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.test' rule action Project.<init>.tasks.test()
11:26:44.235 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.test using Project.<init>.tasks.test()
11:26:44.235 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.test' to state Discovered.
11:26:44.235 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.test' rule action Project.<init>.tasks.test()
11:26:44.236 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.test using Project.<init>.tasks.test()
11:26:44.236 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.test' to state Created.
11:26:44.236 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.test' to state DefaultsApplied.
11:26:44.236 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.test' rule action copyToTaskContainer
11:26:44.236 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.test using copyToTaskContainer
11:26:44.236 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.test' to state Initialized.
11:26:44.236 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.test' to state Mutated.
11:26:44.236 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.test' to state Finalized.
11:26:44.236 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.test' to state SelfClosed.
11:26:44.237 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.test' to state GraphClosed.
11:26:44.238 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.classes' from state Registered to GraphClosed
11:26:44.238 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.classes' rule action Project.<init>.tasks.classes()
11:26:44.238 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.classes using Project.<init>.tasks.classes()
11:26:44.238 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.classes' to state Discovered.
11:26:44.238 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.classes' rule action Project.<init>.tasks.classes()
11:26:44.238 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.classes using Project.<init>.tasks.classes()
11:26:44.239 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.classes' to state Created.
11:26:44.239 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.classes' to state DefaultsApplied.
11:26:44.239 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.classes' rule action copyToTaskContainer
11:26:44.239 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.classes using copyToTaskContainer
11:26:44.239 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.classes' to state Initialized.
11:26:44.239 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.classes' to state Mutated.
11:26:44.239 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.classes' to state Finalized.
11:26:44.239 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.classes' to state SelfClosed.
11:26:44.240 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.classes' to state GraphClosed.
11:26:44.240 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processResources' from state Registered to GraphClosed
11:26:44.242 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.processResources' rule action Project.<init>.tasks.processResources()
11:26:44.242 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.processResources using Project.<init>.tasks.processResources()
11:26:44.242 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processResources' to state Discovered.
11:26:44.242 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.processResources' rule action Project.<init>.tasks.processResources()
11:26:44.242 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.processResources using Project.<init>.tasks.processResources()
11:26:44.242 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processResources' to state Created.
11:26:44.243 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processResources' to state DefaultsApplied.
11:26:44.243 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.processResources' rule action copyToTaskContainer
11:26:44.243 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.processResources using copyToTaskContainer
11:26:44.243 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processResources' to state Initialized.
11:26:44.243 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processResources' to state Mutated.
11:26:44.243 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processResources' to state Finalized.
11:26:44.243 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processResources' to state SelfClosed.
11:26:44.243 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processResources' to state GraphClosed.
11:26:44.245 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileJava' from state Registered to GraphClosed
11:26:44.245 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.compileJava' rule action Project.<init>.tasks.compileJava()
11:26:44.245 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.compileJava using Project.<init>.tasks.compileJava()
11:26:44.245 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileJava' to state Discovered.
11:26:44.245 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.compileJava' rule action Project.<init>.tasks.compileJava()
11:26:44.246 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.compileJava using Project.<init>.tasks.compileJava()
11:26:44.246 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileJava' to state Created.
11:26:44.246 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileJava' to state DefaultsApplied.
11:26:44.246 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.compileJava' rule action copyToTaskContainer
11:26:44.246 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.compileJava using copyToTaskContainer
11:26:44.246 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileJava' to state Initialized.
11:26:44.247 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileJava' to state Mutated.
11:26:44.247 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileJava' to state Finalized.
11:26:44.247 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileJava' to state SelfClosed.
11:26:44.247 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileJava' to state GraphClosed.
11:26:44.248 [INFO] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for annotation-processors, path me/repos/pmdTest/.gradle/4.3.1/fileContent/annotation-processors.bin, access org.gradle.cache.internal.DefaultCacheAccess@74cdff7c
11:26:44.248 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for file content cache (me/repos/pmdTest/.gradle/4.3.1/fileContent)
11:26:44.249 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on file content cache (me/repos/pmdTest/.gradle/4.3.1/fileContent).
11:26:44.249 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on file content cache (me/repos/pmdTest/.gradle/4.3.1/fileContent).
11:26:44.250 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.testClasses' from state Registered to GraphClosed
11:26:44.251 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.testClasses' rule action Project.<init>.tasks.testClasses()
11:26:44.251 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.testClasses using Project.<init>.tasks.testClasses()
11:26:44.251 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.testClasses' to state Discovered.
11:26:44.251 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.testClasses' rule action Project.<init>.tasks.testClasses()
11:26:44.251 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.testClasses using Project.<init>.tasks.testClasses()
11:26:44.251 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.testClasses' to state Created.
11:26:44.251 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.testClasses' to state DefaultsApplied.
11:26:44.251 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.testClasses' rule action copyToTaskContainer
11:26:44.251 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.testClasses using copyToTaskContainer
11:26:44.252 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.testClasses' to state Initialized.
11:26:44.252 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.testClasses' to state Mutated.
11:26:44.252 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.testClasses' to state Finalized.
11:26:44.252 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.testClasses' to state SelfClosed.
11:26:44.252 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.testClasses' to state GraphClosed.
11:26:44.252 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileTestJava' from state Registered to GraphClosed
11:26:44.252 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.compileTestJava' rule action Project.<init>.tasks.compileTestJava()
11:26:44.252 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.compileTestJava using Project.<init>.tasks.compileTestJava()
11:26:44.252 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileTestJava' to state Discovered.
11:26:44.253 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.compileTestJava' rule action Project.<init>.tasks.compileTestJava()
11:26:44.253 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.compileTestJava using Project.<init>.tasks.compileTestJava()
11:26:44.253 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileTestJava' to state Created.
11:26:44.253 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileTestJava' to state DefaultsApplied.
11:26:44.253 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.compileTestJava' rule action copyToTaskContainer
11:26:44.253 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.compileTestJava using copyToTaskContainer
11:26:44.253 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileTestJava' to state Initialized.
11:26:44.253 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileTestJava' to state Mutated.
11:26:44.253 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileTestJava' to state Finalized.
11:26:44.253 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileTestJava' to state SelfClosed.
11:26:44.253 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.compileTestJava' to state GraphClosed.
11:26:44.254 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processTestResources' from state Registered to GraphClosed
11:26:44.254 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.processTestResources' rule action Project.<init>.tasks.processTestResources()
11:26:44.254 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.processTestResources using Project.<init>.tasks.processTestResources()
11:26:44.254 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processTestResources' to state Discovered.
11:26:44.254 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.processTestResources' rule action Project.<init>.tasks.processTestResources()
11:26:44.254 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.processTestResources using Project.<init>.tasks.processTestResources()
11:26:44.254 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processTestResources' to state Created.
11:26:44.254 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processTestResources' to state DefaultsApplied.
11:26:44.255 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.processTestResources' rule action copyToTaskContainer
11:26:44.255 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.processTestResources using copyToTaskContainer
11:26:44.255 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processTestResources' to state Initialized.
11:26:44.255 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processTestResources' to state Mutated.
11:26:44.255 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processTestResources' to state Finalized.
11:26:44.255 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processTestResources' to state SelfClosed.
11:26:44.255 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.processTestResources' to state GraphClosed.
11:26:44.255 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdTest' from state Registered to GraphClosed
11:26:44.255 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.pmdTest' rule action Project.<init>.tasks.pmdTest()
11:26:44.256 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.pmdTest using Project.<init>.tasks.pmdTest()
11:26:44.256 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdTest' to state Discovered.
11:26:44.256 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.pmdTest' rule action Project.<init>.tasks.pmdTest()
11:26:44.256 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.pmdTest using Project.<init>.tasks.pmdTest()
11:26:44.256 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdTest' to state Created.
11:26:44.256 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdTest' to state DefaultsApplied.
11:26:44.256 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.pmdTest' rule action copyToTaskContainer
11:26:44.256 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.pmdTest using copyToTaskContainer
11:26:44.256 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdTest' to state Initialized.
11:26:44.256 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdTest' to state Mutated.
11:26:44.257 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdTest' to state Finalized.
11:26:44.257 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdTest' to state SelfClosed.
11:26:44.257 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdTest' to state GraphClosed.
11:26:44.259 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdMain' from state Registered to GraphClosed
11:26:44.260 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.pmdMain' rule action Project.<init>.tasks.pmdMain()
11:26:44.260 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.pmdMain using Project.<init>.tasks.pmdMain()
11:26:44.260 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdMain' to state Discovered.
11:26:44.260 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.pmdMain' rule action Project.<init>.tasks.pmdMain()
11:26:44.260 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.pmdMain using Project.<init>.tasks.pmdMain()
11:26:44.260 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdMain' to state Created.
11:26:44.260 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdMain' to state DefaultsApplied.
11:26:44.261 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.pmdMain' rule action copyToTaskContainer
11:26:44.261 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.pmdMain using copyToTaskContainer
11:26:44.261 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdMain' to state Initialized.
11:26:44.261 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdMain' to state Mutated.
11:26:44.261 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdMain' to state Finalized.
11:26:44.261 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdMain' to state SelfClosed.
11:26:44.261 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.pmdMain' to state GraphClosed.
11:26:44.262 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskGraphExecuter] Timing: Creating the DAG took 0.029 secs
11:26:44.263 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Calculate task graph'
11:26:44.263 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Calculate task graph' completed
11:26:44.264 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Run tasks' started
11:26:44.264 [INFO] [org.gradle.internal.buildevents.BuildLogger] Tasks to be executed: [task ':clean', task ':compileJava', task ':processResources', task ':classes', task ':pmdMain', task ':compileTestJava', task ':processTestResources', task ':testClasses', task ':pmdTest', task ':test', task ':check']
11:26:44.267 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.build' rule action tasks.addPlaceholderAction(build)
11:26:44.268 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.build using tasks.addPlaceholderAction(build)
11:26:44.268 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.build' to state Discovered.
11:26:44.268 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.buildDependents' rule action Project.<init>.tasks.buildDependents()
11:26:44.268 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.buildDependents using Project.<init>.tasks.buildDependents()
11:26:44.269 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.buildDependents' to state Discovered.
11:26:44.269 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.buildEnvironment' rule action tasks.addPlaceholderAction(buildEnvironment)
11:26:44.269 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.buildEnvironment using tasks.addPlaceholderAction(buildEnvironment)
11:26:44.269 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.buildEnvironment' to state Discovered.
11:26:44.270 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.buildNeeded' rule action Project.<init>.tasks.buildNeeded()
11:26:44.270 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.buildNeeded using Project.<init>.tasks.buildNeeded()
11:26:44.270 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.buildNeeded' to state Discovered.
11:26:44.270 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.components' rule action tasks.addPlaceholderAction(components)
11:26:44.270 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.components using tasks.addPlaceholderAction(components)
11:26:44.270 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.components' to state Discovered.
11:26:44.271 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.dependencies' rule action tasks.addPlaceholderAction(dependencies)
11:26:44.271 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.dependencies using tasks.addPlaceholderAction(dependencies)
11:26:44.271 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.dependencies' to state Discovered.
11:26:44.271 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.dependencyInsight' rule action tasks.addPlaceholderAction(dependencyInsight)
11:26:44.271 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.dependencyInsight using tasks.addPlaceholderAction(dependencyInsight)
11:26:44.271 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.dependencyInsight' to state Discovered.
11:26:44.272 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.dependentComponents' rule action tasks.addPlaceholderAction(dependentComponents)
11:26:44.272 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.dependentComponents using tasks.addPlaceholderAction(dependentComponents)
11:26:44.272 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.dependentComponents' to state Discovered.
11:26:44.272 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.help' rule action tasks.addPlaceholderAction(help)
11:26:44.272 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.help using tasks.addPlaceholderAction(help)
11:26:44.272 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.help' to state Discovered.
11:26:44.273 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.init' rule action tasks.addPlaceholderAction(init)
11:26:44.273 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.init using tasks.addPlaceholderAction(init)
11:26:44.273 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.init' to state Discovered.
11:26:44.273 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.jar' rule action Project.<init>.tasks.jar()
11:26:44.273 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.jar using Project.<init>.tasks.jar()
11:26:44.273 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.jar' to state Discovered.
11:26:44.273 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.javadoc' rule action Project.<init>.tasks.javadoc()
11:26:44.273 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.javadoc using Project.<init>.tasks.javadoc()
11:26:44.274 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.javadoc' to state Discovered.
11:26:44.274 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.model' rule action tasks.addPlaceholderAction(model)
11:26:44.274 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.model using tasks.addPlaceholderAction(model)
11:26:44.274 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.model' to state Discovered.
11:26:44.274 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.projects' rule action tasks.addPlaceholderAction(projects)
11:26:44.274 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.projects using tasks.addPlaceholderAction(projects)
11:26:44.274 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.projects' to state Discovered.
11:26:44.274 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.properties' rule action tasks.addPlaceholderAction(properties)
11:26:44.275 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.properties using tasks.addPlaceholderAction(properties)
11:26:44.275 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.properties' to state Discovered.
11:26:44.275 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.tasks' rule action tasks.addPlaceholderAction(tasks)
11:26:44.275 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.tasks using tasks.addPlaceholderAction(tasks)
11:26:44.275 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.tasks' to state Discovered.
11:26:44.275 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.wrapper' rule action tasks.addPlaceholderAction(wrapper)
11:26:44.275 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.wrapper using tasks.addPlaceholderAction(wrapper)
11:26:44.275 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'tasks.wrapper' rule action Project.<init>.tasks.wrapper()
11:26:44.275 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating tasks.wrapper using Project.<init>.tasks.wrapper()
11:26:44.275 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'tasks.wrapper' to state Discovered.
11:26:44.276 [DEBUG] [org.gradle.caching.configuration.internal.DefaultBuildCacheConfiguration] Found class org.gradle.caching.local.internal.DirectoryBuildCacheServiceFactory registered for class org.gradle.caching.local.DirectoryBuildCache
11:26:44.277 [INFO] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for resourceHashesCache, path me/repos/pmdTest/.gradle/4.3.1/fileHashes/resourceHashesCache.bin, access org.gradle.cache.internal.DefaultCacheAccess@ecaeddb
11:26:44.277 [INFO] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for taskHistory, path me/repos/pmdTest/.gradle/4.3.1/taskHistory/taskHistory.bin, access org.gradle.cache.internal.DefaultCacheAccess@65889f0d
11:26:44.278 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for task history cache (me/repos/pmdTest/.gradle/4.3.1/taskHistory)
11:26:44.278 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on task history cache (me/repos/pmdTest/.gradle/4.3.1/taskHistory).
11:26:44.278 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on task history cache (me/repos/pmdTest/.gradle/4.3.1/taskHistory).
11:26:44.279 [INFO] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for outputFiles, path me/repos/pmdTest/.gradle/buildOutputCleanup/outputFiles.bin, access org.gradle.cache.internal.DefaultCacheAccess@28f46d3d
11:26:44.279 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for Build Output Cleanup Cache (me/repos/pmdTest/.gradle/buildOutputCleanup)
11:26:44.279 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on Build Output Cleanup Cache (me/repos/pmdTest/.gradle/buildOutputCleanup).
11:26:44.280 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on Build Output Cleanup Cache (me/repos/pmdTest/.gradle/buildOutputCleanup).
11:26:44.280 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Finalize build cache configuration' started
11:26:44.281 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Finalize build cache configuration'
11:26:44.281 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Finalize build cache configuration' completed
11:26:44.281 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Using 8 parallel executor threads
11:26:44.282 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
11:26:44.282 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 started (1 worker(s) in use).
11:26:44.282 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2
11:26:44.284 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :clean (Thread[Task worker for ':',5,main]) started.
11:26:44.284 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :clean' started
11:26:44.284 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :clean
11:26:44.285 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':clean'
11:26:44.286 [INFO] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':clean' into context took 0.0 secs.
11:26:44.286 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':clean' is up-to-date
11:26:44.288 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Up-to-date check for task ':clean' took 0.0 secs. It is not up-to-date because:
  Task has not declared any outputs.
11:26:44.288 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':clean'.
11:26:44.289 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Execute clean for :clean' started
11:26:44.289 [DEBUG] [org.gradle.api.internal.file.delete.Deleter] Deleting me/repos/pmdTest/build
11:26:44.291 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Execute clean for :clean'
11:26:44.291 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Execute clean for :clean' completed
11:26:44.291 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
11:26:44.292 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':clean'
11:26:44.292 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Task :clean'
11:26:44.292 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :clean' completed
11:26:44.292 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :clean (Thread[Task worker for ':',5,main]) completed. Took 0.008 secs.
11:26:44.292 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 completed (1 worker(s) in use)
11:26:44.292 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2
11:26:44.292 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
11:26:44.293 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
11:26:44.293 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 started (1 worker(s) in use).
11:26:44.293 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2
11:26:44.293 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :compileJava (Thread[Task worker for ':',5,main]) started.
11:26:44.294 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :compileJava' started
11:26:44.294 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :compileJava
11:26:44.294 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':compileJava'
11:26:44.300 [INFO] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':compileJava' into context took 0.006 secs.
11:26:44.305 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':compileJava' is up-to-date
11:26:44.306 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Implementation for task ':compileJava': org.gradle.api.tasks.compile.JavaCompile_Decorated@baeb334472ac159d047e45b6a4c05835
11:26:44.307 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Action implementations for task ':compileJava': [org.gradle.api.tasks.compile.JavaCompile_Decorated@baeb334472ac159d047e45b6a4c05835]
11:26:44.308 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property classpath (ABSOLUTE) for task ':compileJava'
11:26:44.308 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :compileClasspath' started
11:26:44.309 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of :compileClasspath'
11:26:44.309 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :compileClasspath' completed
11:26:44.309 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property effectiveAnnotationProcessorPath (ABSOLUTE) for task ':compileJava'
11:26:44.310 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property options.bootstrapClasspath (ABSOLUTE) for task ':compileJava'
11:26:44.310 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property options.sourcepath (RELATIVE) for task ':compileJava'
11:26:44.310 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property source (NAME_ONLY) for task ':compileJava'
11:26:44.312 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property destinationDir (OUTPUT) for task ':compileJava'
11:26:44.313 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':compileJava'
11:26:44.314 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Up-to-date check for task ':compileJava' took 0.009 secs. It is not up-to-date because:
  Output property 'destinationDir' file me/repos/pmdTest/build/classes/java/main has been removed.
  Output property 'destinationDir' file me/repos/pmdTest/build/classes/java/main/foo has been removed.
  Output property 'destinationDir' file me/repos/pmdTest/build/classes/java/main/foo/HelloWorld.class has been removed.
11:26:44.316 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring directory exists for property destinationDir (OUTPUT) at me/repos/pmdTest/build/classes/java/main
11:26:44.316 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':compileJava'.
11:26:44.316 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Execute compile for :compileJava' started
11:26:44.317 [INFO] [org.gradle.api.internal.changedetection.changes.RebuildIncrementalTaskInputs] All input files are considered out-of-date for incremental task ':compileJava'.
11:26:44.321 [DEBUG] [org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler] Compiler arguments: -source 1.9 -target 1.9 -d me/repos/pmdTest/build/classes/java/main -g -sourcepath  -proc:none -XDuseUnsharedTable=true -classpath  me/repos/pmdTest/src/main/java/foo/HelloWorld.java
11:26:44.321 [INFO] [org.gradle.api.internal.tasks.compile.JdkJavaCompiler] Compiling with JDK Java compiler API.
11:26:44.587 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Execute compile for :compileJava'
11:26:44.589 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Execute compile for :compileJava' completed
11:26:44.589 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property destinationDir (OUTPUT) for task ':compileJava'
11:26:44.591 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':compileJava'
11:26:44.592 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
11:26:44.592 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':compileJava'
11:26:44.592 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache outputFiles.bin (me/repos/pmdTest/.gradle/buildOutputCleanup/outputFiles.bin)
11:26:44.592 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache taskHistory.bin (me/repos/pmdTest/.gradle/4.3.1/taskHistory/taskHistory.bin)
11:26:44.592 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache fileHashes.bin (me/repos/pmdTest/.gradle/4.3.1/fileHashes/fileHashes.bin)
11:26:44.593 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Task :compileJava'
11:26:44.594 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :compileJava' completed
11:26:44.594 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :compileJava (Thread[Task worker for ':',5,main]) completed. Took 0.3 secs.
11:26:44.594 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 completed (1 worker(s) in use)
11:26:44.594 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2
11:26:44.594 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
11:26:44.594 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
11:26:44.594 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 started (1 worker(s) in use).
11:26:44.594 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2
11:26:44.596 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :processResources (Thread[Task worker for ':',5,main]) started.
11:26:44.596 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :processResources' started
11:26:44.596 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :processResources
11:26:44.597 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':processResources'
11:26:44.597 [INFO] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':processResources' into context took 0.0 secs.
11:26:44.599 [INFO] [org.gradle.api.internal.file.collections.DirectoryFileTree] file or directory 'me/repos/pmdTest/src/main/resources', not found
11:26:44.600 [INFO] [org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter] Skipping task ':processResources' as it has no source files and no previous output files.
11:26:44.600 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
11:26:44.600 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':processResources'
11:26:44.600 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :processResources NO-SOURCE
11:26:44.600 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Task :processResources'
11:26:44.600 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :processResources' completed
11:26:44.600 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :processResources (Thread[Task worker for ':',5,main]) completed. Took 0.004 secs.
11:26:44.600 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 completed (1 worker(s) in use)
11:26:44.600 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2
11:26:44.600 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
11:26:44.600 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
11:26:44.601 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 started (1 worker(s) in use).
11:26:44.601 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2
11:26:44.601 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :classes (Thread[Task worker for ':',5,main]) started.
11:26:44.601 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :classes' started
11:26:44.601 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :classes
11:26:44.602 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':classes'
11:26:44.602 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':classes' as it has no actions.
11:26:44.602 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':classes'
11:26:44.602 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Task :classes'
11:26:44.602 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :classes' completed
11:26:44.604 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :classes (Thread[Task worker for ':',5,main]) completed. Took 0.001 secs.
11:26:44.604 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 completed (1 worker(s) in use)
11:26:44.604 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2
11:26:44.604 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
11:26:44.604 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
11:26:44.604 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 started (1 worker(s) in use).
11:26:44.604 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2
11:26:44.605 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :pmdMain (Thread[Task worker for ':',5,main]) started.
11:26:44.605 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :pmdMain' started
11:26:44.605 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :pmdMain
11:26:44.605 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':pmdMain'
11:26:44.605 [INFO] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':pmdMain' into context took 0.0 secs.
11:26:44.607 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':pmdMain' is up-to-date
11:26:44.609 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Implementation for task ':pmdMain': org.gradle.api.plugins.quality.Pmd_Decorated@baeb334472ac159d047e45b6a4c05835
11:26:44.609 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Action implementations for task ':pmdMain': [org.gradle.api.plugins.quality.Pmd_Decorated@baeb334472ac159d047e45b6a4c05835]
11:26:44.610 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property classpath (ABSOLUTE) for task ':pmdMain'
11:26:44.610 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property pmdClasspath (ABSOLUTE) for task ':pmdMain'
11:26:44.610 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :pmd' started
11:26:44.613 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':pmd'
11:26:44.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.memcache.InMemoryCachedRepositoryFactory] Creating new in-memory cache for repo 'MavenRepo' [9d2499aa07ced35e22c0be3e056f54d9].
11:26:44.617 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration :pmdTest:unspecified(pmd).
11:26:44.618 [INFO] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for metadata-2.31/module-metadata, path me/.gradle/caches/modules-2/metadata-2.31/module-metadata.bin, access org.gradle.cache.internal.DefaultCacheAccess@3fe6cbaf
11:26:44.618 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for artifact cache (me/.gradle/caches/modules-2)
11:26:44.618 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on artifact cache (me/.gradle/caches/modules-2).
11:26:44.619 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on artifact cache (me/.gradle/caches/modules-2).
11:26:44.619 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache module-metadata.bin (me/.gradle/caches/modules-2/metadata-2.31/module-metadata.bin)
11:26:44.622 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for net.sourceforge.pmd:pmd-java:5.6.1 using repositories [MavenRepo]
11:26:44.625 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'net.sourceforge.pmd:pmd-java:5.6.1' in 'MavenRepo'
11:26:44.625 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using net.sourceforge.pmd:pmd-java:5.6.1 from Maven repository 'MavenRepo'
11:26:44.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration net.sourceforge.pmd:pmd-java:5.6.1(default).
11:26:44.634 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for jaxen:jaxen:1.1.6 using repositories [MavenRepo]
11:26:44.634 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'jaxen:jaxen:1.1.6' in 'MavenRepo'
11:26:44.634 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using jaxen:jaxen:1.1.6 from Maven repository 'MavenRepo'
11:26:44.635 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for net.java.dev.javacc:javacc:5.0 using repositories [MavenRepo]
11:26:44.636 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'net.java.dev.javacc:javacc:5.0' in 'MavenRepo'
11:26:44.636 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using net.java.dev.javacc:javacc:5.0 from Maven repository 'MavenRepo'
11:26:44.636 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for net.sourceforge.pmd:pmd-core:5.6.1 using repositories [MavenRepo]
11:26:44.637 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'net.sourceforge.pmd:pmd-core:5.6.1' in 'MavenRepo'
11:26:44.637 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using net.sourceforge.pmd:pmd-core:5.6.1 from Maven repository 'MavenRepo'
11:26:44.637 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for net.sourceforge.saxon:saxon:9.1.0.8 using repositories [MavenRepo]
11:26:44.639 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'net.sourceforge.saxon:saxon:9.1.0.8' in 'MavenRepo'
11:26:44.639 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using net.sourceforge.saxon:saxon:9.1.0.8 from Maven repository 'MavenRepo'
11:26:44.639 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.ow2.asm:asm:5.0.4 using repositories [MavenRepo]
11:26:44.639 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.ow2.asm:asm:5.0.4' in 'MavenRepo'
11:26:44.640 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.ow2.asm:asm:5.0.4 from Maven repository 'MavenRepo'
11:26:44.640 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration jaxen:jaxen:1.1.6(runtime).
11:26:44.640 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration net.java.dev.javacc:javacc:5.0(runtime).
11:26:44.640 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration net.sourceforge.pmd:pmd-core:5.6.1(runtime).
11:26:44.643 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.beust:jcommander:1.48 using repositories [MavenRepo]
11:26:44.645 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.beust:jcommander:1.48' in 'MavenRepo'
11:26:44.645 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.beust:jcommander:1.48 from Maven repository 'MavenRepo'
11:26:44.645 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for commons-io:commons-io:2.4 using repositories [MavenRepo]
11:26:44.646 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'commons-io:commons-io:2.4' in 'MavenRepo'
11:26:44.646 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using commons-io:commons-io:2.4 from Maven repository 'MavenRepo'
11:26:44.647 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.apache.commons:commons-lang3:3.4 using repositories [MavenRepo]
11:26:44.647 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.apache.commons:commons-lang3:3.4' in 'MavenRepo'
11:26:44.647 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.apache.commons:commons-lang3:3.4 from Maven repository 'MavenRepo'
11:26:44.648 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.google.code.gson:gson:2.5 using repositories [MavenRepo]
11:26:44.648 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.google.code.gson:gson:2.5' in 'MavenRepo'
11:26:44.648 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.google.code.gson:gson:2.5 from Maven repository 'MavenRepo'
11:26:44.648 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration net.sourceforge.saxon:saxon:9.1.0.8(runtime).
11:26:44.648 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.ow2.asm:asm:5.0.4(runtime).
11:26:44.648 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.beust:jcommander:1.48(runtime).
11:26:44.648 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration commons-io:commons-io:2.4(runtime).
11:26:44.649 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration jaxen:jaxen:1.1.6(runtime).
11:26:44.649 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for jaxen:jaxen:1.1.6(runtime) selects same versions as previous traversal. ignoring
11:26:44.649 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration net.java.dev.javacc:javacc:5.0(runtime).
11:26:44.649 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for net.java.dev.javacc:javacc:5.0(runtime) selects same versions as previous traversal. ignoring
11:26:44.649 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.apache.commons:commons-lang3:3.4(runtime).
11:26:44.649 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.google.code.gson:gson:2.5(runtime).
11:26:44.651 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in /private/var/folders/6d/nsqv_09x6tb78tnht05h4k98spq6zd/T/gradle13268034127155182704.bin. Wrote root 2.
11:26:44.651 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of :pmd'
11:26:44.651 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :pmd' completed
11:26:44.652 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.sourceforge.pmd:pmd-java:5.6.1 configuration default from candidates [net.sourceforge.pmd:pmd-java:5.6.1 configuration default] for {}
11:26:44.652 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.sourceforge.pmd:pmd-core:5.6.1 configuration runtime from candidates [net.sourceforge.pmd:pmd-core:5.6.1 configuration runtime] for {}
11:26:44.652 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match jaxen:jaxen:1.1.6 configuration runtime from candidates [jaxen:jaxen:1.1.6 configuration runtime] for {}
11:26:44.652 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.java.dev.javacc:javacc:5.0 configuration runtime from candidates [net.java.dev.javacc:javacc:5.0 configuration runtime] for {}
11:26:44.652 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.sourceforge.saxon:saxon:9.1.0.8 configuration runtime from candidates [net.sourceforge.saxon:saxon:9.1.0.8 configuration runtime] for {}
11:26:44.652 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.sourceforge.saxon:saxon:9.1.0.8 from candidates [net.sourceforge.saxon:saxon:9.1.0.8] for {}
11:26:44.653 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match net.sourceforge.saxon:saxon:9.1.0.8 from candidates [net.sourceforge.saxon:saxon:9.1.0.8] for {}
11:26:44.653 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.ow2.asm:asm:5.0.4 configuration runtime from candidates [org.ow2.asm:asm:5.0.4 configuration runtime] for {}
11:26:44.654 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.beust:jcommander:1.48 configuration runtime from candidates [com.beust:jcommander:1.48 configuration runtime] for {}
11:26:44.654 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-io:commons-io:2.4 configuration runtime from candidates [commons-io:commons-io:2.4 configuration runtime] for {}
11:26:44.654 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.commons:commons-lang3:3.4 configuration runtime from candidates [org.apache.commons:commons-lang3:3.4 configuration runtime] for {}
11:26:44.654 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.google.code.gson:gson:2.5 configuration runtime from candidates [com.google.code.gson:gson:2.5 configuration runtime] for {}
11:26:44.655 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve files of :pmd' started
11:26:44.656 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.11 started (1 worker(s) in use).
11:26:44.656 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations: acquired lock on root.1.2.10.11
11:26:44.657 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve pmd-java.jar (net.sourceforge.pmd:pmd-java:5.6.1)' started
11:26:44.657 [INFO] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for metadata-2.31/artifact-at-repository, path me/.gradle/caches/modules-2/metadata-2.31/artifact-at-repository.bin, access org.gradle.cache.internal.DefaultCacheAccess@3fe6cbaf
11:26:44.658 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.12 started (2 worker(s) in use).
11:26:44.658 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2.10.12
11:26:44.658 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.17 started (3 worker(s) in use).
11:26:44.658 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 2: acquired lock on root.1.2.10.17
11:26:44.658 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve pmd-core.jar (net.sourceforge.pmd:pmd-core:5.6.1)' started
11:26:44.659 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.19 started (4 worker(s) in use).
11:26:44.659 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 8: acquired lock on root.1.2.10.19
11:26:44.659 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve jaxen.jar (jaxen:jaxen:1.1.6)' started
11:26:44.659 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache artifact-at-repository.bin (me/.gradle/caches/modules-2/metadata-2.31/artifact-at-repository.bin)
11:26:44.661 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve saxon-dom.jar (net.sourceforge.saxon:saxon:9.1.0.8)' started
11:26:44.659 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.18 started (5 worker(s) in use).
11:26:44.662 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 5: acquired lock on root.1.2.10.18
11:26:44.662 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.16 started (6 worker(s) in use).
11:26:44.663 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 3: acquired lock on root.1.2.10.16
11:26:44.663 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve saxon-dom.jar (net.sourceforge.saxon:saxon:9.1.0.8)' started
11:26:44.663 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.15 started (7 worker(s) in use).
11:26:44.663 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 6: acquired lock on root.1.2.10.15
11:26:44.663 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve javacc.jar (net.java.dev.javacc:javacc:5.0)' started
11:26:44.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'pmd-java.jar (net.sourceforge.pmd:pmd-java:5.6.1)' in resolver cache: me/.gradle/caches/modules-2/files-2.1/net.sourceforge.pmd/pmd-java/5.6.1/46ad6085ce19c42eb2c307d61aba2a49eb6c766e/pmd-java-5.6.1.jar
11:26:44.665 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve pmd-java.jar (net.sourceforge.pmd:pmd-java:5.6.1)'
11:26:44.666 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve pmd-java.jar (net.sourceforge.pmd:pmd-java:5.6.1)' completed
11:26:44.665 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.14 started (8 worker(s) in use).
11:26:44.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'jaxen.jar (jaxen:jaxen:1.1.6)' in resolver cache: me/.gradle/caches/modules-2/files-2.1/jaxen/jaxen/1.1.6/3f8c36d9a0578e8e98f030c662b69888b1430ac0/jaxen-1.1.6.jar
11:26:44.666 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve jaxen.jar (jaxen:jaxen:1.1.6)'
11:26:44.666 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve jaxen.jar (jaxen:jaxen:1.1.6)' completed
11:26:44.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'saxon-dom.jar (net.sourceforge.saxon:saxon:9.1.0.8)' in resolver cache: me/.gradle/caches/modules-2/files-2.1/net.sourceforge.saxon/saxon/9.1.0.8/d3bc6741b15bb4c57626708287a2417ab5f67ee6/saxon-9.1.0.8-dom.jar
11:26:44.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'pmd-core.jar (net.sourceforge.pmd:pmd-core:5.6.1)' in resolver cache: me/.gradle/caches/modules-2/files-2.1/net.sourceforge.pmd/pmd-core/5.6.1/3b84927ff8b1aa10d2da5ced359437f54a08da41/pmd-core-5.6.1.jar
11:26:44.665 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve asm.jar (org.ow2.asm:asm:5.0.4)' started
11:26:44.667 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve pmd-core.jar (net.sourceforge.pmd:pmd-core:5.6.1)'
11:26:44.667 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve saxon-dom.jar (net.sourceforge.saxon:saxon:9.1.0.8)'
11:26:44.667 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve saxon-dom.jar (net.sourceforge.saxon:saxon:9.1.0.8)'
11:26:44.667 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve commons-lang3.jar (org.apache.commons:commons-lang3:3.4)' started
11:26:44.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'javacc.jar (net.java.dev.javacc:javacc:5.0)' in resolver cache: me/.gradle/caches/modules-2/files-2.1/net.java.dev.javacc/javacc/5.0/f19b7d4278b837fe92504946e6860b0bcc180956/javacc-5.0.jar
11:26:44.668 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve javacc.jar (net.java.dev.javacc:javacc:5.0)'
11:26:44.668 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve javacc.jar (net.java.dev.javacc:javacc:5.0)' completed
11:26:44.666 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve commons-io.jar (commons-io:commons-io:2.4)' started
11:26:44.666 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 7: acquired lock on root.1.2.10.14
11:26:44.669 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve jcommander.jar (com.beust:jcommander:1.48)' started
11:26:44.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'commons-lang3.jar (org.apache.commons:commons-lang3:3.4)' in resolver cache: me/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-lang3/3.4/5fe28b9518e58819180a43a850fbc0dd24b7c050/commons-lang3-3.4.jar
11:26:44.670 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve gson.jar (com.google.code.gson:gson:2.5)' started
11:26:44.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'asm.jar (org.ow2.asm:asm:5.0.4)' in resolver cache: me/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm/5.0.4/da08b8cce7bbf903602a25a3a163ae252435795/asm-5.0.4.jar
11:26:44.667 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve saxon-dom.jar (net.sourceforge.saxon:saxon:9.1.0.8)' completed
11:26:44.671 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve saxon-dom.jar (net.sourceforge.saxon:saxon:9.1.0.8)' completed
11:26:44.670 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve asm.jar (org.ow2.asm:asm:5.0.4)'
11:26:44.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'jcommander.jar (com.beust:jcommander:1.48)' in resolver cache: me/.gradle/caches/modules-2/files-2.1/com.beust/jcommander/1.48/bfcb96281ea3b59d626704f74bc6d625ff51cbce/jcommander-1.48.jar
11:26:44.670 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve commons-lang3.jar (org.apache.commons:commons-lang3:3.4)'
11:26:44.669 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Build operation root.1.2.10.13 could not be started (8 worker(s) in use).
11:26:44.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'commons-io.jar (commons-io:commons-io:2.4)' in resolver cache: me/.gradle/caches/modules-2/files-2.1/commons-io/commons-io/2.4/b1b6ea3b7e4aa4f492509a4952029cd8e48019ad/commons-io-2.4.jar
11:26:44.672 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve commons-io.jar (commons-io:commons-io:2.4)'
11:26:44.672 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.18 completed (7 worker(s) in use)
11:26:44.672 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 5: released lock on root.1.2.10.18
11:26:44.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'gson.jar (com.google.code.gson:gson:2.5)' in resolver cache: me/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.5/686c608d1805b6d4d425ec4459e88164ffc85870/gson-2.5.jar
11:26:44.673 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve gson.jar (com.google.code.gson:gson:2.5)'
11:26:44.671 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve jcommander.jar (com.beust:jcommander:1.48)'
11:26:44.673 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve asm.jar (org.ow2.asm:asm:5.0.4)' completed
11:26:44.671 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve pmd-core.jar (net.sourceforge.pmd:pmd-core:5.6.1)' completed
11:26:44.673 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve jcommander.jar (com.beust:jcommander:1.48)' completed
11:26:44.673 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve gson.jar (com.google.code.gson:gson:2.5)' completed
11:26:44.673 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve commons-lang3.jar (org.apache.commons:commons-lang3:3.4)' completed
11:26:44.673 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.19 completed (6 worker(s) in use)
11:26:44.672 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve commons-io.jar (commons-io:commons-io:2.4)' completed
11:26:44.675 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 8: released lock on root.1.2.10.19
11:26:44.676 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.11 completed (5 worker(s) in use)
11:26:44.676 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations: released lock on root.1.2.10.11
11:26:44.676 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.17 completed (4 worker(s) in use)
11:26:44.676 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 2: released lock on root.1.2.10.17
11:26:44.676 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.16 completed (3 worker(s) in use)
11:26:44.676 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 3: released lock on root.1.2.10.16
11:26:44.677 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.14 completed (2 worker(s) in use)
11:26:44.677 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 7: released lock on root.1.2.10.14
11:26:44.677 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.12 completed (1 worker(s) in use)
11:26:44.677 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2.10.12
11:26:44.677 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.15 completed (1 worker(s) in use)
11:26:44.677 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 6: released lock on root.1.2.10.15
11:26:44.678 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.13 started (1 worker(s) in use).
11:26:44.678 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 4: acquired lock on root.1.2.10.13
11:26:44.678 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve saxon.jar (net.sourceforge.saxon:saxon:9.1.0.8)' started
11:26:44.679 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'saxon.jar (net.sourceforge.saxon:saxon:9.1.0.8)' in resolver cache: me/.gradle/caches/modules-2/files-2.1/net.sourceforge.saxon/saxon/9.1.0.8/9ffdd08cb74563cbd431c845238b414e933a0483/saxon-9.1.0.8.jar
11:26:44.679 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve saxon.jar (net.sourceforge.saxon:saxon:9.1.0.8)'
11:26:44.680 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve saxon.jar (net.sourceforge.saxon:saxon:9.1.0.8)' completed
11:26:44.680 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.10.13 completed (1 worker(s) in use)
11:26:44.681 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] build operations Thread 4: released lock on root.1.2.10.13
11:26:44.681 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :pmd'
11:26:44.681 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve files of :pmd' completed
11:26:44.682 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property ruleSetConfig.inputFiles (NONE) for task ':pmdMain'
11:26:44.683 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property ruleSetFiles (NONE) for task ':pmdMain'
11:26:44.683 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property source (RELATIVE) for task ':pmdMain'
11:26:44.688 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.enabledFileReportDestinations.html for task ':pmdMain'
11:26:44.689 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.enabledFileReportDestinations.xml for task ':pmdMain'
11:26:44.689 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':pmdMain'
11:26:44.689 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Up-to-date check for task ':pmdMain' took 0.08 secs. It is not up-to-date because:
  Output property 'reports.enabledFileReportDestinations.html' file me/repos/pmdTest/build/reports/pmd/main.html has been removed.
  Output property 'reports.enabledFileReportDestinations.xml' file me/repos/pmdTest/build/reports/pmd/main.xml has been removed.
11:26:44.689 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring parent directory exists for property reports.enabledFileReportDestinations.html at me/repos/pmdTest/build/reports/pmd/main.html
11:26:44.690 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring parent directory exists for property reports.enabledFileReportDestinations.xml at me/repos/pmdTest/build/reports/pmd/main.xml
11:26:44.690 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':pmdMain'.
11:26:44.690 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Execute run for :pmdMain' started
11:26:45.244 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve files of :pmd' started
11:26:45.244 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :pmd'
11:26:45.244 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve files of :pmd' completed
11:26:45.245 [DEBUG] [org.gradle.api.internal.project.antbuilder.DefaultIsolatedAntBuilder] Forking a new isolated ant builder for classpath : configuration ':pmd'
11:26:45.245 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve files of :pmd' started
11:26:45.245 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :pmd'
11:26:45.246 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Resolve files of :pmd' completed
11:26:45.247 [DEBUG] [org.gradle.api.internal.project.antbuilder.ClassPathToClassLoaderCache] Classloader cache miss for classpath : [file:me/.gradle/caches/modules-2/files-2.1/net.sourceforge.pmd/pmd-java/5.6.1/46ad6085ce19c42eb2c307d61aba2a49eb6c766e/pmd-java-5.6.1.jar, file:me/.gradle/caches/modules-2/files-2.1/net.sourceforge.pmd/pmd-core/5.6.1/3b84927ff8b1aa10d2da5ced359437f54a08da41/pmd-core-5.6.1.jar, file:me/.gradle/caches/modules-2/files-2.1/jaxen/jaxen/1.1.6/3f8c36d9a0578e8e98f030c662b69888b1430ac0/jaxen-1.1.6.jar, file:me/.gradle/caches/modules-2/files-2.1/net.java.dev.javacc/javacc/5.0/f19b7d4278b837fe92504946e6860b0bcc180956/javacc-5.0.jar, file:me/.gradle/caches/modules-2/files-2.1/net.sourceforge.saxon/saxon/9.1.0.8/9ffdd08cb74563cbd431c845238b414e933a0483/saxon-9.1.0.8.jar, file:me/.gradle/caches/modules-2/files-2.1/net.sourceforge.saxon/saxon/9.1.0.8/d3bc6741b15bb4c57626708287a2417ab5f67ee6/saxon-9.1.0.8-dom.jar, file:me/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm/5.0.4/da08b8cce7bbf903602a25a3a163ae252435795/asm-5.0.4.jar, file:me/.gradle/caches/modules-2/files-2.1/com.beust/jcommander/1.48/bfcb96281ea3b59d626704f74bc6d625ff51cbce/jcommander-1.48.jar, file:me/.gradle/caches/modules-2/files-2.1/commons-io/commons-io/2.4/b1b6ea3b7e4aa4f492509a4952029cd8e48019ad/commons-io-2.4.jar, file:me/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-lang3/3.4/5fe28b9518e58819180a43a850fbc0dd24b7c050/commons-lang3-3.4.jar, file:me/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.5/686c608d1805b6d4d425ec4459e88164ffc85870/gson-2.5.jar]. Creating classloader.
11:26:45.538 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter]  +Datatype pmd net.sourceforge.pmd.ant.PMDTask
11:26:45.645 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] parsing buildfile jar:file:me/.gradle/wrapper/dists/gradle-4.3.1-bin/7yzdu24db77gi3zukl2a7o0xx/gradle-4.3.1/lib/ant-1.9.6.jar!/org/apache/tools/ant/antlib.xml with URI = jar:file:me/.gradle/wrapper/dists/gradle-4.3.1-bin/7yzdu24db77gi3zukl2a7o0xx/gradle-4.3.1/lib/ant-1.9.6.jar!/org/apache/tools/ant/antlib.xml from a zip file
11:26:45.700 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class org.apache.tools.ant.taskdefs.condition.And loaded from parent loader (parentFirst)
11:26:45.701 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class org.apache.tools.ant.types.resources.selectors.And loaded from parent loader (parentFirst)
11:26:45.701 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class org.apache.tools.ant.taskdefs.condition.Or loaded from parent loader (parentFirst)
11:26:45.702 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class org.apache.tools.ant.types.resources.selectors.Or loaded from parent loader (parentFirst)
11:26:45.723 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using the AntClassLoader: me/repos/pmdTest
11:26:45.724 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using auxclasspath: me/repos/pmdTest/build/classes/java/main:me/repos/pmdTest/build/resources/main
11:26:45.724 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Adding classpath entry: <me/repos/pmdTest/build/classes/java/main>
11:26:45.724 [DEBUG] [net.sourceforge.pmd.util.ClasspathClassLoader] Adding classpath entry: <me/repos/pmdTest/build/classes/java/main>
11:26:45.725 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting OS memory status event {Total: 8589934592, Free: 441188352}
11:26:45.725 [DEBUG] [org.gradle.launcher.daemon.server.health.LowMemoryDaemonExpirationStrategy] Received memory status update: {Total: 8589934592, Free: 441188352}
11:26:45.725 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] 858993459 memory requested, 441188352 free
11:26:45.725 [DEBUG] [org.gradle.workers.internal.WorkerDaemonExpiration] Will attempt to release 819 of memory
11:26:45.725 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Adding classpath entry: <me/repos/pmdTest/build/resources/main>
11:26:45.725 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] 858993459 memory requested, 0 released, 441188352 free
11:26:45.725 [DEBUG] [net.sourceforge.pmd.util.ClasspathClassLoader] Adding classpath entry: <me/repos/pmdTest/build/resources/main>
11:26:45.725 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting JVM memory status event {Maximum: 1073741824, Committed: 193986560}
11:26:45.770 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Resource rulesets/java/basic.xml loaded from parent loader
11:26:45.785 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.816 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.821 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.OverrideBothEqualsAndHashcodeRule loaded from parent loader (parentFirst)
11:26:45.826 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.DoubleCheckedLockingRule loaded from parent loader (parentFirst)
11:26:45.827 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.827 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.828 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.BooleanInstantiationRule loaded from parent loader (parentFirst)
11:26:45.829 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.830 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.830 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.830 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.831 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.832 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.BrokenNullCheckRule loaded from parent loader (parentFirst)
11:26:45.833 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.BigIntegerInstantiationRule loaded from parent loader (parentFirst)
11:26:45.834 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidUsingOctalValuesRule loaded from parent loader (parentFirst)
11:26:45.844 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidUsingHardCodedIPRule loaded from parent loader (parentFirst)
11:26:45.899 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.CheckResultSetRule loaded from parent loader (parentFirst)
11:26:45.900 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidMultipleUnaryOperatorsRule loaded from parent loader (parentFirst)
11:26:45.901 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.902 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.CheckSkipResultRule loaded from parent loader (parentFirst)
11:26:45.902 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidBranchingStatementAsLastInLoopRule loaded from parent loader (parentFirst)
11:26:45.905 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.905 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.905 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.914 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using these rulesets: java-basic
11:26:45.915 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule JumbledIncrementer
11:26:45.915 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule ForLoopShouldBeWhileLoop
11:26:45.915 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule OverrideBothEqualsAndHashcode
11:26:45.915 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule DoubleCheckedLocking
11:26:45.915 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule ReturnFromFinallyBlock
11:26:45.915 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule UnconditionalIfStatement
11:26:45.915 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule BooleanInstantiation
11:26:45.915 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule CollapsibleIfStatements
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule ClassCastExceptionWithToArray
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule AvoidDecimalLiteralsInBigDecimalConstructor
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule MisplacedNullCheck
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule AvoidThreadGroup
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule BrokenNullCheck
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule BigIntegerInstantiation
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule AvoidUsingOctalValues
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule AvoidUsingHardCodedIP
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule CheckResultSet
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule AvoidMultipleUnaryOperators
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule ExtendsObject
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule CheckSkipResult
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule AvoidBranchingStatementAsLastInLoop
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule DontCallThreadRun
11:26:45.916 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule DontUseFloatTypeForLoopIndices
11:26:45.917 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Using rule SimplifiedTernary
11:26:45.917 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Sending a report to file = me/repos/pmdTest/build/reports/pmd/main.html; renderer = html
11:26:45.934 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Sending a report to file = me/repos/pmdTest/build/reports/pmd/main.xml; renderer = xml
11:26:45.940 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] fileset: Setup scanner in dir me/repos/pmdTest/src/main/java with patternSet{ includes: [] excludes: [] }
11:26:45.951 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Resource rulesets/java/basic.xml loaded from parent loader
11:26:45.954 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.954 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.955 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.OverrideBothEqualsAndHashcodeRule loaded from parent loader (parentFirst)
11:26:45.955 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.DoubleCheckedLockingRule loaded from parent loader (parentFirst)
11:26:45.955 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.958 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.958 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.BooleanInstantiationRule loaded from parent loader (parentFirst)
11:26:45.958 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.958 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.958 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.959 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.959 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.959 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.BrokenNullCheckRule loaded from parent loader (parentFirst)
11:26:45.959 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.BigIntegerInstantiationRule loaded from parent loader (parentFirst)
11:26:45.959 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidUsingOctalValuesRule loaded from parent loader (parentFirst)
11:26:45.959 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidUsingHardCodedIPRule loaded from parent loader (parentFirst)
11:26:45.959 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.CheckResultSetRule loaded from parent loader (parentFirst)
11:26:45.960 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidMultipleUnaryOperatorsRule loaded from parent loader (parentFirst)
11:26:45.960 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.960 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.CheckSkipResultRule loaded from parent loader (parentFirst)
11:26:45.960 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidBranchingStatementAsLastInLoopRule loaded from parent loader (parentFirst)
11:26:45.960 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.960 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.960 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.964 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule CollapsibleIfStatements
11:26:45.964 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule CollapsibleIfStatements
11:26:45.964 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule ClassCastExceptionWithToArray
11:26:45.964 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule ClassCastExceptionWithToArray
11:26:45.964 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule DoubleCheckedLocking
11:26:45.964 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule DoubleCheckedLocking
11:26:45.965 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule JumbledIncrementer
11:26:45.965 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule JumbledIncrementer
11:26:45.965 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule BooleanInstantiation
11:26:45.965 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule BooleanInstantiation
11:26:45.965 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule MisplacedNullCheck
11:26:45.965 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule MisplacedNullCheck
11:26:45.965 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule AvoidUsingHardCodedIP
11:26:45.965 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule AvoidUsingHardCodedIP
11:26:45.965 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule DontUseFloatTypeForLoopIndices
11:26:45.965 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule DontUseFloatTypeForLoopIndices
11:26:45.965 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule AvoidUsingOctalValues
11:26:45.966 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule AvoidUsingOctalValues
11:26:45.966 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule AvoidBranchingStatementAsLastInLoop
11:26:45.966 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule AvoidBranchingStatementAsLastInLoop
11:26:45.966 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule ReturnFromFinallyBlock
11:26:45.966 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule ReturnFromFinallyBlock
11:26:45.966 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule ExtendsObject
11:26:45.966 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule ExtendsObject
11:26:45.966 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule AvoidThreadGroup
11:26:45.966 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule AvoidThreadGroup
11:26:45.967 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule CheckSkipResult
11:26:45.967 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule CheckSkipResult
11:26:45.967 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule AvoidDecimalLiteralsInBigDecimalConstructor
11:26:45.967 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule AvoidDecimalLiteralsInBigDecimalConstructor
11:26:45.967 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule ForLoopShouldBeWhileLoop
11:26:45.967 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule ForLoopShouldBeWhileLoop
11:26:45.967 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule SimplifiedTernary
11:26:45.967 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule SimplifiedTernary
11:26:45.967 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule CheckResultSet
11:26:45.968 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule CheckResultSet
11:26:45.968 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule AvoidMultipleUnaryOperators
11:26:45.968 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule AvoidMultipleUnaryOperators
11:26:45.968 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule UnconditionalIfStatement
11:26:45.968 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule UnconditionalIfStatement
11:26:45.968 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule BigIntegerInstantiation
11:26:45.968 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule BigIntegerInstantiation
11:26:45.968 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule BrokenNullCheck
11:26:45.968 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule BrokenNullCheck
11:26:45.968 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule OverrideBothEqualsAndHashcode
11:26:45.969 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule OverrideBothEqualsAndHashcode
11:26:45.969 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Loaded rule DontCallThreadRun
11:26:45.969 [DEBUG] [net.sourceforge.pmd.RulesetsFactoryUtils] Loaded rule DontCallThreadRun
11:26:45.971 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Resource rulesets/java/basic.xml loaded from parent loader
11:26:45.976 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.976 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.976 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.OverrideBothEqualsAndHashcodeRule loaded from parent loader (parentFirst)
11:26:45.976 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.DoubleCheckedLockingRule loaded from parent loader (parentFirst)
11:26:45.977 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.977 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.977 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.BooleanInstantiationRule loaded from parent loader (parentFirst)
11:26:45.977 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.977 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.977 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.978 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.978 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.978 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.BrokenNullCheckRule loaded from parent loader (parentFirst)
11:26:45.978 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.BigIntegerInstantiationRule loaded from parent loader (parentFirst)
11:26:45.979 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidUsingOctalValuesRule loaded from parent loader (parentFirst)
11:26:45.979 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidUsingHardCodedIPRule loaded from parent loader (parentFirst)
11:26:45.979 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.CheckResultSetRule loaded from parent loader (parentFirst)
11:26:45.979 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidMultipleUnaryOperatorsRule loaded from parent loader (parentFirst)
11:26:45.980 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.980 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.CheckSkipResultRule loaded from parent loader (parentFirst)
11:26:45.980 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.java.rule.basic.AvoidBranchingStatementAsLastInLoopRule loaded from parent loader (parentFirst)
11:26:45.980 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.981 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.981 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class net.sourceforge.pmd.lang.rule.XPathRule loaded from parent loader (parentFirst)
11:26:45.985 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Processing me/repos/pmdTest/src/main/java/foo/HelloWorld.java
11:26:45.985 [DEBUG] [net.sourceforge.pmd.processor.PmdRunnable] Processing me/repos/pmdTest/src/main/java/foo/HelloWorld.java
11:26:45.986 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Processing file me/repos/pmdTest/src/main/java/foo/HelloWorld.java
11:26:46.109 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Finding class foo.HelloWorld
11:26:46.110 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Class java.lang.Object loaded from parent loader (parentFirst)
11:26:46.110 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Couldn't load Resource foo/HelloWorld.class
11:26:46.119 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Error while processing file: me/repos/pmdTest/src/main/java/foo/HelloWorld.java
11:26:46.121 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] net.sourceforge.pmd.PMDException: Error while processing me/repos/pmdTest/src/main/java/foo/HelloWorld.java
	at net.sourceforge.pmd.SourceCodeProcessor.processSourceCode(SourceCodeProcessor.java:103)
	at net.sourceforge.pmd.SourceCodeProcessor.processSourceCode(SourceCodeProcessor.java:52)
	at net.sourceforge.pmd.processor.PmdRunnable.call(PmdRunnable.java:88)
	at net.sourceforge.pmd.processor.MonoThreadProcessor.runAnalysis(MonoThreadProcessor.java:29)
	at net.sourceforge.pmd.processor.AbstractPMDProcessor.processFiles(AbstractPMDProcessor.java:75)
	at net.sourceforge.pmd.PMD.processFiles(PMD.java:410)
	at net.sourceforge.pmd.ant.internal.PMDTaskImpl.doTask(PMDTaskImpl.java:188)
	at net.sourceforge.pmd.ant.internal.PMDTaskImpl.execute(PMDTaskImpl.java:269)
	at net.sourceforge.pmd.ant.PMDTask.execute(PMDTask.java:49)
	at org.apache.tools.ant.UnknownElement.execute(UnknownElement.java:293)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:564)
	at org.apache.tools.ant.dispatch.DispatchUtils.execute(DispatchUtils.java:106)
	at groovy.util.AntBuilder.performTask(AntBuilder.java:327)
	at groovy.util.AntBuilder.nodeCompleted(AntBuilder.java:272)
	at org.gradle.api.internal.project.ant.BasicAntBuilder.nodeCompleted(BasicAntBuilder.java:78)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:564)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)
	at org.gradle.internal.metaobject.BeanDynamicObject$MetaClassAdapter.invokeMethod(BeanDynamicObject.java:479)
	at org.gradle.internal.metaobject.BeanDynamicObject.tryInvokeMethod(BeanDynamicObject.java:191)
	at org.gradle.internal.metaobject.AbstractDynamicObject.invokeMethod(AbstractDynamicObject.java:160)
	at org.gradle.api.internal.project.antbuilder.AntBuilderDelegate.nodeCompleted(AntBuilderDelegate.java:118)
	at groovy.util.BuilderSupport.doInvokeMethod(BuilderSupport.java:154)
	at groovy.util.BuilderSupport.invokeMethod(BuilderSupport.java:67)
	at org.codehaus.groovy.runtime.callsite.PogoMetaClassSite.call(PogoMetaClassSite.java:48)
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)
	at org.gradle.api.plugins.quality.internal.PmdInvoker$_invoke_closure2.doCall(PmdInvoker.groovy:62)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:564)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)
	at org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:294)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1022)
	at groovy.lang.Closure.call(Closure.java:414)
	at groovy.lang.Closure.call(Closure.java:430)
	at org.gradle.api.internal.ClosureBackedAction.execute(ClosureBackedAction.java:71)
	at org.gradle.api.internal.ClosureBackedAction.execute(ClosureBackedAction.java:53)
	at org.gradle.api.internal.project.antbuilder.DefaultIsolatedAntBuilder$2.execute(DefaultIsolatedAntBuilder.java:152)
	at org.gradle.api.internal.project.antbuilder.DefaultIsolatedAntBuilder$2.execute(DefaultIsolatedAntBuilder.java:134)
	at org.gradle.api.internal.project.antbuilder.ClassPathToClassLoaderCache.withCachedClassLoader(ClassPathToClassLoaderCache.java:134)
	at org.gradle.api.internal.project.antbuilder.DefaultIsolatedAntBuilder.execute(DefaultIsolatedAntBuilder.java:128)
	at org.gradle.api.internal.project.IsolatedAntBuilder$execute$0.call(Unknown Source)
	at org.gradle.api.plugins.quality.internal.PmdInvoker.invoke(PmdInvoker.groovy:60)
	at org.gradle.api.plugins.quality.Pmd.run(Pmd.java:92)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:564)
	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:73)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:46)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:39)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:26)
	at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:784)
	at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:751)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$1.run(ExecuteActionsTaskExecuter.java:121)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:336)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:328)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:199)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:110)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeAction(ExecuteActionsTaskExecuter.java:110)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:92)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:70)
	at org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter.execute(OutputDirectoryCreatingTaskExecuter.java:51)
	at org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter.execute(SkipUpToDateTaskExecuter.java:62)
	at org.gradle.api.internal.tasks.execution.ResolveTaskOutputCachingStateExecuter.execute(ResolveTaskOutputCachingStateExecuter.java:54)
	at org.gradle.api.internal.tasks.execution.ValidatingTaskExecuter.execute(ValidatingTaskExecuter.java:60)
	at org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter.execute(SkipEmptySourceFilesTaskExecuter.java:97)
	at org.gradle.api.internal.tasks.execution.CleanupStaleOutputsExecuter.execute(CleanupStaleOutputsExecuter.java:87)
	at org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter.execute(ResolveTaskArtifactStateTaskExecuter.java:52)
	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:52)
	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:54)
	at org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter.execute(ExecuteAtMostOnceTaskExecuter.java:43)
	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:34)
	at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker$1.run(DefaultTaskGraphExecuter.java:248)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:336)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:328)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:199)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:110)
	at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker.execute(DefaultTaskGraphExecuter.java:241)
	at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker.execute(DefaultTaskGraphExecuter.java:230)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.processTask(DefaultTaskPlanExecutor.java:123)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.access$200(DefaultTaskPlanExecutor.java:79)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:104)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:98)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionPlan.execute(DefaultTaskExecutionPlan.java:626)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionPlan.executeWithTask(DefaultTaskExecutionPlan.java:581)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.run(DefaultTaskPlanExecutor.java:98)
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63)
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:46)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
	at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55)
	at java.base/java.lang.Thread.run(Thread.java:844)
Caused by: java.lang.IllegalArgumentException
	at org.objectweb.asm.ClassReader.<init>(Unknown Source)
	at org.objectweb.asm.ClassReader.<init>(Unknown Source)
	at org.objectweb.asm.ClassReader.<init>(Unknown Source)
	at net.sourceforge.pmd.lang.java.typeresolution.PMDASMClassLoader.getImportedClasses(PMDASMClassLoader.java:107)
	at net.sourceforge.pmd.lang.java.typeresolution.ClassTypeResolver.populateClassName(ClassTypeResolver.java:775)
	at net.sourceforge.pmd.lang.java.typeresolution.ClassTypeResolver.visit(ClassTypeResolver.java:156)
	at net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit.jjtAccept(ASTCompilationUnit.java:41)
	at net.sourceforge.pmd.lang.java.typeresolution.TypeResolutionFacade.initializeWith(TypeResolutionFacade.java:18)
	at net.sourceforge.pmd.lang.java.AbstractJavaHandler$5.start(AbstractJavaHandler.java:94)
	at net.sourceforge.pmd.SourceCodeProcessor.usesTypeResolution(SourceCodeProcessor.java:151)
	at net.sourceforge.pmd.SourceCodeProcessor.processSource(SourceCodeProcessor.java:167)
	at net.sourceforge.pmd.SourceCodeProcessor.processSourceCode(SourceCodeProcessor.java:97)
	... 100 more
11:26:46.123 [DEBUG] [net.sourceforge.pmd.processor.PmdRunnable] Error while processing file: me/repos/pmdTest/src/main/java/foo/HelloWorld.java
net.sourceforge.pmd.PMDException: Error while processing me/repos/pmdTest/src/main/java/foo/HelloWorld.java
	at net.sourceforge.pmd.SourceCodeProcessor.processSourceCode(SourceCodeProcessor.java:103)
	at net.sourceforge.pmd.SourceCodeProcessor.processSourceCode(SourceCodeProcessor.java:52)
	at net.sourceforge.pmd.processor.PmdRunnable.call(PmdRunnable.java:88)
	at net.sourceforge.pmd.processor.MonoThreadProcessor.runAnalysis(MonoThreadProcessor.java:29)
	at net.sourceforge.pmd.processor.AbstractPMDProcessor.processFiles(AbstractPMDProcessor.java:75)
	at net.sourceforge.pmd.PMD.processFiles(PMD.java:410)
	at net.sourceforge.pmd.ant.internal.PMDTaskImpl.doTask(PMDTaskImpl.java:188)
	at net.sourceforge.pmd.ant.internal.PMDTaskImpl.execute(PMDTaskImpl.java:269)
	at net.sourceforge.pmd.ant.PMDTask.execute(PMDTask.java:49)
	at org.apache.tools.ant.UnknownElement.execute(UnknownElement.java:293)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:564)
	at org.apache.tools.ant.dispatch.DispatchUtils.execute(DispatchUtils.java:106)
	at groovy.util.AntBuilder.performTask(AntBuilder.java:327)
	at groovy.util.AntBuilder.nodeCompleted(AntBuilder.java:272)
	at org.gradle.api.internal.project.ant.BasicAntBuilder.nodeCompleted(BasicAntBuilder.java:78)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:564)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)
	at org.gradle.internal.metaobject.BeanDynamicObject$MetaClassAdapter.invokeMethod(BeanDynamicObject.java:479)
	at org.gradle.internal.metaobject.BeanDynamicObject.tryInvokeMethod(BeanDynamicObject.java:191)
	at org.gradle.internal.metaobject.AbstractDynamicObject.invokeMethod(AbstractDynamicObject.java:160)
	at org.gradle.api.internal.project.antbuilder.AntBuilderDelegate.nodeCompleted(AntBuilderDelegate.java:118)
	at groovy.util.BuilderSupport.doInvokeMethod(BuilderSupport.java:154)
	at groovy.util.BuilderSupport.invokeMethod(BuilderSupport.java:67)
	at org.codehaus.groovy.runtime.callsite.PogoMetaClassSite.call(PogoMetaClassSite.java:48)
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)
	at org.gradle.api.plugins.quality.internal.PmdInvoker$_invoke_closure2.doCall(PmdInvoker.groovy:62)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:564)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)
	at org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:294)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1022)
	at groovy.lang.Closure.call(Closure.java:414)
	at groovy.lang.Closure.call(Closure.java:430)
	at org.gradle.api.internal.ClosureBackedAction.execute(ClosureBackedAction.java:71)
	at org.gradle.api.internal.ClosureBackedAction.execute(ClosureBackedAction.java:53)
	at org.gradle.api.internal.project.antbuilder.DefaultIsolatedAntBuilder$2.execute(DefaultIsolatedAntBuilder.java:152)
	at org.gradle.api.internal.project.antbuilder.DefaultIsolatedAntBuilder$2.execute(DefaultIsolatedAntBuilder.java:134)
	at org.gradle.api.internal.project.antbuilder.ClassPathToClassLoaderCache.withCachedClassLoader(ClassPathToClassLoaderCache.java:134)
	at org.gradle.api.internal.project.antbuilder.DefaultIsolatedAntBuilder.execute(DefaultIsolatedAntBuilder.java:128)
	at org.gradle.api.internal.project.IsolatedAntBuilder$execute$0.call(Unknown Source)
	at org.gradle.api.plugins.quality.internal.PmdInvoker.invoke(PmdInvoker.groovy:60)
	at org.gradle.api.plugins.quality.Pmd.run(Pmd.java:92)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:564)
	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:73)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:46)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:39)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:26)
	at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:784)
	at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:751)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$1.run(ExecuteActionsTaskExecuter.java:121)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:336)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:328)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:199)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:110)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeAction(ExecuteActionsTaskExecuter.java:110)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:92)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:70)
	at org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter.execute(OutputDirectoryCreatingTaskExecuter.java:51)
	at org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter.execute(SkipUpToDateTaskExecuter.java:62)
	at org.gradle.api.internal.tasks.execution.ResolveTaskOutputCachingStateExecuter.execute(ResolveTaskOutputCachingStateExecuter.java:54)
	at org.gradle.api.internal.tasks.execution.ValidatingTaskExecuter.execute(ValidatingTaskExecuter.java:60)
	at org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter.execute(SkipEmptySourceFilesTaskExecuter.java:97)
	at org.gradle.api.internal.tasks.execution.CleanupStaleOutputsExecuter.execute(CleanupStaleOutputsExecuter.java:87)
	at org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter.execute(ResolveTaskArtifactStateTaskExecuter.java:52)
	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:52)
	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:54)
	at org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter.execute(ExecuteAtMostOnceTaskExecuter.java:43)
	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:34)
	at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker$1.run(DefaultTaskGraphExecuter.java:248)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:336)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:328)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:199)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:110)
	at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker.execute(DefaultTaskGraphExecuter.java:241)
	at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker.execute(DefaultTaskGraphExecuter.java:230)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.processTask(DefaultTaskPlanExecutor.java:123)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.access$200(DefaultTaskPlanExecutor.java:79)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:104)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:98)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionPlan.execute(DefaultTaskExecutionPlan.java:626)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionPlan.executeWithTask(DefaultTaskExecutionPlan.java:581)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.run(DefaultTaskPlanExecutor.java:98)
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63)
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:46)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
	at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55)
	at java.base/java.lang.Thread.run(Thread.java:844)
Caused by: java.lang.IllegalArgumentException
	at org.objectweb.asm.ClassReader.<init>(Unknown Source)
	at org.objectweb.asm.ClassReader.<init>(Unknown Source)
	at org.objectweb.asm.ClassReader.<init>(Unknown Source)
	at net.sourceforge.pmd.lang.java.typeresolution.PMDASMClassLoader.getImportedClasses(PMDASMClassLoader.java:107)
	at net.sourceforge.pmd.lang.java.typeresolution.ClassTypeResolver.populateClassName(ClassTypeResolver.java:775)
	at net.sourceforge.pmd.lang.java.typeresolution.ClassTypeResolver.visit(ClassTypeResolver.java:156)
	at net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit.jjtAccept(ASTCompilationUnit.java:41)
	at net.sourceforge.pmd.lang.java.typeresolution.TypeResolutionFacade.initializeWith(TypeResolutionFacade.java:18)
	at net.sourceforge.pmd.lang.java.AbstractJavaHandler$5.start(AbstractJavaHandler.java:94)
	at net.sourceforge.pmd.SourceCodeProcessor.usesTypeResolution(SourceCodeProcessor.java:151)
	at net.sourceforge.pmd.SourceCodeProcessor.processSource(SourceCodeProcessor.java:167)
	at net.sourceforge.pmd.SourceCodeProcessor.processSourceCode(SourceCodeProcessor.java:97)
	... 100 more
11:26:46.126 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] 0 problems found
11:26:46.128 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Execute run for :pmdMain'
11:26:46.129 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Execute run for :pmdMain' completed
11:26:46.130 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.enabledFileReportDestinations.html for task ':pmdMain'
11:26:46.132 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.enabledFileReportDestinations.xml for task ':pmdMain'
11:26:46.133 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
11:26:46.133 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':pmdMain'
11:26:46.134 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Task :pmdMain'
11:26:46.134 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :pmdMain' completed
11:26:46.135 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :pmdMain (Thread[Task worker for ':',5,main]) completed. Took 1.529 secs.
11:26:46.135 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 completed (1 worker(s) in use)
11:26:46.135 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2
11:26:46.135 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
11:26:46.136 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
11:26:46.136 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 started (1 worker(s) in use).
11:26:46.136 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2
11:26:46.137 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :compileTestJava (Thread[Task worker for ':',5,main]) started.
11:26:46.137 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :compileTestJava' started
11:26:46.138 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :compileTestJava
11:26:46.138 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':compileTestJava'
11:26:46.138 [INFO] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':compileTestJava' into context took 0.0 secs.
11:26:46.140 [INFO] [org.gradle.api.internal.file.collections.DirectoryFileTree] file or directory 'me/repos/pmdTest/src/test/java', not found
11:26:46.140 [INFO] [org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter] Skipping task ':compileTestJava' as it has no source files and no previous output files.
11:26:46.140 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
11:26:46.140 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':compileTestJava'
11:26:46.140 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :compileTestJava NO-SOURCE
11:26:46.141 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Task :compileTestJava'
11:26:46.141 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :compileTestJava' completed
11:26:46.141 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :compileTestJava (Thread[Task worker for ':',5,main]) completed. Took 0.003 secs.
11:26:46.141 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 completed (1 worker(s) in use)
11:26:46.141 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2
11:26:46.142 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
11:26:46.142 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
11:26:46.143 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 started (1 worker(s) in use).
11:26:46.144 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2
11:26:46.146 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :processTestResources (Thread[Task worker for ':',5,main]) started.
11:26:46.146 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :processTestResources' started
11:26:46.147 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :processTestResources
11:26:46.147 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':processTestResources'
11:26:46.147 [INFO] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':processTestResources' into context took 0.0 secs.
11:26:46.148 [INFO] [org.gradle.api.internal.file.collections.DirectoryFileTree] file or directory 'me/repos/pmdTest/src/test/resources', not found
11:26:46.148 [INFO] [org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter] Skipping task ':processTestResources' as it has no source files and no previous output files.
11:26:46.148 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
11:26:46.148 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':processTestResources'
11:26:46.148 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :processTestResources NO-SOURCE
11:26:46.148 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Task :processTestResources'
11:26:46.148 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :processTestResources' completed
11:26:46.148 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :processTestResources (Thread[Task worker for ':',5,main]) completed. Took 0.001 secs.
11:26:46.149 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 completed (1 worker(s) in use)
11:26:46.149 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2
11:26:46.149 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
11:26:46.150 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
11:26:46.150 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 started (1 worker(s) in use).
11:26:46.150 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2
11:26:46.150 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :testClasses (Thread[Task worker for ':',5,main]) started.
11:26:46.150 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :testClasses' started
11:26:46.150 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :testClasses
11:26:46.150 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':testClasses'
11:26:46.151 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':testClasses' as it has no actions.
11:26:46.151 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':testClasses'
11:26:46.151 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :testClasses UP-TO-DATE
11:26:46.152 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Task :testClasses'
11:26:46.152 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :testClasses' completed
11:26:46.152 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :testClasses (Thread[Task worker for ':',5,main]) completed. Took 0.001 secs.
11:26:46.152 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 completed (1 worker(s) in use)
11:26:46.152 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2
11:26:46.152 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
11:26:46.152 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
11:26:46.153 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 started (1 worker(s) in use).
11:26:46.153 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2
11:26:46.155 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :pmdTest (Thread[Task worker for ':',5,main]) started.
11:26:46.155 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :pmdTest' started
11:26:46.155 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :pmdTest
11:26:46.155 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':pmdTest'
11:26:46.155 [INFO] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':pmdTest' into context took 0.0 secs.
11:26:46.156 [INFO] [org.gradle.api.internal.file.collections.DirectoryFileTree] file or directory 'me/repos/pmdTest/src/test/java', not found
11:26:46.156 [INFO] [org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter] Skipping task ':pmdTest' as it has no source files and no previous output files.
11:26:46.156 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
11:26:46.156 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':pmdTest'
11:26:46.156 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :pmdTest NO-SOURCE
11:26:46.157 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Task :pmdTest'
11:26:46.157 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :pmdTest' completed
11:26:46.157 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :pmdTest (Thread[Task worker for ':',5,main]) completed. Took 0.002 secs.
11:26:46.157 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 completed (1 worker(s) in use)
11:26:46.157 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2
11:26:46.157 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
11:26:46.158 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
11:26:46.158 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 started (1 worker(s) in use).
11:26:46.158 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2
11:26:46.162 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :test (Thread[Task worker for ':',5,main]) started.
11:26:46.162 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :test' started
11:26:46.162 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :test
11:26:46.162 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':test'
11:26:46.162 [INFO] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':test' into context took 0.0 secs.
11:26:46.163 [INFO] [org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter] Skipping task ':test' as it has no source files and no previous output files.
11:26:46.163 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
11:26:46.164 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':test'
11:26:46.164 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :test NO-SOURCE
11:26:46.164 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Task :test'
11:26:46.164 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :test' completed
11:26:46.164 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :test (Thread[Task worker for ':',5,main]) completed. Took 0.002 secs.
11:26:46.165 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 completed (1 worker(s) in use)
11:26:46.165 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2
11:26:46.165 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
11:26:46.165 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
11:26:46.166 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 started (1 worker(s) in use).
11:26:46.166 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.2
11:26:46.166 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :check (Thread[Task worker for ':',5,main]) started.
11:26:46.167 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :check' started
11:26:46.167 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] :check
11:26:46.167 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':check'
11:26:46.167 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':check' as it has no actions.
11:26:46.167 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 2,5,main]] finished, busy: 0.0 secs, idle: 1.885 secs
11:26:46.167 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 7,5,main]] finished, busy: 0.0 secs, idle: 1.883 secs
11:26:46.168 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Daemon worker Thread 3,5,main]] finished, busy: 0.0 secs, idle: 1.884 secs
11:26:46.168 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':check'
11:26:46.168 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 4,5,main]] finished, busy: 0.0 secs, idle: 1.886 secs
11:26:46.168 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 3,5,main]] finished, busy: 0.0 secs, idle: 1.886 secs
11:26:46.168 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 6,5,main]] finished, busy: 0.0 secs, idle: 1.884 secs
11:26:46.168 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 5,5,main]] finished, busy: 0.0 secs, idle: 1.884 secs
11:26:46.168 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Task :check'
11:26:46.169 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Task :check' completed
11:26:46.169 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :check (Thread[Task worker for ':',5,main]) completed. Took 0.002 secs.
11:26:46.169 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2 completed (1 worker(s) in use)
11:26:46.169 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.2
11:26:46.169 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
11:26:46.169 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':',5,main]] finished, busy: 1.853 secs, idle: 0.034 secs
11:26:46.171 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskGraphExecuter] Timing: Executing the DAG took 1.906 secs
11:26:46.171 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Run tasks'
11:26:46.171 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Run tasks' completed
11:26:46.172 [LIFECYCLE] [org.gradle.internal.buildevents.BuildResultLogger]
11:26:46.172 [LIFECYCLE] [org.gradle.internal.buildevents.BuildResultLogger] BUILD SUCCESSFUL in 3s
11:26:46.172 [LIFECYCLE] [org.gradle.internal.buildevents.BuildResultLogger] 3 actionable tasks: 3 executed
11:26:46.173 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1 completed (0 worker(s) in use)
11:26:46.173 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 3: released lock on root.1
11:26:46.173 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Completing Build operation 'Run build'
11:26:46.173 [DEBUG] [org.gradle.internal.progress.DefaultBuildOperationExecutor] Build operation 'Run build' completed
11:26:46.179 [DEBUG] [org.gradle.api.internal.project.antbuilder.FinalizerThread] Removing classloader from cache, classpath = [file:me/.gradle/caches/modules-2/files-2.1/net.sourceforge.pmd/pmd-java/5.6.1/46ad6085ce19c42eb2c307d61aba2a49eb6c766e/pmd-java-5.6.1.jar, file:me/.gradle/caches/modules-2/files-2.1/net.sourceforge.pmd/pmd-core/5.6.1/3b84927ff8b1aa10d2da5ced359437f54a08da41/pmd-core-5.6.1.jar, file:me/.gradle/caches/modules-2/files-2.1/jaxen/jaxen/1.1.6/3f8c36d9a0578e8e98f030c662b69888b1430ac0/jaxen-1.1.6.jar, file:me/.gradle/caches/modules-2/files-2.1/net.java.dev.javacc/javacc/5.0/f19b7d4278b837fe92504946e6860b0bcc180956/javacc-5.0.jar, file:me/.gradle/caches/modules-2/files-2.1/net.sourceforge.saxon/saxon/9.1.0.8/9ffdd08cb74563cbd431c845238b414e933a0483/saxon-9.1.0.8.jar, file:me/.gradle/caches/modules-2/files-2.1/net.sourceforge.saxon/saxon/9.1.0.8/d3bc6741b15bb4c57626708287a2417ab5f67ee6/saxon-9.1.0.8-dom.jar, file:me/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm/5.0.4/da08b8cce7bbf903602a25a3a163ae252435795/asm-5.0.4.jar, file:me/.gradle/caches/modules-2/files-2.1/com.beust/jcommander/1.48/bfcb96281ea3b59d626704f74bc6d625ff51cbce/jcommander-1.48.jar, file:me/.gradle/caches/modules-2/files-2.1/commons-io/commons-io/2.4/b1b6ea3b7e4aa4f492509a4952029cd8e48019ad/commons-io-2.4.jar, file:me/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-lang3/3.4/5fe28b9518e58819180a43a850fbc0dd24b7c050/commons-lang3-3.4.jar, file:me/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.5/686c608d1805b6d4d425ec4459e88164ffc85870/gson-2.5.jar]
11:26:46.179 [DEBUG] [org.gradle.api.internal.project.antbuilder.FinalizerThread] Shutdown of classloader cache in progress
11:26:46.204 [DEBUG] [org.gradle.api.internal.project.antbuilder.FinalizerThread] Completed shutdown
11:26:46.205 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.205 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.205 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.205 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.205 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.205 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.205 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.205 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.206 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.206 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.206 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.206 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.206 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.206 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.207 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.208 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.208 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.208 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.208 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.209 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.209 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.209 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.209 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.209 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.209 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.209 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.209 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.210 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.210 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.210 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.210 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.210 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.210 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.210 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.210 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.210 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.211 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.211 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.211 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.211 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.211 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.211 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.211 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.211 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.212 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.212 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.212 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.212 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.212 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.212 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.212 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.213 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.213 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.213 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.213 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.213 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.213 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.213 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.213 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.213 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.213 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.214 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.214 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.214 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.214 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.214 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.214 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.215 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.215 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.215 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.215 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.215 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.215 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.215 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.216 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.216 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.216 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.216 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.216 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.216 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.216 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.217 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.218 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.218 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.218 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.218 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.218 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.218 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.218 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.218 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.218 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.218 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.219 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.219 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.219 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.219 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.219 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.219 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.219 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.219 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.220 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.220 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.220 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.220 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.220 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.220 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.220 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.221 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.221 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.221 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.221 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.221 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.221 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.221 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.221 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.222 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.222 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.222 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.222 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.222 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.222 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.222 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.223 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.223 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.223 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.223 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.223 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.223 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.223 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.223 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.223 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.223 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.224 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.224 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.224 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.224 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.225 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.225 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.225 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.225 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.225 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.226 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.226 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.227 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.227 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.227 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.227 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.229 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.229 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.229 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.229 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.229 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.229 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.229 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.230 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.230 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.230 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.230 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.230 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.230 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.230 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.231 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.231 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.231 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.231 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.231 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.231 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.231 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.232 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.232 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.232 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.232 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.232 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.232 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.232 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.233 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.233 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.233 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.233 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.233 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.233 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.233 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.234 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.234 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.234 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.234 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.234 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.234 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.234 [DEBUG] [org.gradle.api.internal.classloading.LeakyOnJava7GroovySystemLoader] Removed ClassInfo from org.codehaus.groovy.reflection.ClassInfo$Sentinel loaded by org.gradle.internal.classloader.VisitableURLClassLoader@5953a843
11:26:46.239 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for file content cache (me/repos/pmdTest/.gradle/4.3.1/fileContent)
11:26:46.240 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on file content cache (me/repos/pmdTest/.gradle/4.3.1/fileContent).
11:26:46.241 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for task history cache (me/repos/pmdTest/.gradle/4.3.1/taskHistory)
11:26:46.241 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache taskHistory.bin (me/repos/pmdTest/.gradle/4.3.1/taskHistory/taskHistory.bin)
11:26:46.241 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on task history cache (me/repos/pmdTest/.gradle/4.3.1/taskHistory).
11:26:46.242 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for Build Output Cleanup Cache (me/repos/pmdTest/.gradle/buildOutputCleanup)
11:26:46.242 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache outputFiles.bin (me/repos/pmdTest/.gradle/buildOutputCleanup/outputFiles.bin)
11:26:46.243 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on Build Output Cleanup Cache (me/repos/pmdTest/.gradle/buildOutputCleanup).
11:26:46.247 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.store.CachedStoreFactory] Resolution result cache closed. Cache reads: 0, disk reads: 0 (avg: 0.0 secs, total: 0.0 secs)
11:26:46.247 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.store.CachedStoreFactory] Resolution result cache closed. Cache reads: 0, disk reads: 0 (avg: 0.0 secs, total: 0.0 secs)
11:26:46.247 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.store.ResolutionResultsStoreFactory] Deleted 2 resolution results binary files in 0.002 secs
11:26:46.248 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Cache Plugin Resolution Cache (me/.gradle/caches/4.3.1/plugin-resolution) was closed 0 times.
11:26:46.251 [DEBUG] [org.gradle.deployment.internal.DefaultDeploymentRegistry] Stopping 0 deployment handles
11:26:46.251 [DEBUG] [org.gradle.deployment.internal.DefaultDeploymentRegistry] Stopped deployment handles
11:26:46.259 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for Artifact transforms cache (me/.gradle/caches/transforms-1)
11:26:46.260 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on Artifact transforms cache (me/.gradle/caches/transforms-1).
11:26:46.260 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Cache Generated Gradle JARs cache (me/.gradle/caches/4.3.1/generated-gradle-jars) was closed 0 times.
11:26:46.261 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for file hash cache (me/repos/pmdTest/.gradle/4.3.1/fileHashes)
11:26:46.261 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache fileHashes.bin (me/repos/pmdTest/.gradle/4.3.1/fileHashes/fileHashes.bin)
11:26:46.263 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on file hash cache (me/repos/pmdTest/.gradle/4.3.1/fileHashes).
11:26:46.264 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for artifact cache (me/.gradle/caches/modules-2)
11:26:46.265 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache artifact-at-repository.bin (me/.gradle/caches/modules-2/metadata-2.31/artifact-at-repository.bin)
11:26:46.265 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache module-metadata.bin (me/.gradle/caches/modules-2/metadata-2.31/module-metadata.bin)
11:26:46.265 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on artifact cache (me/.gradle/caches/modules-2).
11:26:46.266 [DEBUG] [org.gradle.launcher.daemon.server.exec.ExecuteBuild] The daemon has finished executing the build.
11:26:46.315 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClientInputForwarder] Dispatching close input message: org.gradle.launcher.daemon.protocol.CloseInput@2701795d
11:26:46.316 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClientConnection] thread 14: dispatching class org.gradle.launcher.daemon.protocol.CloseInput
11:26:46.320 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClient] Received result Success[value=null] from daemon DaemonInfo{pid=60000, address=[66d8ab91-38b0-46e8-af84-306e8f30995d port:65347, addresses:[/0:0:0:0:0:0:0:1, /127.0.0.1]], state=Idle, lastBusy=1510939169800, context=DefaultDaemonContext[uid=3e904587-e12a-4690-8f94-2f2d1d48b174,javaHome=/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home,daemonRegistryDir=me/.gradle/daemon,pid=60000,idleTimeout=10800000,daemonOpts=-XX:+HeapDumpOnOutOfMemoryError,-Xmx1024m,-Dfile.encoding=UTF-8,-Duser.country=US,-Duser.language=en,-Duser.variant]} (build should be done).
11:26:46.320 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClientConnection] thread 1: dispatching class org.gradle.launcher.daemon.protocol.Finished
11:26:46.322 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClientConnection] thread 1: connection stop
```
