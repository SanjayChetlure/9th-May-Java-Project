package S2_PolyMorphism;

public class Demo2
{

    public static void main(String[] args)
    {
        System.out.println("String [] args main method");

        main(10);

    }

    public static void main(int [] args)
    {
        System.out.println("int [] args main method");
    }

    public static void main(int num1)
    {
        System.out.println("int parameter main method");
    }

}
