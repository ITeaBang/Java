package thread;

public class ThreadMain3 {

	public static void main(String[] args) {

		Horse hor1 = new Horse();
		Horse hor2 = new Horse();
		Horse hor3 = new Horse();
		Horse hor4 = new Horse();
		Horse hor5 = new Horse();

		hor1.start();
		hor2.start();
		hor3.start();
		hor4.start();
		hor5.start();

	}

}
