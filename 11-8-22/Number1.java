import java.lang.String;
public class Number1 
{
	public static void main(String[]args)
	{
		int k[] = new int[]{475,93,205,29,354,78,16};
		int sl = k[0];
		int l = k[0];
		for (int i = 1; i < k.length; i++)
		{
			if (k[i] > l)
			{
		    	l = k[i];
			}
			else if (k[i] < sl)
			{
		    	sl = k[i];
			}
		}
		System.out.println("Largest Number is : " + l);
		System.out.println("Smallest Number is : " + sl);	
	}
}
