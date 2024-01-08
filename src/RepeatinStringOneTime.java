import java.util.HashSet;
import java.util.Set;

public class RepeatinStringOneTime {
    public static void main(String[] args) {
        String a[]={"asdfsagfsa","dfgsshga","sfgdhs"};
        String s ="";
        Set<Character> s1=new HashSet<>();
        for(String word:a)
        {
            String [] k=word.split("\\s+");
            for(int i=0;i<k.length;i++)
            {
             for(char c:k[i].toCharArray())
             {
                 s1.add(c);
             }
            }
        }
        System.out.println(s1);
    }
}
