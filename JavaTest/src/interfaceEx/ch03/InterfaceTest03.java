package interfaceEx.ch03;

interface I{
	void methodB();
}

class B implements I{
	@Override
	public void methodB() {
		System.out.println("methodB");
	}
}

class InstanceManager{
	public static I getInstance() {
		return new B();
	}
}

public class InterfaceTest03 {
	
	public static void main(String[] args) {
		I i = InstanceManager.getInstance();
		i.methodB();
	}
}
