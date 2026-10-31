package S3_StarPattern;

public class Pattern3
{
    public static void main(String[] args)
    {
        //***
        //***

        //           3<=2
        for(int i=1; i<=2; i++)             //1: outer for loop -> rows
        {  //            4<=3
            for(int j=1; j<=3; j++)         //2: inner for loop -> cols
            {
                System.out.print("*");      //3: print star using print()
            }
            System.out.println();           //4: after inner for loop -> call empty println() stat
        }


        //***
        //***
        //
    }
}
