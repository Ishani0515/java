class MyHand
{
   public static void main(String args[])
    {
        try
         {
             int num[]={10,2,0};
              System.out.println(num[0]/num[1]);
             // System.out.println(num[0]/num[2]); //Exception thrown
              System.out.println(num[0]/num[4]);  //Exception thrown
         }
         catch(Exception ob)
         {
            System.out.println("Wrong Declaration "+ob);
         }
    }
}