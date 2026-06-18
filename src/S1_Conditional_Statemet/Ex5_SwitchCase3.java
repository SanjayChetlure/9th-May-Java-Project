package S1_Conditional_Statemet;
public class Ex5_SwitchCase3
{
    public static void main(String[] args)
    {
        switch ("AA")
        {
            case "BI":
                System.out.println("running BI Code");
                break;
            case "MS":
                System.out.println("running MS Code");
                break;
            case "MT":
                System.out.println("running MT Code");
                break;
            case "CD":
                System.out.println("running CD Code");
                break;
            case "CW":
                System.out.println("running CW Code");
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
        System.out.println("hi");
    }
}
