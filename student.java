package inheritance;

import java.util.Scanner;
class student {

	
	Scanner in =new Scanner(System.in);
	//	in = new Scanner(System.in);
	String name,no;
	int m1,m2,m3,m4;
	void get_data()
	{
		
		
			System.out.println("Enter the name");
			name = in.next();
			System.out.println("Enter the reg no");
			no = in.next();
			System.out.println("Enter marks 1");
			m1 = in.nextInt();
			System.out.println("Enter marks 2");
			m2 = in.nextInt();
			System.out.println("Enter marks 3");
			m3 = in.nextInt();
			System.out.println("Enter marks 4");
			m4 = in.nextInt();
		
		//catch(Exception e)
		{
			//System.out.println("Error");
		}
	}
	void put_data()
	{
		 System.out.println("Student details are: ");
		 System.out.println("Name = "+name);
		 System.out.println("Reg no = "+no);
		 System.out.println("Marks 1 = "+m1);
		 System.out.println("Marks 2 = "+m2);
		 System.out.println("Marks 3 = "+m3);
		 System.out.println("Marks 4 = "+m4);
	}

}

class inherit extends student
{
	float total;
	void tot_marks()
	{
		
		total=m1+m2+m3+m4;
		System.out.println("Total marks = "+total);
	}
}
class multi extends inherit
{
	
	float avg;
	void average()
	{
		System.out.println("Grade = "+total/10.0);
		avg = total/4;
       System.out.println("Average is "+avg);
    }
}
class stud
{
	public static void main(String args[])
	{
		//inherit obj = new inherit();
		multi a = new multi();
		a.get_data();
		a.put_data();
		a.tot_marks();
		a.average();
	}
}

