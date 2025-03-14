package hw1;

public class homework1_12 {

	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a = 12;
		int b = 6;
		int sum = a + b;
		int s = 12 * 6;
		System.out.printf("值 = %s,積 = %s\n",sum , s);
//		• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int egg = 200;
		int dozen = egg / 12;
		int amount = egg % 12;
		System.out.printf("共%s打,%s顆\n",dozen,amount);
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int total = 256559;
		int sec = 1;
		int min = sec*60;
		int hr = min*60;
		int day = hr*24;
		
		int ansDays = total/day;
		int modSec = total%day;
		
		int ansHr = modSec/hr;
		modSec = modSec%hr;
		
		int ansMin = modSec/min;
		int ansSec = modSec%min;
		System.out.println(ansDays+ "天"+ansHr+"小時"+ansMin+ "分"+ansSec +"秒");
//		• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		double area = 5*5*PI;
		double perimeter = 5*2*PI;
		System.out.printf("面積=%.2f,周長=%.2f \n", area ,perimeter);
//		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		double PV = 150_0000;
		double R = 0.02;
		int n = 10;
		double FV = PV * Math.pow(1+R,n);
		System.out.printf("共有 %.2f 元 \n",FV); 
//		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println(5+5);
//		兩個int做運算為正常運算
		System.out.println(5+'5');
//		int與char做運算，char會轉換成int，char會依照unicode字碼做運算
		System.out.println(5+"5");
//		任何資料型別與字串相加，皆會變成字串
	}

}
