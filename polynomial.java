import java.io.*; 
class polynomial 
{  
	public static void main(String args[]) throws Exception  
	{  
		int degree,i;  
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));   
		System.out.println("Enter the Degree of the Polynomial:");
		degree=Integer.parseInt(obj.readLine());   
		double a[]=new double[degree+1];
		for(i=degree;i>=0;i--)
		{ 
			System.out.println("Enter the Co-Efficient of y^"+i+":");  
			a[i]=Double.parseDouble(obj.readLine());
		} 
		solve(a,degree);
	}

    public static void solve(double a[],int deg) throws Exception  
    {
    	double x;   
    	int itr;   
    	BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the No of Iterations to be performed:"); 
    	itr=Integer.parseInt(ob.readLine());
    	System.out.println("Enter the assumed root:");  
    	x=Double.parseDouble(ob.readLine());
    	double root=find_root(a,itr,x,deg); 
    	System.out.println("The root of Polynomial Equation is:"+root);  
    }
    public static double find_root(double a[],int itr,double x,int deg)
    {
    	//double x1=0;
    	for(int i=0;i<itr;i++)
    	{
    		x=x-(f(x,a,deg)/fd(x,a,deg));
    	}
    	return x; 
    }
    public static double f(double x,double a[],int deg)
    {
    	double temp=0; 
    	for(int i=0;i<=deg;i++)
    	{
    		temp=temp+(a[i]*Math.pow(x,i));   
    	}
    	//System.out.println("Value = "+temp);
    	return temp;
    }   

    public static double fd(double x,double a[],int n)  
    { 
    	double temp=0;  
    	for(int i=1;i<=n;i++)
    	{
    		temp=temp+(a[i]*i*Math.pow(x,i-1)); 
    	}
    	//System.out.println("Value = "+temp);
    	return temp;
    }
}
