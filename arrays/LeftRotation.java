package arrays;

import java.io.IOException;
import java.util.Scanner;

public class LeftRotation {


    static int[] rotLeft(int[] a, int d) {
    	
    	for(int i=0; i<d/2; i++){ 
    		int temp = a[i]; 
    		a[i] = a[d -i -1]; 
    		a[d -i -1] = temp; 
    	}
    	    	
    	for(int i=d; i<(a.length+d)/2; i++){ 
    		int temp = a[i]; 
    		a[i] = a[a.length -i + d -1]; 
    		a[a.length -i + d -1] = temp; 
    	}
    	
    	for(int i=0; i<a.length/2; i++){ 
    		int temp = a[i]; 
    		a[i] = a[a.length -i -1]; 
    		a[a.length -i -1] = temp; 
    	}
    	
    return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);
        
        for(int r: result) System.out.print(r + " ");


        scanner.close();
    }

}
