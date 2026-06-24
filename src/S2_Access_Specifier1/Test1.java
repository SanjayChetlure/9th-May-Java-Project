package S2_Access_Specifier1;

public class Test1
{
    int num2;      //default access specifier


    Test1()         //default access specifier
    {
        num2=20;
    }

    void m1()       //default access specifier
    {
        System.out.println(num2*num2);
    }


    public static void main(String[] args)
    {
        Test1 t1=new Test1();
        t1.m1();
        System.out.println(t1.num2);
    }


}
