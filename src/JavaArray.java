public class JavaArray {
    public static void main(String args[])
    {
        String [] a = {"asaeiedf","saaiefsg","fghaaeijs"};
      int Maxcount=0;
      String Maxword="";


                  for (  String e:a) {
                      String [] words=e.split("\\s+");
                      for(String word:words)
                      {
                          int count=0;
                          for(int i=0;i<word.length();i++)
                          {
                              if(word.charAt(i)=='a'||word.charAt(i)=='e'
                                      ||word.charAt(i)=='i'|| word.charAt(i)=='o'|| word.charAt(i)=='u')
                              {
                                  count=count+1;
                              }
                          }
                          if(count>Maxcount)
                          {
                              Maxword=word;
                            Maxcount=count;
                          }
                      }
                  }
        System.out.println("Maximum vowels in a given array containing a word is "+Maxword);
              }
    }

