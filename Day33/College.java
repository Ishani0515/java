import java.awt.*;
class College extends Frame
{
    College()
    {
        setSize(300,200);
        Label l=new Label("Choose College");
        List ls=new List();
         ls.add("Trident");
          ls.add("Silicon");
         ls.add("C V Raman");
         ls.add("KIIT");
         ls.add("CEB");
        setLayout(null);
        l.setBounds(50,50,150,20);
        ls.setBounds(50,80,150,80);
        add(l); add(ls);
        setVisible(true);
    }
    public static void main(String args[])
{
       College ob=  new College();
    }
}