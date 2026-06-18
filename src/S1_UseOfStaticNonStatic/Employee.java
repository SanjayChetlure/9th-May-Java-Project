package S1_UseOfStaticNonStatic;
public class Employee
{
    String empName;
    int empId;
//    String empCEOName;
    static String empCEOName;


    public void empInfo()
    {
        System.out.println("Emp Name: "+empName);
        System.out.println("Emp ID: "+empId);
        System.out.println("Emp CEO Name: "+empCEOName);
    }

}
