package S1_Loops;
public class DoWhile1_printNumFrom_1_to_5
{
    public static void main(String[] args)
    {
        int i=1;
            //6<=5
        while(i<=5)
        {
            System.out.println(i);    //1 2 3 4 5
            i++;         //6
        }

        System.out.println("-----------");

        int j=1;           //1: startNum
        do
        {
            System.out.println(j);  //1 2 3 4 5 //statement
            j++;        //6                    //3: incr/decr
        }
        while (j<=5);
        //  6<=5
    }
}
