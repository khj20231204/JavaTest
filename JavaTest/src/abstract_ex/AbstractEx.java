package abstract_ex;

abstract class AbstractClass{
	int a = 10;
	void Method() {
		System.out.println("AbstractCalss");
	}
	abstract void absMethod();
}

abstract class MiddleClass extends AbstractClass{
	
	@Override
	void absMethod() {
		// TODO Auto-generated method stub
		
	}

	void Method() {
		System.out.println("MiddleClass");
	}
}

class SubClass extends MiddleClass{
	void Method() {
		System.out.println("SubClass");
	}
}

class Print{
	public void print(AbstractClass ac) {
		ac.Method();
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sc = new SubClass();
		Print p = new Print();
		p.print(sc);
		
		AbstractClass ac = new SubClass();
		
		if(ac instanceof SubClass) {
			System.out.println("instanceof SubClass");
		}
		
		if(ac instanceof AbstractClass) {
			System.out.println("instanceof AbstractClass");
		}
		
		p.print(ac);
	}

}
