@FunctionalInterface
interface factorial
{
	public void check (int a);
}
public class FactorialProgram
{

	public static void main(String[] args) {
		factorial n=(int num)->{
		int fac=1;
		for(int i=1; i<=num; i++)
		{
			fac=fac*i;
		}
		System.out.println("Factorial:"+fac);
	};
	n.check(4);
	n.check(9);
	n.check(7);
}

}