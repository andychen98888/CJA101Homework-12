package hw9;

import java.util.Random;

public class EatRunnable implements Runnable {
	private String name;
	private Random random = new Random();

	public EatRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int bowl = 1; bowl <= 10; bowl++) {
			System.out.println(name + "吃第" + bowl + "碗飯");
			try {
				Thread.sleep(500 + random.nextInt(2501)); // 500～3000 毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了！");
	}

	public static void main(String[] args) {
		System.out.println("-----大胃王快食比賽開始！-----");

		Thread mantou = new Thread(new EatRunnable("饅頭人"));
		Thread james = new Thread(new EatRunnable("詹姆士"));

		mantou.start();
		james.start();

		try {
			mantou.join(); 
			james.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("-----大胃王快食比賽結束！-----");
	}
}


