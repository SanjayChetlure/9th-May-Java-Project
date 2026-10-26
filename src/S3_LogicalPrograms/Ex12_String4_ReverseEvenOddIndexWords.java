package S3_LogicalPrograms;
public class Ex12_String4_ReverseEvenOddIndexWords
{
    public static void main(String[] args)
    {
        String s1="my name is abc";      // ym eman si cba
        String [] ar=s1.split(" ");      // {my(0), name(1), is(2), abc(3)}

        //           4<=3
        for(int i=0; i<=ar.length-1; i++)
        {
            String org = ar[i];     //abc
            if(i%2==1)   //3%2=1==0
            {
                System.out.print(reverseString(org)+" ");  //ym
            }
            else
            {
                System.out.print(org+" ");
            }

            //ym name si abc
        }
    }

    public  static String reverseString(String org)
    {
        String rev="";
        for(int j=org.length()-1; j>=0; j--)
        {
            rev=rev+org.charAt(j);
        }
        return rev;
    }
}
