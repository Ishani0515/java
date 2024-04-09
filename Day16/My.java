class My
{
    My()
    {
        System.out.println("Default constructor");
    }
    My(int n)
    {
       System.out.println("Parameter Constructor");
    }
    public static void main(String args[])
    {
       My ob1=new My(10);
       My ob2=new My();
       My ob3;  //doesnot call any constructor
    }
}