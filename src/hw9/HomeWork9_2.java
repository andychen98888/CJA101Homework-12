package hw9;

	class BankAccount {
	    private int balance = 0;

	    public synchronized void deposit(int amount) throws InterruptedException {
	        while (balance > 3000) {
	            System.out.println("媽媽看到餘額在3000以上，暫停匯款");
	            wait();
	        }
	        balance += amount;
	        System.out.println("媽媽存了" + amount + "，帳戶共有：" + balance);
	        notifyAll(); // 通知熊大可以提款
	    }

	    public synchronized void withdraw(int amount) throws InterruptedException {
	        while (balance < amount) {
	            System.out.println("熊大看到帳戶沒錢，暫停提款");
	            wait();
	        }

	        balance -= amount;
	        System.out.println("熊大領了" + amount + "，帳戶共有：" + balance);

	        if (balance <= 2000) {
	            System.out.println("熊大看到餘額在2000以下，要求匯款");
	        }

	        notifyAll(); // 通知媽媽可以匯款
	    }
	}

	
	public class HomeWork9_2 {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount();

	        Thread mom = new Thread(() -> {
	            try {
	                for (int i = 0; i < 10; i++) {
	                    account.deposit(2000);
	                    Thread.sleep(100); // 模擬匯款時間
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread bear = new Thread(() -> {
	            try {
	                for (int i = 0; i < 10; i++) {
	                    account.withdraw(1000);
	                    Thread.sleep(100); // 模擬提款時間
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        mom.start();
	        bear.start();
	    }
	}


