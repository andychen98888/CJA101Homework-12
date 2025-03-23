package hw5;

import java.util.Scanner;

public class homework5_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入寬度:");
		int width = sc.nextInt();
		System.out.println("請輸入高度:");
		int height = sc.nextInt();
		 
		starSquare(width, height);
	
	}
	
	public static void starSquare(int width, int height) {
		for(int i = 1 ; i <= height; i++) {
			for(int j = 1; j <= width ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}
