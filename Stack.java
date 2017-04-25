import java.io.*;
class stack
{
public static void main(String args[]) throws IOException
{
int top=-1,ch,n;
System.out.println("Enter the size of the stack:");
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(obj.readLine());
int array[]=new int[n];
do
{
System.out.println("Stack Operation\n1.push\n2.pop\n3.display\n4.exit");
System.out.println("Enter your Choice:");
ch=Integer.parseInt(obj.readLine());
switch (ch)
{
case 1: int element;
if (top==n-1)
System.out.println("Stack Overflow");
else
System.out.println("Enter the Element to be Pushed:");
element=Integer.parseInt(obj.readLine());
array[++top]=element;
break;
case 2: if(top == -1)
System.out.println("Stack Underflow");
else
System.out.println("Poped Element:"+array[top--]);
break;
case 3: System.out.println("Stack Elements are:");
for(int i=0;i<=top;i++)
System.out.println(array[i]);
break;
default:System.out.println("Wrong Choice");
}
} while(ch!=4);
}
}
