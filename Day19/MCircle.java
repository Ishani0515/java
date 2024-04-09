class PValue
{
    float pi=3.142f;
}
class Dimen extends PValue
{
   int r=5;
   void calArea()
   {
     System.out.println("Area of Circle="+pi*r*r);
   }
}
class MCircle extends Dimen
{
    public static void main(String args[])
    {
      MCircle c1=new MCircle();
      c1.calArea();
            
    }
}