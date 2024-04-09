class SAlpha extends Thread
  {
     public void run()
     {
          for(char i='a';i<='z';i++)
            System.out.print(" "+i);
     }
  }