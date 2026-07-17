package S3_ExceptionHandling;

public class Ex1_Arithmatic
{
    public static void main(String[] args) {

        int num1=10;
        int num2=0;
        int div=0;

       try
       {
            div=num1/num2;    //risky code
       }
       catch (ArithmeticException e)
       {
           System.out.println("Exception handled");
       }

        System.out.println(div);
        System.out.println("Hello");

    }
}
