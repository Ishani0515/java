class Alpha extends Thread   
{
     public void run()
     {
          for(char i='A';i<='Z';i++)
            System.out.print(" "+i);
     }
}