
abstract class Shape
  {
    abstract public double CalculateArea(int ra);
  }

class Circle extends Shape
  {
    @Override
    public double CalculateArea(int ra)
    {
      return 3.14 * ra * ra;
    }
  }

class Square extends Shape
  {
    @Override
    public double CalculateArea(int ra)
    {
      return  ra * ra;
    }
  }

class Shape2
  {
    public static void main(String args[])
      {
        Shape s = new Square();
        Shape c = new Circle();
        System.out.println("Circle " + s.CalculateArea(10));
        System.out.println("Circle " + c.CalculateArea(10));
      }
  }