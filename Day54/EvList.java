import java.util.*;
class EvList
{
   public static void main(String args[])
    {
       ArrayList <Integer>even=new ArrayList();
        for(int i=1;i<=20;i++)
          if(i%2==0)
           even.add(i);
        System.out.println(even);
    }
}