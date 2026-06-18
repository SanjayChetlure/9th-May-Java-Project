package S1_Method;
public class Sample11
{
    public static void main(String[] args)
    {
        printStudentName("mahesh");
        printStudentName("ganesh");

        System.out.println("----");

        printStudentFullName("ganesh","patil");
    }


    //method with String parameter
    public static void printStudentName(String name)
    {
        System.out.println(name);
    }

    //method with m 2 String (String,String) parameter
    public static void printStudentFullName(String fn, String ln)
    {
        System.out.println(fn + " " + ln);
    }
}
