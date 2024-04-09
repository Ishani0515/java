class Method
{
     void show()
     {
          System.out.println("I am show method~Instance");
     }
     static void disp()
     {
          System.out.println("I am disp method~static");
     }
     public static void main(String args[])
     {
          Method.disp();     //calling of static method
          Method ob=new Method(); 
          ob.show();         //calling of instance method
     }
}