package S1_Constructor;
public class Sample7
{
    //4: constructor overloading

    int num1;
    int num2;

   //user defined without parameter
    Sample7()
    {
        num1=10;
        num2=20;
    }

    //constructor with 2 int parameter
    Sample7(int a, int b)   //a=9, b=15
    {
        num1=a;     //9
        num2=b;     //15
    }

    Sample7(int a)
    {
        num1=a;
    }


    public void squareOfNum()
    {
        System.out.println(num1*num1);
    }

    public void cubeOfNum()
    {
        System.out.println(num1*num1*num1);
    }

    public void add()
    {
        System.out.println(num1+num2);
    }

    public void mult()
    {
        System.out.println(num1*num2);
    }


    public static void main(String[] args) {
        Sample7 s7=new Sample7();
        s7.add();
        s7.mult();

        System.out.println("---");


        Sample7 s8=new Sample7(9,15);
        s8.add();
        s8.mult();

        System.out.println("---");


        Sample7 s9=new Sample7(8);
        s9.squareOfNum();
        s9.cubeOfNum();

    }
}
