class ArrayIndex
{
    public static void main(String args[])
    {
       int num[]={11,22,33};
       try
        {
          System.out.println(num[0]);
          System.out.println(num[1]);
          System.out.println(num[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
           System.out.println("Array index is not found..");
        }
       finally
        {
          System.out.println("Thank You");
        }
    }

}