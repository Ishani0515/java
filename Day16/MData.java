class MData
{
   float marks;
   char grade;
   MData(float m,char g)
   {
       marks=m;
       grade=g;
   }
   public static void main(String args[])
   {
      MData s1=new MData(92.0f,'O');
      MData s2=new MData(85.0f,'E');
      MData s3=new MData(78.0f,'A');
      System.out.println("Marks & grade of s1="+s1.marks+" "+s1.grade);
      System.out.println("Marks & grade of s2="+s2.marks+" "+s2.grade);
      System.out.println("Marks & grade of s3="+s3.marks+" "+s3.grade);
   }
}