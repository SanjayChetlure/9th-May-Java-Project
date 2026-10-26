package S3_LogicalPrograms;
public class Ex12_String3_ReverseEachWordInStatement2
{
    public static void main(String[] args)
    {
        String s1="my name is abc";      // ym eman si cba
        String [] ar=s1.split(" ");      // {my(0), name(1), is(2), abc(3)}

        //           3<=3
        for(int i=0; i<=ar.length-1; i++)
        {
            String org = ar[i];     //abc
            System.out.print(reverseString(org)+" ");      //ym eman si cba
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
