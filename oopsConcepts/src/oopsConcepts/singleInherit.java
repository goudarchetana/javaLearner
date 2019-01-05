package oopsConcepts;

public class singleInherit {
	
	public static void main(String[] args) {
		addSubMul obj = new addSubMul();
		
		obj.x=8;
		obj.y=2;
		obj.sum();
		obj.sub();
		obj.mul();
				
	}
	
}

class add{
	int x;
	int y;
	
	public add() {
		System.out.println("In add");
	}
	public void sum() {
		System.out.println("Sum is : " + (x+y));
		
	}
}
class addSub extends add{
	public addSub() {
		System.out.println("In addSub");
	}
	public void sub() {
		System.out.println("Difference is : "+ (x-y));
	}
}

class addSubMul extends addSub{
	
	public addSubMul() {
		System.out.println("In addSubMul");
	}
	
	public void mul() {
		System.out.println("product is : "+(x*y));
	}
}

