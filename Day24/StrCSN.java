import java.util.Scanner;
class StrCSN
{
   public static void main(String args[])
   {
      String sm="",cp="",num="",sym="",sp="";
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter string in mixed case:");       
      String name=sc.nextLine();                            //a23BC#4tDr7&       
      for(int i=0;i<name.length();i++)
        if(name.charAt(i)>='A'&&name.charAt(i)<='Z')
           cp=cp+name.charAt(i);
else if(name.charAt(i)>='a'&&name.charAt(i)<='z')
           sm=sm+name.charAt(i);   
          else if(name.charAt(i)>='0'&&name.charAt(i)<='9')
            num=num+name.charAt(i);
          else if(name.charAt(i)==' ')
              sp=sp+name.charAt(i);
          else
            sym=sym+name.charAt(i);
        System.out.println(sm);
        System.out.println(cp);
        System.out.println(num);
        System.out.println(sym);
    }
}