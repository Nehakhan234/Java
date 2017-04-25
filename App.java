
/*<html>
<body>
<applet code="App.class" width="2000" height="1000">
<param name="sname" value="Monotype Corsiva">
<param name="fsize" value="38">
</applet>
</body>
</html>*/

//App.java

import java.io.*;
import java.awt.*;
import java.lang.*;
import java.applet.*;

public class App extends java.applet.Applet
{
	String name,fsize,f_style;
	int n;
	String code,document;
	
	public void init()
	{
		name=getParameter("sname");
		fsize=getParameter("fsize");
		n=Integer.parseInt(fsize);
		code=getCodeBase().toString();
		document=getDocumentBase().toString();
		
	}
	
	public void paint(Graphics g)
	{
		Font f=new Font(name,Font.BOLD,n);
		
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("Princess Neha Khan", 10,100);
		
		g.setColor(Color.black);
		g.drawString("The code Base="+code,10,150);
		g.drawString("The Document Base="+document,10,200);
	}
}

