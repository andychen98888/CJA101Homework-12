package hw4;

public class homework4_6 {

	  public static void main(String[] args) {
	
//	6.班上有8位同學，他們進行了6次考試結果如下：
//	請算出每位同學考最高分的次數
//	(提示：二維陣列)
		int[][] score = {
					{10, 35, 40, 100, 90, 85, 75, 70},
					{37, 75, 77, 89, 64, 75, 70, 95},
					{100, 70, 79, 90, 75, 70, 79, 90},
					{77, 95, 70, 89, 60, 75, 85, 89},
					{98, 70, 89, 90, 75, 90, 89, 90},
					{90, 80, 100, 75, 50, 20, 99, 75}
				};
		
		int student = score[0].length;
		int[] count = new int[student];
		
		
		for(int i = 0; i < score.length; i++) {
			int maxScore = 0;//放在裡面才會重置
			
			for(int j = 0; j < score[i].length; j++) {
				
				if(score[i][j] > maxScore) {
					maxScore = score[i][j];
				}
			}
			
			for (int j = 0; j < student; j++) {
                if (score[i][j] == maxScore) {
                    count[j]++;
                }
            }
			
		}
		
	
        for (int i = 0; i < student; i++) {
            System.out.println((i + 1) + "號 最高分次數:" + count[i]);
        }
	
		
  }
	  
}
