package S2_Interface_ImplementationClass;

public class Ex3_TestRunningDefaultMethodsInInterface
{
    public static void main(String[] args) {

        Jio j=new Jio();
        j.data();
        j.ac();
        j.sms();

        System.out.println("----");

        VI v=new VI();
        v.data();
        v.ac();
        v.sms();


    }
}
