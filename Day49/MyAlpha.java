class MyA extends Thread
  {
     public void run()
     {
        System.out.println(getName());
          for(char i='A';i<='G';i++)
            System.out.print(" "+i);
     }
  }
  class MyAlpha
   {
      public static void main(String args[])
      {
           MyA ob=new MyA();
           MyA ob1=new MyA();
           ob.start();    
           ob1.start();
      }
  }