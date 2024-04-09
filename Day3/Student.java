class Student
  {
     int roll;
     String name;
      public static void main(String args[])
      {
           Student s1=new Student();
           s1.roll=10;
           s1.name="Sagar";
           Student s2=new Student();
           s2.roll=11;
           s2.name="Dev";
          System.out.println("Roll="+s1.roll);
          System.out.printf("Name=%s",s1.name);
          System.out.println("Roll="+s2.roll);
          System.out.printf("Name=%s",s2.name);

      }
  }
