class MyPersonal
  {
     int roll=10;        //instance variable
     String name="Amit";
     public static void main(String args[])
      {
           MyPersonal ob=new MyPersonal();     //object creation
          System.out.println("Roll="+ob.roll);   //access instance variable
          System.out.println("Name="+ob.name);
      }
  }