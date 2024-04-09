class First
{  int n1;
    First()
    {
        System.out.println("First constructor");
    }
}
class Second extends First
{  int n2;
    Second()
    {
        System.out.println("Second constructor");
    }
}
class Third extends Second
{  int n3;
    Third()
    {
        System.out.println("Third constructor");
    }
   public static void main(String args[])
    {
       Third ob=new Third();
    }
}