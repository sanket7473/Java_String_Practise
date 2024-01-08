import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Non_Repeating_Word {
    public static void main(String[] args) {

        String []a= {"safghs","sghasghs","dfhgsgds"};

        Set<String> stringSet = new HashSet<>(Arrays.asList(a));
        System.out.println(stringSet);
    }
}
