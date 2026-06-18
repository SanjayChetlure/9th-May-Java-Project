package S1_UseOfStaticNonStatic;
public class EmpDetails
{
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        e1.empName="Amol";
        e1.empId=101;
//        e1.empCEOName="abc";
        Employee.empCEOName="abc";

        Employee e2=new Employee();
        e2.empName="mahesh";
        e2.empId=102;
//        e2.empCEOName="abc";
        Employee.empCEOName="xyz";

        Employee e3=new Employee();
        e3.empName="ramesh";
        e3.empId=103;
//        e3.empCEOName="xyz";
        Employee.empCEOName="lmn";


        e1.empInfo();
        System.out.println("---");
        e2.empInfo();
        System.out.println("---");
        e3.empInfo();

    }
}
