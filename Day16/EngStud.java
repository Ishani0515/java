class EngStud
{
    int roll;
    String name;
    EngStud(int r,String n)
    {
        roll=r;
        name=n;
    }
   public static void main(String args[])
   {
     EngStud s1=new EngStud(1,"Ishani");
     EngStud s2=new EngStud(2,"Amita");
     System.out.println(s1.roll+"  "+s1.name);
     System.out.println(s2.roll+"  "+s2.name); 
   }
}