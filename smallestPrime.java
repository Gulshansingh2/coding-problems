package competitiveCoding;
import java.util.Scanner;
 
public class smallestPrime{
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
		
		int T = sc.nextInt();
		
		System.out.println();
		
		int res[] = new int[T];
				
		for(int k = 0; k < T; k++) {
			res[k] = -1;
			
			int N = sc.nextInt();
			
			System.out.println();
			
			int[] a = new int[N];
			
			boolean flag = false;
			
			
			for(int j = 0; j < N; j++) {
				a[j] = sc.nextInt();
				if(a[j] == 1) {
					flag = true;
				}
			}
			
			if(flag == true) {
				int j;
				for(j = 0; j < N; j++) {
					if(isPrime(a[j])) {
							res[k] = a[j];
							break;
						}
					}
				
				for(; j < N; j++) {
					if(isPrime(a[j])) {
						if(res[k] >= a[j]) {
							res[k] = a[j];
						}
					}
				}
				}
			
		}
			
		for(int k = 0; k < T; k++) {
			System.out.println(res[k]);
		}
		
	}
} 