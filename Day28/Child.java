class Child implements MyRule
{
   public void showR()
    {
       System.out.println("Child should be wake up at 6.00am");
       System.out.println("Do regular excersize");
    }
    public static void main(String args[])
    {
        Child ob=new Child();
        ob.showR();
    }
   
}