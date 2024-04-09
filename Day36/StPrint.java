class StPrint
{
    public static void main(String args[])
    {            
       String n="Hello";
      try
       {
              System.out.println(n.charAt(0));
              System.out.print(n.charAt(6));
       }
       catch(StringIndexOutOfBoundsException ob)
       {
           System.out.println("Index is not found...");
       }
     }
}