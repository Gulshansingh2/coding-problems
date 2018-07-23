package competitiveCoding;
import java.util.Scanner;
 
public class smallestPrime{

  //function to find the prime no.	
 static boolean isPrime(int n)
	    {
	        if (n <= 1) return false;
	        if (n <= 3) return true;
	     
	        if (n % 2 == 0 || n % 3 == 0) return false;
	     
	        for (int i = 5; i * i <= n; i = i + 6)
	            if (n % i == 0 || n % (i + 2) == 0)
	            return false;
	     
	        return true;
	    }
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//no. of Test cases
		int T = sc.nextInt();
		
		System.out.println();
		
		//result array
		int res[] = new int[T];
				
		for(int k = 0; k < T; k++) {
			res[k] = -1;
			
			//Length of input array
			int N = sc.nextInt();
			
			System.out.println();
			
			int[] a = new int[N];
			
			//flag to determine if array contains 1
			boolean flag = false;
			
			
			for(int j = 0; j < N; j++) {
				a[j] = sc.nextInt();
				if(a[j] == 1) {
					flag = true;
				}
			}
			
			if(flag == true) {
				int j;
				
				//first prime no. in list
				for(j = 0; j < N; j++) {
					if(isPrime(a[j])) {
							res[k] = a[j];
							break;
						}
					}
				
				//smallest prime no.
				for(; j < N; j++) {
					if(isPrime(a[j])) {
						if(res[k] >= a[j]) {
							res[k] = a[j];
						}
					}
				}
				}
			
		}
			
		//print results
		for(int k = 0; k < T; k++) {
			System.out.println(res[k]);
		}
		
	}
} 
