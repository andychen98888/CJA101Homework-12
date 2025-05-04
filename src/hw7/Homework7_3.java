package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
	
public class Homework7_3 {

	    public static void main(String[] args) {
	        copyFile("./src/hw7/first.txt", "./src/hw7/second.txt");
	    }
	    
	    public static void copyFile(String firstFile, String secondFile) {
	        try {
	        	FileInputStream fis = new FileInputStream(firstFile);
	            FileOutputStream fos = new FileOutputStream(secondFile);
	            		
	            byte[] b = new byte[1024];
	            int i;

	            while ((i = fis.read(b)) > 0) {
	                fos.write(b, 0, i);
	            }
	            System.out.println("複製完成");
	            
	            fos.close();
	            fis.close();
	        } catch (IOException e) {
				e.printStackTrace();
	        }
	    }
	    
	}