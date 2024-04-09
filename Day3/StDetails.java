class StDetails
{
    String name;
    int roll;
    float marks;
    public static void main(String args[])
    {
         StDetails ob1=new StDetails();
         StDetails ob2=new StDetails();
         ob1.name="Sudhir";
         ob1.roll=42;
         ob1.marks=9.0f;
         ob2.name="Satyam";
         ob2.roll=36;
         ob2.marks=9.5f;

         System.out.println("Name="+ob1.name);
         System.out.println("Roll="+ob1.roll);
         System.out.println("Marks="+ob1.marks);
 
         System.out.println("Name="+ob2.name);
         System.out.println("Roll="+ob2.roll);
         System.out.println("Marks="+ob2.marks);   
    }
}
