abstract class Marks
{
	abstract float getPercentage();
}
	class A extends Marks
	{
		float sub1 , sub2 , sub3;
		float percent=0;
		A(float a , float b, float c)
		{
		sub1 = a;
		sub2 = b;
		sub3 = c;    
		}
		public float getPercentage()
		{
		percent = (sub1 + sub2 + sub3 )/300* 100; 
		return percent;
		}
	}
	class B extends Marks
	{
		float sub1 , sub2 , sub3 , sub4;
		float percent=0;
		B(float a , float b, float c,float d)
		{
			sub1 = a ;
			sub2 = b;
			sub3 = c;    
			sub4 = d;
		}
	public float getPercentage()
	{
		percent = (sub1 + sub2 + sub3 + sub4 )/400* 100; 
		return percent;
	}
	}
public class Percentage
{
	public static void main(String[] args) 
	{
		A obj = new A(90f, 75f, 85f);
		System.out.println("Student 1 Percentage: " +obj.getPercentage());
		B it = new B(60f , 60f , 80f , 90f);
		System.out.println("Student 2 Percentage: " +it.getPercentage());
	}   
}
