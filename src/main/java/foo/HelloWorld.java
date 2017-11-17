package foo;

/**
 * Should be obvious
 */
public class HelloWorld
{
    /**
     * My Main
     * @param args the args
     */
    public static final void main(final String ... args){
        final HelloWorld hello = new foo.HelloWorld();
        hello.hello();
    }

    /**
     * pointless method
     */
    public void hello(){
        System.out.println("\nHello World!\n");
    }

}
