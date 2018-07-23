package competitiveCoding;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ORMatrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] res = new String[n];
		
		for(int j = 0; j<n; j++) {
		
			String dim = sc.nextLine();
			String[] dimArr = dim.split(" ");
			int x = Integer.parseInt(dimArr[0]);
			int y = Integer.parseInt(dimArr[1]);
			
			int[][] arr = new int[x][y];
			int[][] arrRes = new int[x][y];
			
			boolean f= false;
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
							for(int p=0; p<x; p++) {
								if(arr[p][k] == 1) {
									arrRes[i][k] = 1;
									flag = true;
								}
							}
							
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
				
			else{
				for(int i = 0; i<x; i++) {
					for(int k=0; k<y; k++) {
						arrRes[i][k] = -1;
					}
			}}
			
			String result = "";
		
			for(int i = 0; i<x; i++) {
				for(int k=0; k<y; k++) {
					result += "" + arrRes[i][k];
				}
				result += "\n";
			}
			
			res[j] = result;
		}
		
		for(int j = 0; j < n; j++)
			System.out.println(res[j].trim());
	}
	

}
