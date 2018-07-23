package competitiveCoding;

import java.util.Scanner;

public class EncodingMessage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//no. of test cases
		int n = sc.nextInt();
		
		//result array
		String res[] = new String[n];
		
		for(int j = 0; j<n; j++) {
		
			//length of input string
			int len = sc.nextInt();
			sc.nextLine();
		
			//input string
			String str = sc.nextLine();
			String encodStr = ""; // encoded string
			
			//Swap 1st <->2nd, 3rd<->4th ......... 
			for(int i = 0; i < str.length(); i = i+2) {
				//for even length of string
				if(str.length()%2 == 0) {
					char a = str.charAt(i);
					char b = a;
					a = str.charAt(i+1);
					encodStr += ""+a + b; 
				}
				//for odd length of string
				else {
					if(i < str.length() -1) {
						char a = str.charAt(i);
						char b = a;
						a = str.charAt(i+1);
						encodStr += ""+a+b; 
					}
					else {
						encodStr += ""+str.charAt(i);
					}
					
				}
			
			}
			
			//temprorary string to hold partially encoded string
			String tempStr = encodStr; 
			encodStr = "";
			
			//replace a<->z, b<->y ..................., z<->a
			for(int i = 0; i < str.length(); i++) {
				int a =  tempStr.charAt(i);
				
				int b = 122 - (a-97);
				encodStr += Character.toString((char)b);
			}
			
			
			res[j] = encodStr;
		}
		
		//display resultant array
		for(int j = 0; j < n; j++)
			System.out.println(res[j]);
	}	
}
