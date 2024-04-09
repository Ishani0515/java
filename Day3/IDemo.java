class IDemo
{
    int n;
    static int num;
    public static void main(String args[])
    {
        IDemo ob1=new IDemo();
        ob1.n=5;
        ob1.num=100;
        IDemo ob2=new IDemo();
        ob2.n=50;
        ob2.num=500;
        System.out.println("n="+ob1.n+" num="+ob1.num);
        System.out.println("n="+ob2.n+" num="+ob2.num);      
    }
}

