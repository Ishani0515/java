import java.util.Date;
class DispDate
{
  public static void main(String args[])
   {
     Date d=new Date();
     System.out.print(d.getDate()+"-"+(d.getMonth()+1)+"-"+(d.getYear()+1900));
   } 
}