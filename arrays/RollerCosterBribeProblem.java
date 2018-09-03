package arrays;

import java.util.Scanner;

//minimum bribes problem
public class RollerCosterBribeProblem {

    static String minimumBribes(int[] q) {
    	int len=q.length, no, swapCount = 0;
     	boolean flag = false;
	    int a[] = new int [len];
	    int swapArr[] = new int[len];
	    int loc[] = new int[len];
	    for(int i=0;i<len;i++) {
	        a[i]=i+1;
	        loc[i]=i;
	        swapArr[i] = 0;
	    }
	    
	    loop1: for(int i=len-1;i>=0;i--){
        	if(a[i] == q[i])
        		continue;

	        no = q[i];
	        for(int j = loc[no-1]; j < i ; j++){
	        
	        	
	        	int count  = swapArr[a[j+1]-1] + 1;
	        	if(count > 2) { 
	        		flag = true;
	        		break loop1;
	        
	        	}
	        	
	        	
	        	swapArr[a[j+1]-1] = count;
	            int temp;
	            temp = a[j];
	            a[j] = a[j+1];
	            a[j+1] = temp;
	            temp = loc[j+1];
	            loc[j+1] = loc[no-1];
	            loc[no-1] = temp;
	            
	         
	        }
	    }
	    
	    if(flag == true) {
	    	return "Too chaotic";
	    }
	    
	    
	    for(int i=0;i<len;i++) {
	    	System.out.print(swapArr[i]);
	        swapCount+=swapArr[i];
	    }
	    
	    return ""+swapCount;

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String res[] = new String[t];
        
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            res[tItr]=minimumBribes(q);
        }
        
        for (int tItr = 0; tItr < t; tItr++) {
           System.out.println(res[tItr]);
        }

        scanner.close();
    }
}