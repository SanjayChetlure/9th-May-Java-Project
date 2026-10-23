package S3_LogicalPrograms;

public class Ex12_MultTwoNumber_WithoutMultOperator
{
    public static void main(String[] args)
    {
        int num1=4;
        int num2=3;
        int sum=0;

        //           5<=4
        for(int i=1; i<=num1; i++)
        {
            sum=sum+num2;   //0+3=3+3=6+3=9+3=12
        }
        System.out.println(sum);
    }

    // 3     4+4+4=12
    // 4     3+3+3+3=12



}
