package web_day15;

public class ThreadEx1_1 extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}
}
