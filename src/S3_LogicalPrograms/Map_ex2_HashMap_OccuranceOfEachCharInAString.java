package S3_LogicalPrograms;
import java.util.HashMap;
import java.util.Set;
public class Map_ex2_HashMap_OccuranceOfEachCharInAString
{
    public static void main(String[] args)
    {
        String str="abcaba";
        HashMap<Character, Integer> mp=new HashMap();

        //k<Character>   v<Integer>
        //a               1+1=2+1=3
        //b               1+1=2
        //c               1


        //           4<=5
        for(int i=0; i<=str.length()-1; i++)
        {
            char s1 = str.charAt(i); //a
            if(mp.containsKey(s1)) //a => true
            {
                mp.put(s1, mp.get(s1)+1); // a, 1+1=2
            }
            else
            {
                mp.put(s1, 1); //b, 1
            }
        }

        Set<Character> allKeys = mp.keySet(); //[a, b, c]

		 //Occurrence of each character
		 for(Character key:allKeys)
		 {
			 System.out.println(key+"-"+mp.get(key));
		 }

        System.out.println("---");

		//print only duplicate chars
		for(Character key:allKeys)
		{
			if(mp.get(key)>1) //condition for duplicate key
			{
				System.out.println(key+"-"+mp.get(key));
			}
		}

        System.out.println("----");

        //print only unique chars
        for(Character key:allKeys)
        {
            if(mp.get(key)==1) //condition for duplicate key
            {
                System.out.println(key+"-"+mp.get(key));
            }
        }
    }
}
