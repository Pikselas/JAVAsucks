import java.io.BufferedReader;
import java.io.InputStreamReader;

class Prime
  {
    public static void PrintPrime(int StartPoint , int EndPoint)
    {
      for(int i = StartPoint ; i <= EndPoint ; ++i)
        {
          int Half = i / 2;
          boolean IsPrime = true;
          for(int j = 2 ; j <= Half ; ++j)
            {
              if(i % j == 0)
              {
                IsPrime = false;
                break;
              }
            }
          if(IsPrime)
          {
            System.out.println(i);
          }
       }
     }
  public static void main(String args[])
        {
          try
            {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter Numbers:");
          String s[] = br.readLine().split("\\s+");
          PrintPrime(Integer.parseInt(s[0]) , Integer.parseInt(s[1]));
              }
          catch(Exception e)
                {
                  System.out.println("err");
                }
        }
  }