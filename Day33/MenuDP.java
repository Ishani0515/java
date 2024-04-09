import java.awt.*;
class MenuDP extends Frame
{
MenuDP()
{
setSize(1200,700);
setTitle("Notepad");
MenuBar mb=new MenuBar();
Menu m1=new Menu("File");
Menu m2=new Menu("Edit");
Menu m3=new Menu("View");
Menu m4=new Menu("Format");
Menu m5=new Menu("Help");
mb.add(m1);mb.add(m2);mb.add(m3);mb.add(m4);mb.add(m5);
setMenuBar(mb);
setVisible(true);
}
public static void main(String args[])
{
MenuDP ob=new MenuDP();
}
}

