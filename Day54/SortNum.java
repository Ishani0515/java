import java.util.*;
class SortNum
{
    public static void main(String args[])
    {
       ArrayList<Integer> n=new ArrayList();
       n.add(10);
       n.add(12);
       n.add(6);
       n.add(2);
       n.add(5);
        System.out.println(n); //[10,12,6,2,5]
       Collections.sort(n);
        System.out.println(n);  //[2,5,6,10,12]
    }
}