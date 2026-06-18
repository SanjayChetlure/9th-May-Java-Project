package S1_Constructor;
public class Sample3
{
    //2: Example of user defined without/zero parameter constructor

      //1: declaration of variable
    int num1;           //10
    int num2;           //20

    //user defined constructor -> provided by programmer/user
    //use1: initialize global variable
    //use2: to copy all the non-static members(method,variables) of class into object
    Sample3()      //without/zero parameter constructor
    {
        num1=10;
        num2=20;
    }


    public void add()
    {
        System.out.println(num1+num2);
    }

    public void mult()
    {
        System.out.println(num1*num2);
    }


    public static void main(String[] args)
    {
        Sample3 s3=new Sample3();          //without parameter user defined constructor call from same class
        s3.add();
        s3.mult();

        System.out.println("-------------");

        Sample4 s4=new Sample4();    //user defined constructor call from diff class
        s4.sub();
        s4.div();

    }
}
