class MyE
{
     final void show()    //can not be overrided
     {
        System.out.print("I am show of My");
     }
}
class MyDemo extends MyE
{
    void show1()
     {
        System.out.print("I am show of MyDemo");
     }
   public static void main(String args[])
   {
       MyDemo ob=new MyDemo();
       ob.show();
       ob.show1();
   }
}