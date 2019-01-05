package oopsConcepts;

public class overriding {

	public static void main(String[] args) {
		
		addChild obj = new addChild();
		obj.sum(2,4);
	}
}

class addParent{
	public void sum(int x, int y) {
		System.out.println("In addParent. Sum is : " + (x+y));
	}
}
class addChild extends addParent{ // method overriding, late binding, compike time polymorphism 	
	
	public void sum(int x, int y) { // addChild now has 2 sum functions but when sum is called
									//through an object of the child class, sum() of the  child class 
									//overrides the sum() of the parent class
		System.out.println("In addChild. Sum is : " + (x+y));
	}
}
