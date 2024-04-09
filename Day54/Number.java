import java.util.*;
class Number
{
   public static void main(String args[])
    {
       ArrayList <Integer>num=new ArrayList();
       num.add(10);
       num.add(5);
       num.add(12);
       num.add(15);
       for(int i=0;i<num.size();i++)
        System.out.println(num.get(i));
    }
}