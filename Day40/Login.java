import java.awt.*;
import java.awt.event.*;
class Login extends Frame implements ActionListener
{
    Label l1,l2,r;
    Button b;
    TextField t1,t2;
    String uname="user",pass="123";
    Login()
    {
        setSize(400,300);
        l1=new Label("Enter Username");
        t1=new TextField();
        l2=new Label("Enter Password");
        r=new Label();
        t2=new TextField(); t2.setEchoChar('*');
        b=new Button("SignIn");
        setLayout(null);
l1.setBounds(50,80,150,20);
        t1.setBounds(210,80,150,20);     
        l2.setBounds(50,110,150,20);
        t2.setBounds(210,110,150,20);
        b.setBounds(230,150,80,20);
        r.setBounds(100,190,200,20);     
        add(l1);add(t1);add(l2);add(t2);add(r);add(b);
        b.addActionListener(this);
       setVisible(true);           
    }
public void actionPerformed(ActionEvent e)
    {
        if(t1.getText()equals(uname)&& t2.getText()equals(pass))
               //r.setText("Valid User");
               new Output("Valid User");
             else
              new Output("Not Valid User");
     //         r.setText("Not valid user");
        }
    }
    public static void main(String args[])
    {
        Login ob=new Login();
    }
     
}