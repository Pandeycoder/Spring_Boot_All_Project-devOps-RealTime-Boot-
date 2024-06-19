package Interface;

class vachile1 {public void Vachile1() {	}}
class color {public void Color() {	}}

class Car1 extends vachile1 {
	public void vachile1() {
		System.out.println("Hello car..........");
	}
}

class Car3 extends color {
	public void Color() {
		System.out.println("Hello red..........");
	}
}

public class Multiple {
	public static void main(String[] args) {
   
		Car1 b=new Car1();
		b.vachile1();
		
	}

}