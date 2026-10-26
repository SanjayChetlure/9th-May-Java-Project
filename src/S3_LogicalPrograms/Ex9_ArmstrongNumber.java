package S3_LogicalPrograms;
public class Ex9_ArmstrongNumber
{
    public static void main(String[] args)
    {
        int num=122;                 //1 + 125 +27= 153
        int orgNum=num;              //153
        int sum=0;                   // 153

        while(num>0)     //    0>0
        {
            int rem=num%10;             //1%10 = 1
            sum=sum+rem*rem*rem;        //152 + 1 = 153

            num=num/10; // 15/10= 1/10=0
        }

        if(orgNum==sum)    //153==153
        {
            System.out.println("given number is armstrong num");
        }
        else
        {
            System.out.println("given number is not armstrong num");
        }
    }
}
