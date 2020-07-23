import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner myobj= new Scanner(System.in);
		int a1;
		
		System.out.println("Enter Factorial Number");
		a1 = myobj.nextInt();	
		
		int i, fact=1;
		
		for(i=1; i<=a1; i++) {
			
			fact=fact*i;
		}
		System.out.print(fact);
		

	}

}
