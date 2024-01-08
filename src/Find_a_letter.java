public class Find_a_letter {
    public static void main(String[] args) {
        String a []={"sanket","vijays","rohans"};
        for(String e:a)
        {
            String word[]=e.split("\\s+");
            for(String words:word)
            {
                for(int i=0;i<words.length();i++)
                {
                  if(words.charAt(i)=='a')
                  {
                      System.out.println(i);
                  }
                }
            }
        }
    }
}
