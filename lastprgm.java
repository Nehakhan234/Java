import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class lastprgm extends JApplet implements ActionListener
{
	JPanel p1,p2,p3;
	JLabel l1,l2,l3;
	JTextField input,result;
	JButton compute;
	
	public void init()
	{
		Container con=getContentPane();
		con.setLayout(new BorderLayout());
		l1=new JLabel("enter the num:");
		l2=new JLabel("factorial is:");
		l3=new JLabel("Applet prog to find factorial of a num:");
		
		input=new JTextField(5);
		result=new JTextField(5);
		
		compute=new JButton("Compute");
		compute.addActionListener(this);
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		
		p3.setBackground(Color.red);
		p1.setBackground(Color.pink);
		p2.setBackground(Color.green);
		
		p3.add(l3);
		p1.add(l1);
		p1.add(input);
		p1.add(l2);
		
		p1.add(result);
		p2.add(compute);
		
		con.add(p3, BorderLayout.NORTH);
		con.add(p1, BorderLayout.CENTER);
		con.add(p2, BorderLayout.SOUTH);
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int fact=1;
		int num=Integer.parseInt(input.getText());
		if(ae.getSource()==compute)
		{
			for(int i=1;i<=num;i++)
				fact=fact*i;
			result.setText(""+fact);
		}
	}
	
	

}
