import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class age {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the birth-date Date:Month:Year");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		LocalDate dob=LocalDate.of(y, m, d);
		LocalDate Today=LocalDate.now();
		long years=ChronoUnit.YEARS.between(dob,Today);
		System.out.println(years+"years old");
	}
}