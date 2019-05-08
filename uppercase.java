import java.util.*;
class uppercase
{
 public static void main(String args[])
  {
    char ch;
    int n;
 	Scanner sc=new Scanner(System.in);     
	System.out.println("Enter any lower charcter");
         ch=sc.next().charAt(0);
      
          n = (int)ch;
       	  n = n-32;
       	  ch = (char)n;
       	  System.out.println(ch);
	
	}
    }	
 


    
        
    