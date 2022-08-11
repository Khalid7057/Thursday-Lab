import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate 
{
	public static void main(String[]args)
	{
		List<Integer> primes = new ArrayList<Integer>();
	    primes.add(20);
	    primes.add(13);
	    primes.add(54);
	    primes.add(77);  
	    primes.add(77);
	    primes.add(20);
	    System.out.println("List of number:"+primes);
	    Set<Integer> primesWithoutDuplicates= new LinkedHashSet<Integer>(primes);
	    primes.clear();
	    primes.addAll(primesWithoutDuplicates);
	    System.out.println("list of Number without duplicates:"+primes); 
	}
}