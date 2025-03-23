package hw5;

public class HomeWork5_5 {
	    
    public static void genAuthCode() {
    	
//   unicode : '\u0030',0x30 = 0, '\u0041',0x41 = A, '\u0061',0x61 = a 
    	
    	char[] charArray = new char[8];		
    	
    	for(int i = 0; i < charArray.length; i++) {
    		int character = (int)(Math.random()*3 + 1);
    		
    		if(character == 1) {
    			char s1 = (char)(0x30 + (char)(Math.random()*9));
//    			System.out.println(s1);
    			charArray[i] += s1;
    		}else if(character == 2) {
    			char s2 = (char)( 0x41 + (char)(Math.random()*26));
//    			System.out.println(s2);
    			charArray[i] += s2;
    		}else {
    			char s3 = (char)( 0x61 + (char)(Math.random()*26));
//    			System.out.println(s3);
    			charArray[i] += s3;
    		}
    	}
    	
    	for(int i = 0; i < charArray.length; i++) {
    		System.out.print(charArray[i]);
    	}
    	
    }

    public static void main(String[] args) {
       genAuthCode();
//    	System.out.println('\u0041');
//    	char s = 0x30;
//    	System.out.println(s);
    }
	
}
