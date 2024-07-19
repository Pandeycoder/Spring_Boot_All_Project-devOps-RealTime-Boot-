package overriding;

public class WhatsApp3 extends WhatsApp2 {

	@Override
	void display() {
		super.display();
		System.out.println("Blue Ticks Supported");
	}

	@Override
	void call() {
		super.call();
		System.out.println("Video call goin on...");

	}

	void story() {
		System.out.println("Status image is showing new features");
	}

}
