import java.util.Scanner;

public class uppercase 
{
    
   public static void main (String[] args)
    {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Number of Letter You Want : ");
	   	int n = sc.nextInt();
	   	Scanner s = new Scanner(System.in);
	   	System.out.print("Enter the String  : ");
        String str = s.nextLine();
        if(n==str.length())
        {
        	String upper_str = str.toUpperCase();
        	System.out.println("");
        	System.out.println("Original String: " + str);
        	System.out.println("String in Uppercase: " + upper_str);
        }
        else
        {
        	System.out.println("Does not match");
        }
    }
}