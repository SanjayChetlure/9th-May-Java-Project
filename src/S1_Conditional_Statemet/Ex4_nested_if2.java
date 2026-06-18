package S1_Conditional_Statemet;
public class Ex4_nested_if2
{

    public static void main(String[] args)
    {
        String UN="abc";
        String PWD="xyz";

        //abc==abc
        if(UN=="abc")       //outer if
        {
            System.out.println("correct UN entered");

            //xyz==xyz
            if(PWD=="xyz")    //inner if
            {
                System.out.println("correct PWD entered");
            }
            else
            {
                System.out.println("Wrong PWD entered");
            }
        }
        else
        {
            System.out.println("wrong UN entered");
        }

    }
}
