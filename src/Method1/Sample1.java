package Method1;
public class Sample1
{
    //1: static regular method call from same class

    //main method
    public static void main(String[] args)     //pre-defined method
    {
        System.out.println("main method started");

        m1();      //methodName();
        m2();
        m2();

        System.out.println("main method ended");
    }

    //static ->regular method
    public static void m1()        //user defined method
    {
        System.out.println("running static regular method m1 from same class");
    }

    //static ->regular method
    public static void m2()        //user defined method
    {
        System.out.println("running static regular method m2 from same class");
    }

}
