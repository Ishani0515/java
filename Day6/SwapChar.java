class SwapChar
{
public static void main(String args[])
{
char ch1='A';
char ch2='D';
char temp;
temp=ch1;
ch1=ch2;
ch2=temp;
System.out.println("ch1:="+ch1);
System.out.println("ch2:="+ch2);
System.out.println("Temp:="+temp);
}
}