class My extends Thread
  {
     public void run()
     {
        System.out.println(currentThread());
     }
  }
  class MyT
   {
      public static void main(String args[])
      {
           My ob=new My();
           My ob1=new My();
           ob.start();    
           ob1.start();
      }
  }