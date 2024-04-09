class CAlpha extends Thread
  {
     public void run()    //defines working of thread
     {
          for(char i='A';i<='Z';i++)
            System.out.print(" "+i);
     }
  }