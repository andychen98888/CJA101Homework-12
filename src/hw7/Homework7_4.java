package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Homework7_4 {
	public static void main(String[] args) {
		File file = new File("C:/data");
		if(!file.exists()) {
			file.mkdir();
		}
	
		File pet = new File(file, "Object.ser");
		
		Dog dog = new Dog("Doggy");
        Cat cat = new Cat("Kitty");
        
        try {
            FileOutputStream fos = new FileOutputStream(pet);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(dog);
            oos.writeObject(cat);

            oos.close();
            fos.close();

            System.out.println("OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
	
	
	
	public class ObjectReader {
	    public static void main(String[] args) {
	        String filePath = "C:\\data\\Object.ser";

	        try {
	        	FileInputStream fis = new FileInputStream(filePath);
	        	ObjectInputStream in = new ObjectInputStream(fis);
	        	
	            for (int i = 0; i < 4; i++) {
	                Object obj = in.readObject();

	                if (obj instanceof Speakable) {
	                    Speakable speakObj = (Speakable) obj;
	                    speakObj.speak(); 
	                } 
	                
	            }
	            
	            in.close();
	            fis.close();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	
	
}
