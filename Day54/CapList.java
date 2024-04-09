import java.util.*;
class CapList
{
   public static void main(String args[])
   {
       ArrayList <String>n=new ArrayList();
        n.add("Satyam");
       n.add("Sudhir");
       n.add("Sonali");
       n.add("Ankita");
       n.add("Chinmay");
       n.add("Baishakhi");
      for(int i=0;i<n.size();i++)
        System.out.println(n.get(i).toUpperCase());
    }
}