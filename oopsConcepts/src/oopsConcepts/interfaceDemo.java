package oopsConcepts;

interface A{
	public void a();
}

interface B{
	public void b();
}

class C implements A,B {
	public void a() {
		System.out.println("method of interface A");
	}
	
	public void b() {
		System.out.println("method of interface B");
	}
	
	public void hello() {
		System.out.println("Hello!!!");
	}
	
}


class X{
	int x;
	public void show() {
		System.out.println("show method class X");
	}
	
}

class Z extends X{
	
}
public class interfaceDemo {

	public static void main(String[] args) {
		A obj = new C();
		obj.a();
//		obj.b();         cannot do this . because the reference is of type interface A and thus can only access
		//the methods declared in interface A
//		obj.hello();
//		
		
		
	}
}
