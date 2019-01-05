package inheritAdd;

public class solution {
	public static void main(String[] args) {
		adder adderObj = new adder();
		System.out.println("My superclass is :" + adderObj.getClass().getSuperclass().getName());
		
	
		System.out.println(adderObj.add(6,5));
	}
}
