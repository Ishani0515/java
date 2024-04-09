class MultiCatch
{
   public static void main(String args[])
    {
        try
         {
             int num[]={10,2,0};
              System.out.println(num[0]/num[1]);
              System.out.println(num[0]/num[2]); //Exception thrown
              System.out.println(num[0]/num[4]);  //Exception thrown
         }
         catch(ArithmeticException e)
         {
            System.out.println("Can not be divided by zero ");
         }
         catch(ArrayIndexOutOfBoundsException e)
{
            System.out.println("Array index is not found ");
         }
    }
}