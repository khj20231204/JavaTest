package interfaceEx.ch01;

class A{
	void methodA(B b) {
		b.methodB();
	}
}

class B{
	void methodB(){
		
	}
}

public class DependencyParamter {

	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());

	}

}
