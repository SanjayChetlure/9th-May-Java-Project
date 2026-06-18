package S1_Method;
public class Sample9
{
    //6.1: method with parameter

    public static void main(String[] args)
    {
        addition(10,20);
        addition(11,12);
        addition(40,45);

        System.out.println("---");

        Sample9 s9=new Sample9();
        s9.multiplication(5,8);
        s9.multiplication(10,12);

        System.out.println("---------------------------------");

        Sample10.substraction(40,22);
        Sample10.substraction(3,7);

        System.out.println("----");

        Sample10 s10=new Sample10();
        s10.squareOfNum(8);
        s10.squareOfNum(6);
    }


    //method with 2 int (int, int) parameter
    public static void addition(int num1, int num2)       //num1=40, num2=45    //variable declaration
    {
        int sum=num1+num2;         //40+45= 85 variable usage
        System.out.println(sum);
    }

    public void multiplication(int num1, int num2)
    {
        int mult=num1*num2;
        System.out.println(mult);
    }

}
