public class Anagram {

	public static void main(String[] args) {
		System.out.println(anagram("heart", "earth"));
	}
	
	static Boolean anagram(String str1, String str2) {
		
		int[] c1 = new int[26];
		int[] c2 = new int[26];
		
		for(int i = 0; i < str1.length(); i++) {
			int pos = (int)(str1.charAt(i)) - 97;
			c1[pos] = c1[pos]  + 1;
		}
		
		for(int i = 0; i < str2.length(); i++) {
			int pos = (int)(str2.charAt(i)) - 97;
			c2[pos] = c2[pos]  + 1;
		}
		
		int j = 0;
		Boolean ok = true;
		
		while(j<26 && ok) {
			if (c1[j] == c2[j]) {
				j = j+1;
			}
			else
				ok = false;
		}
		return ok;
	}
}
