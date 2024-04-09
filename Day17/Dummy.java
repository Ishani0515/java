class Dummy
{
    Dummy(int n)
    {
       this('a');
        System.out.println(1);

    }
    Dummy(float n)
    {

      System.out.println(2);
    }
    Dummy(char ch)
    {
        this(2.5f);
       System.out.println(3);
    }
    public static void main(String args[])
    {
       Dummy ob=new Dummy(10);
    }
}