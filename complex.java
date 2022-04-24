class complex
  {
    float real , img;
    public complex(){}
    public complex(float real , float img)
    {
      Set(real , img);
    }
    public complex(complex cmlx)
    {
      Set(cmlx);
    }
    void Set(complex cmlx)
    {
      this.real = cmlx.real;
      this.img = cmlx.img;
    }
    void Set(float real , float img)
    {
      this.real = real;
      this.img = img;
    }
    complex Add(complex cmlx)
    {
      return new complex(real + cmlx.real , img + cmlx.img);
    }
    complex Sub(complex cmlx)
    {
      return new complex(real - cmlx.real , img - cmlx.img);
    }
    complex Mul(complex cmlx)
    {
     float rel_prt = real * cmlx.real - img * cmlx.img;
     float img_prt = (real * cmlx.img) + (img * cmlx.real);
     return new complex(rel_prt , img_prt);
    }
    float getReal()
    {
      return real;
    }
    float getImg()
    {
      return img;
    }
    public static void main(String args[])
    {
      complex cm1 = new complex(10 , 20);
      complex cm2 = new complex(20 , 30);
      complex cm3 = cm2.Add(cm1.Mul(cm1.Sub(cm2)));

      System.out.println(cm3.getReal() +" "+ cm3.getImg());
    }
  }