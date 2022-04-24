class Fib extends Thread
  {
    int EndPoint;
    public Fib(int GiveMeTheEndPoint)
    {
      EndPoint = GiveMeTheEndPoint;
    }
    @Override
    public void run()
    {
      int prev = 0 , afterPrev = 1;
      for(int i = 0 ;i < EndPoint ; ++i)
        {
          int Temp = afterPrev;
          System.out.println("Fib seq No:" + i + "=>" + (afterPrev += prev));
          prev = Temp;
          try
            {
          sleep(6000);
              }
          catch(Exception e)
            {
              
            }
        }
    }
  }
class Prime extends Thread
  {
    int EndPoint;
    int StartPoint;
    Prime(int StartPoint , int EndPoint)
    {
      this.EndPoint = EndPoint;
      this.StartPoint = StartPoint;
    }
    @Override
    public void run()
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
            System.out.println("PRIME =>" + i);
          }
          try
            {
          sleep(3000);
              }
          catch(Exception e)
            {
              
            }
        }
    }
  }

class thrd2
  {
    public static void main(String args[])
    {
      new Fib(100).start();
      new Prime(100 , 200).start();
    }
  }