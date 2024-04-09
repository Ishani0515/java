class CData
{
   float pi=3.142f;
    int r=5;
}
class Area extends CData
{
    void calArea()
    {
        System.out.println("Area of Circle="+pi*r*r);
    }
}
class Perimeter extends CData
{
    void calPeri()
    {
        System.out.println("Perimeter of Circle="+2*pi*r);
    }
}
class CircleCal
{
   public static void main(String args[])
   {
      Area c1=new Area();
      Perimeter c2=new Perimeter();
      c1.calArea();
      c2.calPeri();
    }
}