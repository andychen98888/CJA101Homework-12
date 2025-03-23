package hw5;

public class homework5_3 {
	
	public static void main(String[] args) {
		
		int[][] intArray = { { 1, 6, 3 },{ 9, 5, 2 } };
		double[][] doubleArray = { {1.2, 3.5, 2.2 } , { 7.4, 2.1, 8.2 } };
		
		homework5_3 h = new homework5_3();
		System.out.println(h.maxElement(intArray));
		System.out.println(h.maxElement(doubleArray));
	}
	
	public int maxElement(int x[][]) {
		
		int maxNumber = 0;
		
		for(int i = 0; i < x.length; i++) {
			maxNumber = 0;
			
			for(int j =0; j < x[i].length; j++) {
				if(x[i][j] > maxNumber) {
					maxNumber = x[i][j];
				}
			}
			
		}
		return maxNumber;
		
	}
	
	public double maxElement(double x[][]) {
		double maxNumber = 0;
		
		for(int i = 0; i < x.length; i++) {
			maxNumber = 0;
			
			for(int j =0; j < x[i].length; j++) {
				if(x[i][j] > maxNumber) {
					maxNumber = x[i][j];
				}
			}
			
		}
		
		return maxNumber;
	}
	
}
