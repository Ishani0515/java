import java.util.*;
class NumList
{
   public static void main(String args[])
   {
       ArrayList <Integer>n=new ArrayList();
       n.add(1);
       n.add(2);
       n.add(3);
       n.add(4);
       n.add(5);
        System.out.println(n);  //[1,2,3,4,5]
       n.remove(2);  //remove value 2nd index
        System.out.println(n);  //[1,2,4,5]
    }
}