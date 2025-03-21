package hw4;

import java.util.Scanner;

public class homework4_1234 {
	public static void main(String[] args) {
//	 1.有個一維陣列如下：
//	 {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	 (提示：陣列，length屬性)
		int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int i = 0; i < intArray.length ; i++) {
//			System.out.println(intArray[i]);
			sum += intArray[i];
		}

		double avg = sum/intArray.length;
		System.out.print("平均值="+ avg + ",大於平均值的元素:");
		for(int j = 0; j < intArray.length; j++) {
			if(intArray[j] > avg) {
				System.out.print(intArray[j] + " ");
			}
		}
		System.out.println();
		System.out.println("===============================");
//	2.請建立一個字串，經過程式執行後，輸入結果是反過來的
//	例如String s = “Hello World”，執行結果即為dlroW olleH
//	 (提示：String方法，陣列)
		String s = "Hello World";
		String s2 = "";
//		System.out.println(s.length());
		for(int i = s.length()-1; i >= 0; i--) {
			s2 += s.charAt(i);
		}
		
		System.out.println(s2);
		System.out.println("===============================");

//	3.有個字串陣列如下(八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//	(提示：字元比對，String方法)
	String[] sArray = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
	int count = 0;
	for(int i = 0; i < sArray.length; i++) {
		for(int j = 0 ; j < sArray[i].length(); j++) {
			switch(sArray[i].charAt(j)){
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			}
		}
	}
	System.out.println(count);
	System.out.println("===============================");
	
//	4.阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
//	表如下：
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共3 人!」
//	(提示：Scanner，二維陣列)
	int[][] coworker = { {25,2500}, {32,800}, {8,500}, {19,1000}, {27,1200}};
	Scanner sc = new Scanner(System.in);
	System.out.println("請輸入金額:");
	int money = sc.nextInt();
	int people = 0;
	for(int i = 0; i < coworker.length; i++) {
		if(coworker[i][1] >= money) {
			people++;
			System.out.print(coworker[i][0] + " ");
		}
	}
	System.out.print( "共" + people + "人");
	
	
	
	}
}
