import java.util.*;
class SortN
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> n=new ArrayList();
       int num;
       System.out.print("Enter 5 integer value:");
       for(int i=0;i<5;i++)
       { 
         num=sc.nextInt(); 
          n.add(num);
        }
        System.out.println(n);
       Collections.sort(n);
        System.out.println(n);
    }
}