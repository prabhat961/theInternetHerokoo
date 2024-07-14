package designPattern.FactoryDesign;

public class employeeFactory {
	
	//get the Employee
	public static Employee getEmployee(String empType) {
		if (empType.trim().equalsIgnoreCase("ANDROID Developer")) {
			return new AndroidDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("WebDeveloper")) {
			return new WebDeveloper();
		}
		else {
			return null;
		}
	}

}
