package S1_Constructor;
public class Sample6
{
    int num3;
    int num4;

    //user defined with 2 int parameter constructor
    Sample6(int c, int d)     //c=7, d=9
    {
        num3 = c;             //assign local variable info into global variable
        num4 = d;
    }

    public void sub()
    {
        System.out.println(num3 - num4);
    }

    public void div()
    {
        System.out.println(num3 / num4);
    }

}
