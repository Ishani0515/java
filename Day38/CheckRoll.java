
class CheckRoll
{
    void showRoll(int r) throws NegativeNumberException
    {
        if(r<0)
           throw new NegativeNumberException(r);
       System.out.println("Valid roll");
     }
   public static void main(String args[])
   {
     CheckRoll ob=new CheckRoll();
      try
       {
          ob.showRoll(10);
          ob.showRoll(-6);
       }
      catch(NegativeNumberException e)
      {
        System.out.println("Not valid roll number");
      }
   }
}