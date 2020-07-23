import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner myobj= new Scanner(System.in);
		String str;
		
		System.out.println("Enter userName");
		str = myobj.nextLine();
		
		String strNew=str.substring(0, str.length() -1);
		System.out.println(strNew);

	}

}
