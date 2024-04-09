import java.util.*;
class GenPass
{
   public static void main(String args[])
   {
      ArrayList <String>num=new ArrayList();
      Collections.addAll(num, "a","b","c","d","e","f","1","2","3","4","5");
      Collections.shuffle(num);
     System.out.print("Generated Password:"+num.get(0)+num.get(1)+num.get(2)+num.get(3)+num.get(4)+num.get(5)+num.get(6)+num.get(7));
   }
}