package lamda_expression;

public class Employee implements Comparable<Employee> {

	private String empName;
	private int empId;
	private int salary;
	
	public int getEmpId() {
		return empId;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
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

	
	public Employee(String empName,int empId,int salary) {
		super();
		this.empName = empName;
		this.empId=empId;
		this.salary=salary;
	}


	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String toString()
	{
		return " "+empName+" "+empId+" "+salary;
	}

	

	@Override
	public int compareTo(Employee e) {
		
		return (e.getEmpId()<this.getEmpId())?1:((e.getEmpId()==this.getEmpId())?0:1);
	}
	

}
