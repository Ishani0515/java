import java.util.Scanner;
class PrintP
{
public static void main(String args[])
{
int f=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter sentence:");
String s=sc.nextLine();
String rev[]=s.split(" ");
for(int j=0;i<rev.length;j++)
{
String rstr="";
for(int i=rev[j].length()-1;i>=0;i--)
rstr+=rev[j].charAt(i);
System.out.println((rstr.equals(rev[j]))?rev[j]:"");
}
}
}