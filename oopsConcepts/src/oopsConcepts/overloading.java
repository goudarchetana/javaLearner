package oopsConcepts;

public class overloading {
	public static void main(String[] args) {
		
		addition obj = new addition();
		obj.sum(5,2,7);
		
	}

}

class addition {
	public void sum(int x, int y) {
		System.out.println("2 integer parameters , Sum is : "+ (x+y));
	}
	
	public void sum(double x, double y) {
		System.out.println("2 double parameters, Sum is : "+ (x+y));
	}
	
	public void sum(int x, int y, int z) {
		System.out.println("3 integer parameters, Sum is : " + (x+y+z));
	}
}
