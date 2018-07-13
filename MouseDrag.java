import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class MouseDrag extends Applet implements MouseMotionListener,ActionListener{  

String str;
  
public void init(){  
Button b=new Button("RED");
Button b1,b2,b3;
b1=new Button("GREEN");
b2=new Button("magenta");
b3=new Button("Eraser");
/*b.setBounds(30,100,80,30);
b1.setBounds(30,100,80,30);
b2.setBounds(30,100,80,30);
b3.setBounds(30,100,80,30);*/
add(b);
add(b1);
add(b2);
add(b3);

b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
addMouseMotionListener(this);  
setBackground(Color.white);  
}
  


public void actionPerformed(ActionEvent ae)
{
str=ae.getActionCommand();

}  
public void mouseDragged(MouseEvent me){  

Graphics g=getGraphics();
 g.setColor(Color.black);  
g.fillOval(me.getX(),me.getY(),20,20);  

if(str.equalsIgnoreCase("Red"))
{
 g.setColor(Color.red);  
g.fillOval(me.getX(),me.getY(),20,20);  
}
else if(str.equalsIgnoreCase("Green"))
{
g.setColor(Color.green);  
g.fillOval(me.getX(),me.getY(),20,20);  
}
else if(str.equalsIgnoreCase("magenta"))
{
g.setColor(Color.magenta);  
g.fillOval(me.getX(),me.getY(),20,20);  
}

else if(str.equalsIgnoreCase("eraser"))
{
g.setColor(Color.white);  
g.fillRect(me.getX(),me.getY(),50,50);  
}


}  
public void mouseMoved(MouseEvent me){}  
  
}  

/*
<applet code=MouseDrag.class width="1300" height="768">
</applet>
*/