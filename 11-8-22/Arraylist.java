import java.util.ArrayList;
import java.util.List;

public class Arraylist 
{

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(83);
		list.add(15);
		list.add(37);
		list.add(50);
		list.add(51);
		System.out.println("All elements - " + list);
		list.remove(1);
		list.remove(4);
		System.out.println("List after remove elements - " + list);
	}
}