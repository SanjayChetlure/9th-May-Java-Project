package S2_Interface_ImplementationClass;
//super interface
public interface SimCard
{
    void data();


    void ac();

    //default method in interface
    default void sms()
    {
        System.out.println("sms: 100");
    }

}
