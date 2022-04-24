import java.io.BufferedReader;
import java.io.InputStreamReader;

class Cities
  {
    public static void main(String args[])
    {
       try
            {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter 5 cities:");
          String cities[] = br.readLine().split("\\s+");

        for(int i = 0 ; i < cities.length ; ++i)
        {
          for(int j = i ; j < cities.length ; ++j)
            {
              if(cities[j].compareTo(cities[i]) < 0)
              {
                String tm = cities[i];
                cities[i] = cities[j];
                cities[j] = tm;
              }
            }
        }
        for(String s : cities)
        {
          System.out.println(s);
        }
              }
          catch(Exception e)
                {
                  System.out.println("err");
                }
        }
  }