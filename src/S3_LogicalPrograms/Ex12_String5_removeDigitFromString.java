package S3_LogicalPrograms;
public class Ex12_String5_removeDigitFromString
{
    public static void main(String[] args)
    {
        String str1="5abcd123xyz #";   // out  -> abcdxyz #
        String str2="";  //a

        //	         0<=
        for(int i=0; i<=str1.length()-1; i++)
        {
            char s1 = str1.charAt(i);  //b
            if(!Character.isDigit(s1))  //a    #className.methodName(char)
            {
                str2=str2+s1;  //    =a + b= ab
            }
        }
        System.out.println(str2);
    }
}
