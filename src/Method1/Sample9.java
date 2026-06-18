package Method1;

public class Sample9
{
    //6: example of method with parameter

    public static void main(String[] args)
    {
            add(10,20);                             //2: variable initialization
            add(5,6);
            add(100,200);

        System.out.println("----------");

        Sample9 s9=new Sample9();
        s9.mult(5,6);
        s9.mult(40,30);

        System.out.println("------");

        Sample10.squareOfNum(5);
        Sample10.squareOfNum(7);
    }


    //method with 2 int(int, int) parameter method
    public static void add(int num1, int num2)     //num1=5, num2=6  //1: variable declaration
    {
        int sum=num1+num2;       //5+6=11                    //3: variable usage
        System.out.println(sum);
    }


    //method with 2 int parameter
    public void mult(int num1, int num2)    //num1=40, num2=30
    {
        int multValue=num1*num2;        //5*6=30
        System.out.println(multValue);
    }

}
