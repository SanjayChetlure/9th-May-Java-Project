package S1_Method;
public class Sample2
{
    //2: static regular method call from different class

    public static void main(String[] args)
    {
        System.out.println("main method started");

        Sample3.m3();              //DifferentClassName.methodName();
        Sample3.m4();
        Sample3.m4();


        System.out.println("main method ended");
    }
}
