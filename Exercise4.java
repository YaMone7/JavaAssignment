import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner myobj= new Scanner(System.in);
		String str;
		
		System.out.println("Enter String");
		str = myobj.nextLine();	
	    int slength = 2;
	    if (slength > str.length()) {
	      slength = str.length();
	    }

	    String subpart = str.substring(0, str.length() -2);
	    System.out.println(subpart + str + subpart);
	  }
	

	}

