import java.io.*;
public class binary
{
	static int pos;
	static double pos1;
	static int found=0;
	static void search(int a[],int n,int low,int high,int key)
	{
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
		    if(key==a[mid])
		    {
		    	found=1;
		    	pos=mid+1;
		    	break;
		    }
		    else if(key<a[mid])
		    	high=mid-1;
		    else
		    	low=mid+1;
		}
	}
	static void search(double a[],int n,int low,int high,double key)
	{
		int mid1;
	    found=0;
	    while(low<=high)
	    {
	    	mid1=(low+high)/2;
	    	if(key==a[mid1])
		    {
		    	found=1;
		    	pos1=mid1+1;
		    	break;
		    }
		    else if(key<a[mid1])
		    	high=mid1-1;
		    else
		    	low=mid1+1;
	    	
	    }
	}
}
class binary_search extends binary
{
	public static void main(String args[])throws IOException
	{
		//binary ob=new binary();
		int i;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements");
		int n=Integer.parseInt(obj.readLine());
		int a[] = new int[n];
		
		System.out.println("Enter the integer elements in sorted order");
	    for(i=0;i<n;i++)
	    	a[i] = Integer.parseInt(obj.readLine());
	    
	    System.out.println("Enter key");
	    int key=Integer.parseInt(obj.readLine());
	    
	    search(a,n,0,n-1,key);
	    
	    if(found==0)
	    {
	       System.out.println("Element not found");
	    }
	    else
	    	System.out.println("Element found at position "+pos);
	    
	    
	    double b[] = new double[n];
	    System.out.println("Enter the floating elements in sorted order");
	    for(i=0;i<n;i++)
	    	b[i] = Double.parseDouble(obj.readLine());
	    
	    System.out.println("Enter key");
	    double key1=Double.parseDouble(obj.readLine());
        
	    search(b,n,0,n-1,key1);
	    
	    if (found==0)
	    {
	    	System.out.println("Element not found");
	    }
	    else
	    	System.out.println("Element found at position "+(int)pos1);
	}
}

