package designPattern.FactoryDesign;

public class DeveloperClient {

	public static void main(String[] args) {
		Employee employee = employeeFactory.getEmployee("ANDROID Developer");
		int Salary = employee.Salary();
		System.out.println( Salary);
	}

}
