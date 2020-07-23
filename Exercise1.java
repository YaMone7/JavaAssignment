import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner myobj= new Scanner(System.in);
		String userName;
		
		System.out.println("Enter userName");
		userName = myobj.nextLine();
		
		System.out.println("User Name is : " + userName);
		char c=userName.charAt(userName.length() -1);
		System.out.println(c + userName);

	}

}
