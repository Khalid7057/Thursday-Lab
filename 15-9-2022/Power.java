import java.util.Scanner;

		
		public class Power {

			public static void main(String[] args) { // begin the main method
				
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the number: ");
				int n = sc.nextInt();
				System.out.println();
				System.out.printf("\tN\t10*N\t100*N\t1000*N\n", n, n*10,
				n*100, n*1000);
				for (int i=1; i<=n;i++){ 
				System.out.printf("\t%d\t%d\t%d\t%d\n",i, i*10,i*100,i*1000); 
				}
				}
		}
