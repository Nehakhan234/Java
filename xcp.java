package x4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class xcp 
{
  public static void main(String args[])
  {
	  int a,b;
	  
	  try
	  {    System.out.println("enter values of a and b:");
		  BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		  a=Integer.parseInt(ob.readLine());
		  b=Integer.parseInt(ob.readLine());
		  int res=a/b;
		  System.out.println("result:"+res);
	  }
	  
	  catch(IOException e)
	  {
		  System.out.println("error in reading");
	  }
	  
	  catch(ArithmeticException e)
	  {
		  System.out.println("error cannot be divided by zero:");
	  }
	  
	  catch(NumberFormatException e)
	  {
		  System.out.println("error invalid integer!");
	  }
  }
  
  
  
}
