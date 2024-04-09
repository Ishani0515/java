class My        //Outer class
{
    My()
    {
        In ob1=new In();
          ob1.show();
    }
     void showM()
     {
          System.out.println("I am showM of My");
     }
    class In     //inner class
    {
         void show()
         {
          System.out.println("I am show of In");
         }
    }
   public static void main(String args[])
   {
       My ob=new My();
       ob.showM();
   }
}