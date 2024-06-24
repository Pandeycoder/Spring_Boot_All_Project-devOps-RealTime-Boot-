package W3Resources.javabasicexercises;

public class JavaInstalledOrNot3 {
	public static void main(String[] args) {

		checkInstall();
	}

	private static void checkInstall() {
		System.out.println("Java Version :- " + System.getProperty("java.version"));
		System.out.println("Java RunTime :- " + System.getProperty("java.runtime.version"));
		System.out.println("Java Home :- " + System.getProperty("java.home"));
		System.out.println("Java Vendor :- " + System.getProperty("java.vendor"));
		System.out.println("Java Vendor url :- " + System.getProperty("java.vendor.url"));
		System.out.println("Java class Path :- " + System.getProperty("java.class.path"));
        
	}

}
