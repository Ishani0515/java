class StudMarks
{
    float m1,m2;
    StudMarks()
    {
          System.out.println("Constructor is executed.. ");
    }
   public static void main(String args[])
    {
       StudMarks s1=new StudMarks();  //call the constructor
       s1.m1=8.5f;
       s1.m2=8.0f;
       StudMarks s2=new StudMarks();
       s2.m1=9.0f;
       s2.m2=7.0f;
       System.out.println(s1.m1+"    "+s1.m2);
       System.out.println(s2.m1+"    "+s2.m2);
    }
}