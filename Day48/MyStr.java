class MyStr extends Thread
{
    String n="This is java program";
    public void run()
    {
      try{
       for(int i=0;i<n.length();i++)
       {
          System.out.print(n.charAt(i));
          sleep(500);
       }
      }catch(InterruptedException e){}
    }
     public static void main(String args[])
     {
       MyStr t=new MyStr();
        t.start();
    }
}