package interface_change_java8;

public class Employee {
	final int empId;

	Employee(int empId) {
		this.empId = empId; //karthik.empId=2345
		
		                    //pragati.empId=2347
	}

	public static void main(String[] args) {

		Employee karthik = new Employee(2345);

		Employee pragati = new Employee(2347);

		// karthik.empId=23455;

	}
}
