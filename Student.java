import java.io.BufferedReader;
import java.io.InputStreamReader;

class Student
  {
    int Marks;
    Student(int mark)
    {
      Marks = mark;
    }
    static int CalculateAverage(Student[] std)
    {
      int Total = 0;
      for(Student s : std)
        {
          Total += s.Marks;
        }
      return Total / std.length;
    }
    public static void main(String args[])
    {
      try
            {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter Marks:");
          String s[] = br.readLine().split("\\s+");
          Student std[] = new Student[s.length];
          for(int i = 0 ; i < s.length ; ++i)
            {
              std[i] = new Student(Integer.parseInt(s[i]));
            }
              System.out.println(CalculateAverage(std));
          }
          catch(Exception e)
                {
                  System.out.println("err");
                }
    }
  }