class  Employe
{
	String name;
	int join;
	String salary;
	String add;
	Employe(String name,int join,String salary,String add)
	{
		this.name=name;
		this.join=join;
		this.salary=salary;
		this.add=add;
	}
	void dis()
	{
		System.out.print(name);
		System.out.print(join);
		System.out.print(salary);
		System.out.print(add);
		System.out.println();
	}
}
class Info1
{
	public static void main (String []args)
	{
		Employe s=new Employe("Robert   ",  1994,"    64C","   WallsStreat");
		Employe a=new Employe("Sam   ",   2000,"   68C","   WallsStreat");
		Employe b=new Employe("John   ",   1999,"   26B","   WallsStreat");
		s.dis();
		a.dis();
		b.dis();
	}
}