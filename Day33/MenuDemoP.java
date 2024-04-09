import java.awt.*;
class MenuDemoP extends Frame
{
MenuDemoP()
{
setSize(300,300);
setTitle("Notepad");
MenuBar mb=new MenuBar();
Menu m1=new Menu("File");
Menu m2=new Menu("Edit");
Menu m3=new Menu("Format");
MenuItem m11=new MenuItem("New");
MenuItem m12=new MenuItem("Open");
MenuItem m21=new MenuItem("Undo Ctrl+z");
MenuItem m22=new MenuItem("Cut Ctrl+x");
MenuItem m31=new MenuItem("Word Wrap");
MenuItem m32=new MenuItem("Font...");
m1.add(m11);
m1.add(m12);
m1.add(m21);
m1.add(m22);
m1.add(m31);
m1.add(m32);
mb.add(m1);
mb.add(m2);
mb.add(m3);
setMenuBar(mb);
setVisible(true);
}
public static void main(String args[])
{
MenuDemo ob=new MenuDemo();
}
}




