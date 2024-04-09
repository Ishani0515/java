interface BankRule
{
    void newActRule();   //public abstract void newActRule();
    public abstract void balanceRule();
}

class User implements BankRule
{
    public void newActRule()
    {
       System.out.println("New accounts need KYC");
       System.out.println("Two passport size photo");
    }
    public void balanceRule()
    {
         System.out.println("Minimum balance should be RS 1000");
         System.out.println("Single day transaction limit is Rs 20000");
    }
    public static void main(String args[])
    {
        User ob=new User();
        ob.newActRule();
        ob.balanceRule();
    }   
}