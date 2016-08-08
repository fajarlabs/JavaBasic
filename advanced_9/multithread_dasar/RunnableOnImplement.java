package advanced_9.multithread_dasar;

public class RunnableOnImplement {
	public static void lihatHasil() {
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						System.out.println("Pesan dari thread : T1 ke " + i);
						int miliDetik = 1000; // 1 detik
						Thread.sleep(miliDetik);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}, "Thread 1").start();

		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						System.out.println("Pesan dari thread : T2 ke " + i);
						int miliDetik = 1000; // 1 detik
						Thread.sleep(miliDetik);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}, "Thread 2").start();
	}
}
