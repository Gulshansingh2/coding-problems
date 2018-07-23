package competitiveCoding;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
You are given a matrix of integers A with N rows (numbered 1 through N) and M columns (numbered 1 through M). Each element of this matrix is either 0 or 1.

A move consists of the following steps:

Choose two different rows r1 and r2 or two different columns c1 and c2.
Apply the bitwise OR operation with the second row/column on the first row/column. Formally, if you chose two rows, this means you should change Ar1,k to Ar1,k∨Ar2,k for each 1≤k≤M; if you chose two columns, then you should change Ak,c1 to Ak,c1∨Ak,c2 for each 1≤k≤N.
For each element of the matrix, compute the minimum number of moves required to make it equal to 1 or determine that it is impossible. Note that these answers are independent, i.e. we are starting with the initial matrix for each of them.
*/

public class ORMatrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //no. of test cases
		sc.nextLine();
		String[] res = new String[n]; //resultant array
		
		for(int j = 0; j<n; j++) {
			//space separated dimensions of array
			String dim = sc.nextLine();
			String[] dimArr = dim.split(" ");
			int x = Integer.parseInt(dimArr[0]); // x dimension
			int y = Integer.parseInt(dimArr[1]); //y dimension
			
			//input array
			int[][] arr = new int[x][y];
			//resultant array of particular input
			int[][] arrRes = new int[x][y];
			
			//flag to check if array contains 1
			boolean f= false;
			//take input
			for(int i = 0; i<x; i++) {
				String val  = sc.nextLine();
				String[] valArr = val.split(""); 
				for(int k=0; k<y; k++) {
					arr[i][k] = Integer.parseInt(valArr[k]);
					if(arr[i][k] == 1)
						f = true;
				}
			}
			if(f == true)
				for(int i = 0; i<x; i++) {
					for(int k=0; k<y; k++) {
						boolean flag = false;
						if(arr[i][k] == 0) {
							//check for 1 in the same column
							for(int p=0; p<x; p++) {
								if(arr[p][k] == 1) {
									arrRes[i][k] = 1;
									flag = true;
								}
							}
							
							//check for 1 in the same row
							if(flag == false)
								for(int p=0; p<y; p++) {
									if(arr[i][p] == 1) {
										arrRes[i][k] = 1;
										flag = true;
									}
								}
							if(flag == false)
								arrRes[i][k] = 2;
						}
						else {
							arrRes[i][k] = 0;
						}
					}
				}
				
			// if input array does not contain 1
			else{
				for(int i = 0; i<x; i++) {
					for(int k=0; k<y; k++) {
						arrRes[i][k] = -1;
					}
			}}
			
			//result string
			String result = "";
		
			for(int i = 0; i<x; i++) {
				for(int k=0; k<y; k++) {
					result += "" + arrRes[i][k];
				}
				result += "\n";
			}
			
			//add result to resultant array
			res[j] = result;
		}
		
		//display the results
		for(int j = 0; j < n; j++)
			System.out.println(res[j].trim());
	}
	

}
