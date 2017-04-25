import java.io.*;
class quadratic
{
public static void main(String args[]) throws Exception
{
int a,b,c;
double x,y;
System.out.println("Enter the values of a,b,c:");
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
a=Integer.parseInt(obj.readLine());
b=Integer.parseInt(obj.readLine());
c=Integer.parseInt(obj.readLine());
double k=(b*b)-(4*a*c);
double l=Math.sqrt(k);
if (k==0)
{ System.out.println("Roots are Real and Equal");
x=y=-b/(2*a);
System.out.println("Roots are "+x+" and "+y);
}
else
{ if (k<0)
{ System.out.println("Imaginary Roots");
x=-b/(2.0*a);
y=((Math.sqrt(Math.abs(k))))/(2*a);
System.out.println("Roots are "+x+" and i"+y);
}
else
{ System.out.println("Roots are Real and Distinct");
x=((-b)+l)/(2*a);
y=((-b)-l)/(2*a);
System.out.println("Roots are "+x+" and "+y);
}
}
}
}
