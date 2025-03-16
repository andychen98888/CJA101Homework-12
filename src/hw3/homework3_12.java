package hw3;

import java.util.Scanner;

public class homework3_12 {
	
	public static void main(String[] args) {
		
/*
//		1.三角形
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個三角形的邊長:");
		int a = checkNextInt(sc);
		int b = checkNextInt(sc);
		int c = checkNextInt(sc);
		
		System.out.println(a + " " + b + " " + c);
		
		if(a+b>c && a+c>b && b+c>a) {
			if( a == b && b == c) {
				System.out.println("此為正三角形");
			}else if( a==b || b==c || a==c) {
				System.out.println("此為等腰三角形");
			}else if(a!=b && a!=c && b!=c) {
				System.out.println("此為其他三角形");
			}
		}else {
			System.out.println("此非三角形");
		}
		
		
//		2.猜數字
		int answer = (int)(Math.random()*10);
//		System.out.println(answer);
		
		System.out.println("開始猜數字吧!");
		
		Scanner sc = new Scanner(System.in);
		int number = checkNextInt(sc);
		
		while( number != answer) {
			System.out.println("猜錯囉");
			number = checkNextInt(sc);
		}
		
		System.out.println("答對了!答案就是" + answer);
		*/
		
//		3.大樂透
		Scanner sc = new Scanner(System.in);
		
		System.out.println("阿文···請輸入你討厭哪個數字?");
		int number = checkNextInt(sc);
		
		while(number < 1 || number > 9) {
			System.out.println("請輸入1~9的整數");
			number = checkNextInt(sc);
		}
//		System.out.println(number);
		
		int count = 0;
		for(int b = 1; b <= 49; b++) {
			int ten = b / 10;
			int one = b % 10;
			
			if( ten != number && one != number) {
				System.out.print(b+" ");
				count++;
			}
		}
		System.out.println("總共有"+count+"數字可以選");
		
		
	}
		
	public static int checkNextInt(Scanner sc) {
		while(true){
			if (sc.hasNextInt()) {  
	            return sc.nextInt();
	        } else {
	            System.out.println("輸入錯誤，請從新輸入");
//	            System.out.println("請輸入三個三角形的邊長:");
	            sc.next();
	        }
		}
	}
	
	
}
