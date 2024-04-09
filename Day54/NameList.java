import java.util.*;
class NameList
{
   public static void main(String args[])
   {
       ArrayList <String>n=new ArrayList();
       n.add("Ankita");
       n.add("Sai");
       n.add("Tapaswani");
       n.add("Jyoti");
       n.add("Alkananda");
       n.add("Nainali");
       n.add("Tulshi");
      for(int i=0;i<n.size();i++)
        System.out.println(n.get(i));
    }
}