package example;

import java.util.Scanner;

public class matrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		int[][] mat = new int [n][n];
		
		for(int o=0; o<n; o++) {
			for(int h=0;h<n;h++) {
				mat[o][h] = sc.nextInt();			
			}
		}
		
		System.out.print("main diagonal: ");
		for(int i =0; i<n; i++) {
			System.out.print(mat[i][i]+ " ");
		}
			System.out.println();
			
			int con = 0;
			for(int u = 0; u<n; u++) {
				for(int o = 0; o<n; o++){
				if(mat[u][o] < 0) {
					con++;
					}
				}
		}
			System.out.print("Negative numbers: "+con);
		sc.close();	
	}

}
