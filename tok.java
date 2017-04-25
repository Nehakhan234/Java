package ex7a;
import java.io.*;
import java.util.*;

public class tok 
{
    public static void main(String args[]) throws Exception
    {
      BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("enter the text");
      String text=ob.readLine();    
      
      System.out.println("enter the word whose freq u wanna find");
      String word=ob.readLine();   
      int count=0;
      
      StringTokenizer st= new StringTokenizer(text);
      
      while(st.hasMoreTokens())
      {
    	  if(st.nextToken().equals(word))
    		  count++;
    	  
      }
      
      
      System.out.println("count="+count);
    
    }
    }
