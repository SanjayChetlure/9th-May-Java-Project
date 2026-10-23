package S3_LogicalPrograms;

public class Ex12_String2_PrintStatementInreverseOrder
{
    public static void main(String[] args)
    {
        String s1="my name is abc";    // o/p -> abc is name my

        String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}


        for(int i=ar.length-1; i>=0; i--)
        {
            System.out.print(ar[i]+ " ");
        }
    }
}
