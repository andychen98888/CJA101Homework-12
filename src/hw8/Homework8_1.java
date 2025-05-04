package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework8_1 {
	public static void main(String[] args) {

		List list = new ArrayList();
		
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(3.14));
		list.add(Long.valueOf(21L));
		list.add(Short.valueOf("100"));
		list.add(Double.valueOf(5.1));
		list.add("Kitty");
		list.add(Integer.valueOf(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		Iterator objs = list.iterator();
		while(objs.hasNext()) {
			System.out.print(objs.next() + " ");
		}
		
		System.out.println();
		System.out.println("=====================================================================");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		
		System.out.println();
		System.out.println("=====================================================================");

		for(Object obj:list) {
			System.out.print(obj + " ");
		}
		
		System.out.println();
		System.out.println("=====================================================================");


		Iterator<Object> i = list.iterator();
		while (i.hasNext()) {
		    Object obj = i.next();
		    if (!(obj instanceof Number)) {
		        i.remove();
		    }
		}
		
		for(Object obj:list) {
			System.out.print(obj + " ");
		}

		
	}
}
