package oopsconcepts;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.Name = "Avinash Chauhan";
		emp1.EmpId = 1998;
		emp1.SetSalary(42000);
		
		Employee emp2=new Employee();
		emp2.Name = "Vivek Chauhan";
		emp2.EmpId = 1996;
		emp2.SetSalary(70000);
		
		Employee emp3=new Employee("Jyoti Chauhan",1995,90000);
		
		emp1.Display();
		emp2.Display();
		emp3.Display();
		
		ICICI obj1= new ICICI();
		obj1.AccNo=10222323;
		obj1.BankId=199878;
		
		obj1.Display();
		HFDC obj2= new HFDC();
		
		obj2.Account= 0007376016;
		
		
	}

}
