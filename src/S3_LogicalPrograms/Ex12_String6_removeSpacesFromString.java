package S3_LogicalPrograms;
public class Ex12_String6_removeSpacesFromString
{
    public static void main(String[] args)
    {
        String str1 = "a b   c d";   // out -> abcd
        System.out.println(str1);

        String str2=str1.replace(" ", "");
        System.out.println(str2);


//        String str2="";
//        for(int i=0; i<=str1.length()-1; i++)
//        {
//            char s1 = str1.charAt(i);
//            if(!Character.isWhitespace(s1))
//            {
//                str2=str2+s1;
//            }
//        }
//        System.out.println(str2);

    }
}
