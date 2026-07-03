package S2_Generalization;
//IC3
public class CurrentAcc implements BankAccount
{
    public void CD()
    {
        System.out.println("CD: 1L");
    }

    public void CW()
    {
        System.out.println("CW: 10K");
    }

    public void MT()
    {
        System.out.println("MT: 5L");
    }
}
