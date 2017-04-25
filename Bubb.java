package bub;
import java.io.*;

class Bubb {
	public static void main(String args[]) throws Exception
	{
		int n,temp,i,j;
		
		System.out.println("enter the no. elements");
		BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(obj.readLine());
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(i=0;i<n;i++)
			a[i]=Integer.parseInt(obj.readLine());
		
		
		
		for(i=0;i<n;i++)
			{
			for(j=0;j<n-1;j++)
			
				
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
	}
		System.out.println("sorted array is");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
	

}
