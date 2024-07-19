package overriding;

class Son extends Father {

	@Override
	void bike() {
		System.out.println("New Modified son's bike  !...");
	}

	public static void main(String[] args) {

		Son s = new Son();
		s.bike();
	}
}
