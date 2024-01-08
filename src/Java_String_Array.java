public class Java_String_Array {
    public static void main(String[] args) {
        String e[]={"hellooo","dfgsoh","dghdsoooooh"};
        for(String a:e)
        {
            String [] words=a.split("\\s+");
            for(String word:words)
            {
                int count=0;
                for(int i=0;i<word.length();i++)
                {
                    if(word.charAt(i)=='o')
                    {
                        count=count+1;
                    }
                }
                System.out.println("Maximum count of o in a given word is "+count);
                
            }
        }
    }
}
