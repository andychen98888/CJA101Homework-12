package hw2;

public class homework2_12 {

	public static void main(String[] args) {
		
//		請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum = 0;
		for(int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println(sum);

//		請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int product = 1;
		for(int j = 1; j <= 10; j++) {
			product *= j;
		}
		System.out.println(product);
		
//		請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int product2 = 1;
		int k = 1;
		while(k <= 10) {
			product2 *= k;
			k++;
		}
		System.out.println(product2);
		
//		請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		int a_sum = 0;
		for(int a = 1; a <= 20; a += 2) {
			System.out.print( (a_sum += a) + " ");
		}
		
		System.out.println();
//		 阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int count = 0;
		for(int b = 1; b <= 49; b++) {
			int ten = b / 10;
			int one = b % 10;
			
			if( ten != 4 && one != 4) {
				System.out.print(b+" ");
				count++;
			}
		}
		System.out.print(",共"+count+"個");
		
		System.out.println();
//		 請設計一隻Java程式，輸出結果為以下：
//		 1 2 3 4 5 6 7 8 9 10
//		 1 2 3 4 5 6 7 8 9
//		 1 2 3 4 5 6 7 8
//		 1 2 3 4 5 6 7
//		 1 2 3 4 5 6 
//		 1 2 3 4 5
//		 1 2 3 4 
//		 1 2 3 
//		 1 2 
//		 1
		for(int c = 10; c >= 1; c--) {
			for(int d = 1; d <= c; d++) {
				System.out.print(d + " ");
			}
			System.out.println();
		}
//		 請設計一隻Java程式，輸出結果為以下：
//		 A
//		 BB
//		 CCC
//		 DDDD
//		 EEEEE
//		 FFFFFF		
		for (char e = 'A'; e <= 'F'; e++) { // 外層迴圈控制字母，從 'A' 到 'F'
            for (int f = 'A'; f <= e; f++) { // 內層迴圈控制輸出的字母數量
                System.out.print(e); // 印出字母
            }
            System.out.println(); 
		}
		
	}

}
