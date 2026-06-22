package S2_Inheritance;
public class Ex4_HirarchicalInheritance
{
    public static void main(String[] args)
    {
        System.out.println("---Properties of Son1 class----");
        Son1 s1=new Son1();
        s1.mobile();
        s1.car();
        s1.money();
        s1.home();

        System.out.println("---Properties of Son2 class----");
        Son2 s2=new Son2();
        s2.laptop();
        s2.car();
        s2.money();
        s2.home();

        System.out.println("---Properties of Son3 class---");
        Son3 s3=new Son3();
        s3.car();
        s3.money();
        s3.home();


    }
}
