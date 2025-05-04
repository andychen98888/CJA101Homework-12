package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework7_1 {
	public static void main(String[] args) {
		String filePath = "./src/hw7/Sample.txt";
		int countChar = 0;
		int countLine = 0;
		try {
			File file = new File(filePath);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);			
			
			String s;
            while ((s = br.readLine()) != null) {
                countLine++;
                countChar += s.length(); 
            }
			
			System.out.println(file.getName() + "檔案共有" + file.length() + "個位元組，" + countChar + "個字元，" + countLine + "列資料");
			
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
