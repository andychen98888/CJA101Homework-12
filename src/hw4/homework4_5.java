package hw4;

import java.util.Scanner;

public class homework4_5 {
	
//	 5.請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	 (提示1：Scanner，陣列)
//	 (提示2：需將閏年條件加入)
//	 (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year,month,day;
		
		while (true) {
			System.out.print("請輸入年份yyyy:");
            year = sc.nextInt();
            System.out.print("請輸入月份mm:");
            month = sc.nextInt();
            System.out.print("請輸入日期dd:");
            day = sc.nextInt();

            if (checkScanner(year, month, day)) {
                break;
            }
            
            System.out.println("請重新輸入日期\n");
        }
		
		int dayOfYear = dayOfYear(year, month, day);
		System.out.println("輸入的日期為該年第" + dayOfYear + "天");
		
	}

	
	public static boolean checkScanner(int year, int month, int day) {
		if(year < 1) {
			System.out.println("年份輸入錯誤！");
			return false;
		}else if(month < 1 || month > 12) {
			System.out.println("月份輸入錯誤！");
			return false;
		}else if(day < 1 || day > 31) {
			System.out.println("日期輸入錯誤！");
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 || year % 1000 == 0;
	}
	
	public static int dayOfYear(int year, int month, int day) {
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        int dayOfYear = 0;
        for (int i = 0; i < month-1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;
        return dayOfYear;
    }
	 
	 
	 
	 
}
