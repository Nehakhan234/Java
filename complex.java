import java.io.*; 
class complex 
{  
	double real,img,sum;    
	void add(complex c1,complex c2)  
	{   
		System.out.println("Addition of two Complex No:"+(c1.real+c2.real)+" "+(c1.img+c2.img)+"i");  
	}  
	void sub(complex c1,complex c2)  
	{   
		System.out.println("Subtraction of two Complex No:"+(c1.real-c2.real)+" "+(c1.img-c2.img)+"i");  
	}  
	void mul(complex c1,complex c2)  
	{ 
		System.out.println("Multiplication of two Complex No:"+((c1.real*c2.real)-(c1.img*c2.img))+" "+((c1.img*c2.real)+(c1.real*c2.img))+"i");  
	}  
	void divide(complex c1,complex c2)  
	{  
		complex c3 = new complex();
		c3.real = c2.real;
		c3.img = -c2.img;
		complex c4 = new complex();
		c4.real = ((c1.real*c3.real)-(c1.img*c3.img));
		c4.img = ((c1.img*c3.real)+(c1.real*c3.img));
		complex c5 = new complex();
		c5.real = c2.real*c3.real;
		c5.img = c2.img*c3.img;
		c5.sum = c5.real+c5.img;
		complex c6 = new complex();
		c6.real = c4.real/c5.sum;
		c6.img = c4.img/c5.sum;
		System.out.println("Division of two complex numbers is: "+c6.real+" "+c6.img+"i");
    }  
} 
class complex_demo 
{  
	public static void main(String args[]) throws Exception  
	{   
		complex com1=new complex();  
		complex com2=new complex();  
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));   
		System.out.println("Enter the Complex Number 1:");  
		com1.real=Double.parseDouble(obj.readLine());  
		com1.img=Double.parseDouble(obj.readLine());   
		System.out.println("Enter the Complex Number 2:");  
		com2.real=Double.parseDouble(obj.readLine()); 
		com2.img=Double.parseDouble(obj.readLine());     
		com1.add(com1,com2);   
		com1.sub(com1,com2);  
		com1.mul(com1,com2); 
		com1.divide(com1,com2);  
	}
}
