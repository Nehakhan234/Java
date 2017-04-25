import java.io.*;
class queue
{
public static void main(String args[]) throws IOException
{
int front,rear,ch,n;
front=rear=-1;
System.out.println("Enter the size of the queue:");
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(obj.readLine());
int queue[]=new int[n];
do
{
System.out.println("Queue Operation\n1.Insert\n2.Delete\n3.Display\n4.Exit");
System.out.println("Enter your Choice:");
ch=Integer.parseInt(obj.readLine());
switch (ch)
{
case 1: int element;
if (rear==n-1)
System.out.println("Queue Overflow");
else
{
System.out.println("Enter the Element to be Inserted:");
element=Integer.parseInt(obj.readLine());
queue[++rear]=element;
if(front==-1)front++;
}break;
case 2: if(front == -1)
System.out.println("Queue Underflow");
else
if(front==rear)
front=rear=-1;
System.out.println("Deleted Element:"+queue[front]);front++;
break;
case 3: System.out.println("Queue Elements are:");
for(int i=front;i<=rear;i++)
System.out.println(queue[i]);
break;
default:System.out.println("Wrong Choice");
}
} while(ch!=4);
}
}
