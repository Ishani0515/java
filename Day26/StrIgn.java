class StrIgn
{
    public static void main(String args[])
    {
       String pass="abcd";
       String s="ABCD";
        if(s.equalsIgnoreCase(pass)) 
         System.out.println("Equal");
        else
         System.out.println("Not Equal");
     }
}