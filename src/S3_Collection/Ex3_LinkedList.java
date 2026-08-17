package S3_Collection;
import java.util.LinkedList;
public class Ex3_LinkedList
{
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        ll.add("ramesh");
        ll.add(101);
        ll.add('B');
        ll.add(92.1f);
        ll.add(null);
        ll.add(101);
        ll.add(null);

        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.isEmpty());
        System.out.println(ll.contains("ramesh"));
        System.out.println(ll.get(3));
    }

}
