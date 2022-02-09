import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest {

	public static void main(String[] args) {
		
		 MyFrame myFrame1 = new MyFrame(300,200,50,50,"Bike"); //II.c
		 MyFrame myFrame2 = new MyFrame(300,200,350,50,"Car"); //II.c
         MyFrame myFrame3 = new MyFrame(300,200,650,50,"Bus"); //II.c 
         myFrame1.setVisible(true);
         myFrame2.setVisible(true);
         myFrame3.setVisible(true);
         
         Thread t1 = new Thread(myFrame1); //II.d
         Thread t2 = new Thread(myFrame2); //II.d
         Thread t3 = new Thread(myFrame3); //II.d
         
         t1.start(); //II.e
         t2.start(); //II.e
         t3.start(); //II.e
         
		
	}

}
class MyFrame extends JFrame implements Runnable //II.a
{
        JTextField tf =new JTextField(20);

        String theTitle;
        
        MyFrame(int w, int h,  int x, int y, String title) {
                setSize(w,h);
                setLocation(x,y);
                theTitle = title; //set the global theTitle
                setTitle(title);
                FlowLayout fl = new FlowLayout();
                setLayout(fl);
                add(tf);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        }
        public void run() { //II.b
        	for(int i=1;i<=1000000;i++) {
        		tf.setText(theTitle+" is running "+i);
        	}
        }
}

/*



JFrame myFrame = new JFrame("Bike");  //ctrl + shift + M for autoimport
JTextField tf1 =new JTextField(20);
JTextField tf2 =new JTextField(20);
JTextField tf3 =new JTextField(20);

FlowLayout fl = new FlowLayout();

myFrame.setSize(300,200);
myFrame.setLocation(100,50);

myFrame.setLayout(fl);
myFrame.add(tf1);
myFrame.setVisible(true);



JFrame myFrame1 = new JFrame("Car");  //ctrl + shift + M for autoimport

myFrame1.setSize(300,200);
myFrame1.setLocation(400,50);
myFrame1.setLayout(fl);
myFrame1.add(tf2);
myFrame1.setVisible(true);

JFrame myFrame2 = new JFrame("Bus");  //ctrl + shift + M for autoimport

myFrame2.setSize(250,200);
myFrame2.setLocation(700,50);
myFrame2.setLayout(fl);
myFrame2.add(tf3);
myFrame2.setVisible(true);


*/
