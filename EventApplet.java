import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;  
public class EventApplet extends Applet implements ActionListener{  
Button b;  
TextField tf1,tf2,tf3; 
int a,b1,c;
String a1,b2; 
  
public void init(){  
tf1=new TextField(/*"Enter number here"*/);  
tf1.setBounds(30,40,150,20);
a1=tf1.getText();  
a=Integer.parseInt(a1);

tf2=new TextField(/*"Enter 2nd number here"*/);
tf2.setBounds(100,50,150,20);
b2=tf1.getText();
b1=Integer.parseInt(b2);
  
tf3=new TextField();
tf3.setBounds(50,80,150,20);
c=a+b1;  
  
b=new Button("ADD");  
b.setBounds(80,150,60,50);  
  
add(b);add(tf1);add(tf2);add(tf3);  
b.addActionListener(this);  
  
setLayout(null);  
}  
  
 public void actionPerformed(ActionEvent e){  
  tf3.setText(String.valueOf(c));  
 }   
} /*
<applet code="EventApplet.class" width="1300" height="768"> 
</applet> 
*/ 