import java.util.*;
class FruitSort
{
   public static void main(String args[])
   {
       ArrayList <String>fruit=new ArrayList();
       Collections.addAll(fruit,"Papaya","Banana","Pineapple","Gauva","Apple","Orange","Grapes","Mango","Pomgranate");
        System.out.println(fruit);
        Collections.sort(fruit);
         System.out.println(fruit);
       
    }
}