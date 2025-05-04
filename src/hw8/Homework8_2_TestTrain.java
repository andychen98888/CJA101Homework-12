package hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Homework8_2_TestTrain {

	public static void main(String[] args) {
		Set<Train> trainSet = new HashSet<>();
		trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
		trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700)); //重複
		
		for(Train train : trainSet) {
			System.out.println(train);
		}
		System.out.println("===========================================================");
		
		Iterator<Train> it = trainSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("===========================================================");

		List<Train> trainList2 = new ArrayList<>(trainSet); 
		for (int i = 0; i < trainList2.size(); i++) {
		    System.out.println(trainList2.get(i));
		}
		
		System.out.println("=====================班次編號由大到小======================");

		List<Train> trainList = new ArrayList<>(trainSet);
		trainList.sort((t1, t2) -> t2.getNumber() - t1.getNumber());

//		for (Train train : trainList) {
//		    System.out.println(train);
//		}
		for (int i = 0; i < trainList.size(); i++) {
		    System.out.println(trainList.get(i));
		}
		
	}

}
