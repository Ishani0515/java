import java.util.*;
class SortAlpha
{
    public static void main(String args[])
    {
       ArrayList<String> n=new ArrayList();
       n.add("C");
       n.add("V");
       n.add("K");
       n.add("A");
       n.add("B");
        System.out.println(n);
       Collections.sort(n);
        System.out.println(n);
    }
}