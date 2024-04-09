import java.awt.*;
class Output extends Frame
{
    Label l;
    Output(String res)
    {
       setSize(200,200);
       setTitle(res);
      l=new Label(res);
      add(l);
      setVisible(true);
    }
}