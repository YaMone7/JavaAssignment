import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner myobj= new Scanner(System.in);
		String str;
			
		System.out.println("Enter userName");
		str = myobj.nextLine();	
		
	     
		char ch[] = str.toCharArray(); 
        for (int i = 0; i < str.length(); i++) { 
             if (i == 0 && ch[i] != ' ' ||  
                ch[i] != ' ' && ch[i - 1] == ' ') { 
  
              if (ch[i] >= 'a' && ch[i] <= 'z') { 
  
              ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
             }
            
  
          
 
        System.out.println(ch); 
        	
    } 
	}
}
	
    
      
    
	


