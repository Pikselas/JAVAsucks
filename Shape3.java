interface Shape
  {
    public double CalculatePerimeter();
  }

class Square implements Shape
  {
    double side;
    Square(double side)
    {
      this.side = side;
    }
    @Override
    public double CalculatePerimeter()
    {
      return 4 * side;
    }
  }

class Circle implements Shape
  {
    double radius;
    Circle(double radius)
    {
      this.radius = radius;
    }
    @Override
    public double CalculatePerimeter()
    {
      return 2 * 3.14 * radius;
    }
  }

class Shape3
  {
    public static void main(String args[])
    {
      Square s = new Square(10);
      Circle c = new Circle(10);
      System.out.println(s.CalculatePerimeter());
      System.out.println(c.CalculatePerimeter());
    }
  }