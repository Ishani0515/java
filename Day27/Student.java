final class Favorite
{
   final String food="Paneer";
}
class Student extends Favorite   //can not be inherited
{
    public static void main(String args[])
    {
      Student ob=new Student();
      System.out.print(ob.food);
    }
}