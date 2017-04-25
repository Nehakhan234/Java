import java.io.*;
import java.lang.*;
import java.util.*;


interface person
 {
    void set_data(String name,int age);
 }


 class student implements person
   {
       private String name;
       private int age;
       public void set_data(String name,int age)
       {
    	   this .name=name;
    	   this .age=age;
    	   System.out.println("Students Details:\nStudent Name="+name+"\nAge="+age);

       }
  }
 
 
 class teacher implements person
 {
       private String name;
       private int age;
       public void set_data(String name,int age)
       {
    	   this .name=name;
    	   this .age=age;
    	   System.out.println("Teacher Details:\nTeacher Name="+name+"\nAge="+age);
       }
 }
 
 
  class interface_demo
  {
	  public static void main(String args[]) throws Exception
  {
      String name;
      int age;
      person p;
      
      teacher t=new teacher();
      student s=new student();
      
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      p=t;
      System.out.println("Enter the name of the Teacher:");
      name=obj.readLine();
      
      System.out.println("Enter the Age of the Teacher:");
      age=Integer.parseInt(obj.readLine());
      p.set_data(name,age);
      p=s;
      
      System.out.println("Enter the name of the Student:");
      name=obj.readLine();
      
      System.out.println("Enter the Age of the Student:");
      age=Integer.parseInt(obj.readLine());
      p.set_data(name,age);
  	}
  }
