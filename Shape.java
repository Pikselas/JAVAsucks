import java.io.BufferedReader;
import java.io.InputStreamReader;

class Shape
  {
    int side;
    float rad;
    Shape(int a)
    {
      side = a;
    }
    Shape(float r)
    {
      rad = r;
    }
    int CalculateArea()
    {
      return side * side;
    }
    double CalculateArea(float PI)
    {
      return PI * rad * rad;
    }
    public static void main(String[] args)
    {
      try
        {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter radius and side:");
        String s[] = br.readLine().split("\\s+");
      Shape sq = new Shape(Integer.parseInt(s[1]));
      Shape c = new Shape(Float.parseFloat(s[0]));
      System.out.println("Area of Circle " +       c.CalculateArea(3.14f));
      System.out.println("Area of Square " + sq.CalculateArea());
    }catch(Exception e)
        {
          
        }
    }
  }