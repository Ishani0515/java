class Marks
{
   float e1,e2;
   String name;
   public static void main(String args[])
   {
       Marks s1=new Marks();
       Marks s2=new Marks();
        s1.e1=8.0f;
        s1.e2=9.0f;
        s1.name="Aditya";
        s2.e1=8.5f;
        s2.e2=9.5f;
        s2.name="Ankit";
       System.out.println(s1.name+" Total marks="+(s1.e1+s1.e2));
       System.out.println(s2.name+" Total Marks="+(s2.e1+s2.e2));     
   }
}

