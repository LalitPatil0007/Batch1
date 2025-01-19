package oops;

public class Employee {
	//Class and object concept

	String compName;
	String workDomain;
	String salary;
	
	public void performsAutomation() {
		System.out.println("tester performs Automation testing ");
		System.out.println("tester performs Automation1 testing ");
		System.out.println("tester performs Automation2 testing ");
	};
	
	public  String performsManual() {
		String output= "tester performs Manual testing";
		
		return output; 
	};

	
	public String performDatabase(String taskPerformed) {
		String outPut = "This tester perform " + taskPerformed + "as part of database testing";
		return outPut;
	};
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee  e1 = new Employee();
		Employee  e2 = new Employee();
		Employee  e3 = new Employee();
		Employee  e4 = new Employee();
		
		
		e1.compName = "Infy";
		e2.compName = "Hexa";
		e3.compName = "FIS";
		
		e1.performsAutomation();
		
		System.out.println(e2.performsManual()+" sjbdbhjdbshdbhjdbjs");
		
		System.out.println(e3.performDatabase("testing on MYSQL "));
		
		System.out.println(e4.performDatabase("testing on NOSQL "));
		
		
		
		
		

	}

}
