package oopsConcepts;

public class dynamic {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		A ref;
		ref = c;
		
		ref.display();
	}
}

class A{
	public void display() {
		System.out.println("In class A");
	}
}

class B extends A{
	public void display() {
		System.out.println("In class B");
	}
}

class C extends A{
	public void display() {
		System.out.println("In class C");
	}
}
