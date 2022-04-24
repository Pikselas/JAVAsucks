import java.io.BufferedReader;
import java.io.InputStreamReader;

class ReverseString
  {
    public static void main(String[] args)
    {
      try
      {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter String:");
        String s = br.readLine();
      String Reversed = "";
      for(int i = 0  ; i < s.length(); ++i)
        {
          Reversed = s.charAt(i) + Reversed;
        }
      System.out.println(Reversed);
        }
      catch(Exception e) 
            {
              
            }
    }
  }