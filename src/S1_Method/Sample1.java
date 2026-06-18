package S1_Method;
public class Sample1
{
//    1. static regular method call from same class       --> methodName();

    //main method (Pre-defined method)
    public static void main(String[] args)
    {
        System.out.println("main method started");
        m1();             //method call -> methodName();
        m1();
        m2();

        System.out.println("main method ended");
    }


    //static ->regular method (user defined)
    public static void m1()
    {
        System.out.println("Running method m1");
    }

    //static ->regular method (user defined)
    public static void m2()
    {
        System.out.println("Running method m2");
    }

}
