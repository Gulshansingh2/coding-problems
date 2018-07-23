package competitiveCoding;

import java.util.Scanner;

public class EncodingMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String res[] = new String[n];
		
		for(int j = 0; j<n; j++) {
		
			int len = sc.nextInt();
			sc.nextLine();
		
			String str = sc.nextLine();
			String encodStr = "";
			for(int i = 0; i < str.length(); i = i+2) {
				if(str.length()%2 == 0) {
					char a = str.charAt(i);
					char b = a;
					a = str.charAt(i+1);
					encodStr += ""+a + b; 
				}
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
			
			String tempStr = encodStr; 
			encodStr = "";
			for(int i = 0; i < str.length(); i++) {
				int a =  tempStr.charAt(i);
				
				int b = 122 - (a-97);
				encodStr += Character.toString((char)b);
			}
			
			
			res[j] = encodStr;
		}
		
		for(int j = 0; j < n; j++)
			System.out.println(res[j]);
	}	
}
