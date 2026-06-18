package S1_Conditional_Statemet;
public class Ex4_nested_if1
{
    public static void main(String[] args)
    {
            int PEM=350;

            //350>=300
            if(PEM>=300)      //outer if
            {
                System.out.println("Selected in prelim exam");
                System.out.println("preparing for mains exam");

                int MEM=800;
                //800>=800
                if(MEM>=800)         //nested or inner if
                {
                    System.out.println("Selected in main exam");
                }
                else
                {
                    System.out.println("Rejected from main exam");
                }
            }
            else
            {
                System.out.println("Rejected from prelim exam");
            }
    }
}
