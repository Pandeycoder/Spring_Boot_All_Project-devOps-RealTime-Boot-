package W3Resources.javabasicexercises;

public class HexagonArea6 {
	public static void main(String[] args) {

		System.out.println(hexaArea(6));
		System.out.println(polygon(7,6));
	}
	
	static double hexaArea(double length)
	{
		return ((6*length*length)/(4*Math.tan(3.14/6)));
	}
	
	static double polygon(double len,double side)
	{
		return ((side*len*len)/(4*Math.tan(3.14/side)));
	}

}
