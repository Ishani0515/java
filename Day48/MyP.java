class MyS extends Thread
  {
     public void run()
     {
        System.out.println(currentThread());
     }
  }
  class MyP
   {
      public static void main(String args[])
      {
           MyS ob=new MyS();
           ob.setName("DemoThread");
           MyS ob1=new MyS();
           ob.start();    
           ob1.start();
      }
  }