//import java.io.*; 
//import java.lang.*; 
class A extends Thread 
{
	public void run()
	{ 
		System.out.println("Thread A Started"); 
		for(int i=0;i<5;i++)
			System.out.println("Thread A: The value of i="+i);
		System.out.println("Thread A Terminated");  
	}
}
class B extends Thread 
{
	public void run()  
	{
		System.out.println("Thread B Started"); 
		for(int j=0;j<5;j++)    
			System.out.println("Thread B: The value of j="+j);
		System.out.println("Thread B Terminated");  
	}
} 
class C extends Thread 
{
	public void run() 
    { 
		System.out.println("Thread C Started");
		for(int k=0;k<5;k++)   
			System.out.println("Thread C: The value of k="+k); 
		System.out.println("Thread C Terminated");  
	}
} 
class thread_demo 
{
	public static void main(String args[])  
	{
		A a=new A(); 
		B b=new B();
		C c=new C();   
		a.start(); 
		b.start();
		c.start();
	}
}
