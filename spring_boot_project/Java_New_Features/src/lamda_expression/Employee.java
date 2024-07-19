package lamda_expression;

public class Employee {

	private String empName;
	private int empId;
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	
	public Employee()
	{
		
	}
	

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	
	public Employee(String empName,int empId) {
		super();
		this.empName = empName;
		this.empId=empId;
	}


	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String toString()
	{
		return " empName empId "+empName+" "+empId;
	}
	

}
