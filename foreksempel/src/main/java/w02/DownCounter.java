package w02;

public class DownCounter {
	int counter = 0;

	public DownCounter(int counter) {
		this.counter = counter;
	}
	
	public boolean isFinished() {
		return counter == 0;
	}

	public void countDown() {
		if (!isFinished()) {
			counter--; // samme som 'counter -= 1' som er det samme som 'counter = counter - 1'
			System.out.println("Teller ned, er på " + counter);
		}
	}

	public static void main(String[] args) {
		DownCounter dc = new DownCounter(4);
		System.out.println(dc.isFinished());
		dc.countDown();
		System.out.println(dc.isFinished());
		dc.countDown();
		System.out.println(dc.isFinished());
		dc.countDown();
		System.out.println(dc.isFinished());
		dc.countDown();
		System.out.println(dc.isFinished());
		dc.countDown();
		System.out.println(dc.isFinished());
		dc.countDown();
	}
}
