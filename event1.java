import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class event1 extends Applet implements ActionListener
{
			Button b; TextField tf;

			public void init()
			{

				b=new Button("CLICK HERE");
				tf=new TextField("CHANGE IN HERE");

				add(b);
				add(tf);
				b.addActionListener(this);


			}

			public void actionPerformed(ActionEvent ae)
			{

				tf.setText("blue");
				

			}



}
/*
<applet code="event1.class"  width="1300" height="768">
</applet>
*/