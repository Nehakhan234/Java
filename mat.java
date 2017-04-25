package ex6;

import java.io.*;

public class mat 
{
public static void main(String args[]) throws Exception
{
	BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
	
	int m,n,p,q,i,j,k;
	
	System.out.println("enter size of A");
	m=Integer.parseInt(ob.readLine());
	n=Integer.parseInt(ob.readLine());
	int a[][]=new int[m][n];
	
	System.out.println("enter size of B");
	p=Integer.parseInt(ob.readLine());
	q=Integer.parseInt(ob.readLine());
	int b[][]=new int[p][q];
	
	if(n!=p)
	{
		System.out.println("mm not possible");
	}
	
	else
		
	{	System.out.println("enter elements of A");
	    for(i=0;i<m;i++)
		    for(j=0;j<n;j++)
		    a[i][j]=Integer.parseInt(ob.readLine());
	    
	    System.out.println("enter elements of B");
	    for(i=0;i<p;i++)
		    for(j=0;j<q;j++)
		    b[i][j]=Integer.parseInt(ob.readLine());
	    
		    int c[][]=new int[m][q];
		    
		    for(i=0;i<m;i++)
		    {
		    	for(j=0;j<q;j++)
		    	{
		    		c[i][j]=0;
		    		
		    		for(k=0;k<n;k++)
		                     
		    			c[i][j]=c[i][j]+a[i][k]*b[k][j];
		    		
		    			
		    			
		    }
		    	}
		    
		    
		    System.out.println("product matrix is");
		    for(i=0;i<m;i++)
		    {
		    	for(j=0;j<q;j++)
		    	{
		    		System.out.println(c[i][j]+"\t");
		    	}
		    	  System.out.println("\n");
		    	
		    }
	}	    
		    		
	
}
}
