package S3_LogicalPrograms;
public class Ex11_addTwoNumbers_WithoutAdditionOperator2
{
    public static void main(String[] args)
    {
        System.out.println(add(2, 3));
    }

    public static int add(int num1, int num2)   //num1=2,  num2=3
    {
        //           4<=3
        for(int i=1; i<=num2; i++)      // 1-3
        {
            num1++;   //2+1=3+1=4+1=5
        }
        return num1;
    }
}

//2  3 4 5
//3  4 5

