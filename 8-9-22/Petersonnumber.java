import java.util.Scanner;

public class Petersonnumber {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many input to give:");
		int y=sc.nextInt();
		for(int z=0;z<y;z++)
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n =s.nextInt();
		int a=0;
		int temp=n;
		while(temp!=0)
		{
			a+=fact(temp%10);
			temp/=10;
		}
		if(a==n)
			System.out.println(n+" is peterson number");
		else
			System.out.println(n+" is not a peterson number");
	}
	}
	static int fact(int b) 
	{
		int k=1;
		for(int i=1;i<=b;i++)
		{
			k=i*k;
		}
		return k;
	}
}