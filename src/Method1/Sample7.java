package Method1;
public class Sample7
{
    //5: example of method without/zero parameter

    public static void main(String[] args)
    {
        //1: static method call from same class
        m1();                    //methodName()

        //2: static method call from diff class
        Sample8.m2();            //diffClassName.methodName()

        //3: non-static method call from same class
        Sample7 s7=new Sample7();   //1: create object of same class
        s7.m3();                    //2: method call -> sameClassObjectName.methodName()

        //4: non-static method call from diff class
        Sample8 s8=new Sample8();       //1: create object of diff class
        s8.m4();                        //2: method call -> diffClassObjectName.methodName()
    }

    public static void m1()   //method without parameter
    {
        System.out.println("running static method m1 from same class");
    }

    public void m3()        //method without parameter
    {
        System.out.println("running non-static method m3 from same class");
    }

}
