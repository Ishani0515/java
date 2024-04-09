class RemoveSP
{
   public static void main(String args[])
   {               
      String name="Hello Student, I am Rahul";
      for(int i=0;i<name.length();i++)
       System.out.print(name.charAt(i)==' '?"":name.charAt(i));
     }
}