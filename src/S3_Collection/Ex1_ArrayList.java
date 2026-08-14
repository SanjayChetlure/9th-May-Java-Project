package S3_Collection;
import java.util.ArrayList;
public class Ex1_ArrayList
{
    public static void main(String[] args) {

//        ArrayList al=new ArrayList();                      //initial/default capacity=10
        ArrayList al=new ArrayList(20);         //initial capacity=20
        al.add("Amol");
        al.add(101);
        al.add('A');
        al.add(78.4f);
        al.add(null);
        al.add(101);
        al.add(null);


        System.out.println(al);
        System.out.println(al.size());

        System.out.println(al.isEmpty());    //false
        System.out.println(al.get(2));

        //update data
        al.set(2,'B');

        System.out.println(al);





    }
}
