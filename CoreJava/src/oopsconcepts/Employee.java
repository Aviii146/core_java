package oopsconcepts;

public class Employee {
	String Name;
	int EmpId;
	private int Salary;
	
	public void Display() {
		System.out.println("Employee Name is " + Name);
		System.out.println("Employee Code is " + EmpId);
		System.out.println("Employee Code is " + Salary);
	}
	public void SetSalary(int sal) {
		this.Salary = sal;
	}
	
	
//Constructor = Special method which has Same Name as Class name
	
	//Default constructor
	public Employee() {
		
	}
	
	//parameterized constructor
	public Employee(String Name1, int EmpId1, int Salary1) {
		this.Name= Name1;
		this.EmpId= EmpId1;
		this.Salary = Salary1;
	}
}
