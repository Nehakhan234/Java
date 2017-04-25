
import java.io.*;
//import java.String.*;
class str
{
String s1,s2;
int strig(String s1)
{
return(s1.length());
}
void strig(String s1,int a)
{
System.out.println("charcter at "+a+" is "+s1.charAt(a));
}
boolean strig()
{
return(s1.equals(s2));
}
void strig(String s1,String s2,String s3)
{
s2=s2.concat(s3);
System.out.println("Concatenated string is " +s1.concat(s2));
}
void strig(String s1,String s2)
{
System.out.println("Before copy str1= "+s1+" str2="+s2);
s2=s1;
System.out.println("After copy str1= "+s1+",str2="+s2);
}
}
class smstr
{
public static void main(String arg[])
{
str s=new str();
String s1=new String();
String s2=new String();
String s3=new String();
int a,ch=1;
while(ch==1)
{
try{
System.out.println("String operation");
System.out.println("1.String length,2.String compare,3.String characterat,4.String concatenation,5.String copy,6.Exit");
System.out.println("Enter your choice");
int choice;
BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));
choice=Integer.parseInt(br.readLine());
switch(choice)
{
case 1: System.out.println("Enter the string to find length");
s1=br.readLine();
System.out.println("length of the string is " +s.strig(s1));
break;
case 2: System.out.println("Enter two strings to compare");
s.s1=br.readLine();
s.s2=br.readLine();
System.out.println(s.s1+" equals "+s.s2+" : "+s.strig());
break;
case 3: System.out.println("Enter the string and position to find character");
s1=br.readLine();
a=Integer.parseInt(br.readLine());
s.strig(s1,a);
break;
case 4: System.out.println("Enter three strings to concate");
s1=br.readLine();
s2=br.readLine();
s3=br.readLine();
s.strig(s1,s2,s3);
break;
case 5: System.out.println("Enter one str to copy");
s1=br.readLine();
s2="java";
s.strig(s1,s2);
break;
case 6: ch=2;
break;
default : ch=2;
}
}
catch(IOException e)
{
System.out.println();
}
}
}
}