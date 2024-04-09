class Student
{
    String name;
    static String college;
    Student()
    {System.out.println("Object created");}
    public static void main(String args[])
    {
         Student s1=new Student();
         s1.name="Aditya";
         s1.college="Trident";
         Student s2=new Student();
         s2.name="Ganesh";
         Student s3=new Student();
         s3.name="Nichay";
         Student s4=new Student();
         s4.name="Ankit";
         Student s5=new Student();
s5.name="Soumya";
         System.out.println(s5.name+" "+s5.college);
         System.out.println(s1.name+" "+s1.college);
         System.out.println(s2.name+" "+s2.college);
         System.out.println(s3.name+" "+s3.college);
         System.out.println(s4.name+" "+s4.college); 
    }
}