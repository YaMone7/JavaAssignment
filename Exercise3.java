import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner myobj= new Scanner(System.in);
		String str;
		
		System.out.println("Enter userName");
		str = myobj.nextLine();	
	
		
			
		
		if (str.length() > 1) {
		    char[] chars = str.toCharArray();
		    char first = chars[0];
		    chars[0] = chars[chars.length - 1];
		    chars[chars.length - 1] = first;
		    str = new String(chars);
		    System.out.println(str);
		
	}
	
	
}
}
