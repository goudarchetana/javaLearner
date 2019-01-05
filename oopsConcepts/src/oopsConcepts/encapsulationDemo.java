package oopsConcepts;

public class encapsulationDemo {
	
	public static void main(String[] args) {
		
		employee E = new employee();
		E.setEmpID(10);
		E.setEmpName("Mohan");
		
		System.out.println("Empolyee ID: "+E.getEmpID()+"\nEmployee Name :\t"+E.getEmpName());
	}

}

class employee{
	private int empID;
	private String empName;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
}
