package hw5;

public class homework5_2 {
	
	public static void main(String[] args) {
		
		randAvg();

	}
	
	public static void randAvg() {
		
		int[] numberArray = new int[10];
		int sum = 0;
		
		
		for(int i = 1; i <= 10; i++) {
			int number = (int) (Math.random()*101);
			System.out.print(number + " ");
			sum += number;
		}
		
		System.out.println(sum);
		
		double avg = sum/numberArray.length;
		System.out.println(avg);
		
		
	}
	
}
