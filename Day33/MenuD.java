import java.awt.*;
class MenuD extends Frame
{
    MenuD()
    {
       setSize(1200,700);
       setTitle("Notepad");
        MenuBar mb=new MenuBar();
        Menu m1=new Menu("File");
        Menu m2=new Menu("Edit");
        Menu m3=new Menu("Format");
        Menu m4=new Menu("View");
        Menu m5=new Menu("Help");
        mb.add(m1);mb.add(m2);mb.add(m3);mb.add(m4);mb.add(m5);
        setMenuBar(mb);
        setVisible(true);
    }
    public static void main(String args[])
    {
MenuD ob=new MenuD();
    }
}