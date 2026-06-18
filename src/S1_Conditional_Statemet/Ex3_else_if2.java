package S1_Conditional_Statemet;
public class Ex3_else_if2
{
    public static void main(String[] args)
    {
        int marks=76;

        // 76>=65
        if(marks>=65)      //condition1
        {
            System.out.println("distinction");
        }
        //    32>=60   &  61<65
        else if(marks>=60  & marks<65)         //condition2
        {
            System.out.println("1st class");
        }
        //       32>=50  &  50<60
        else if(marks>=50 & marks<60)         //condition3
        {
            System.out.println("2nd class");
        }
        //  32>=35   &  40<50
        else if(marks>=35 & marks<50)         //condition4
        {
            System.out.println("pass");
        }
        else           //condition5
        {
            System.out.println("Fail");
        }
    }
}
