package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Homework7_2 {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);
			
            for (int i = 0; i < 10; i++) {
                int number = (int) (Math.random() * 1000) + 1;
                ps.println(number);
//                System.out.println(number);
            }
            
            ps.close();
            bos.close();
            fos.close();
        } catch (IOException e) {
			e.printStackTrace();
        }
		
	}	
}
