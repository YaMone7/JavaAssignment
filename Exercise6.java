import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner myobj= new Scanner(System.in);
		Double num;
			
		System.out.println("Enter Number");
		num = myobj.nextDouble();	
			    
			    DecimalFormat decimalFormat =  new DecimalFormat("00,00"); 
			   
			    System.out.println(decimalFormat.format(num)); 
		}
	}


