package interfaceEx.ch02;

interface I{
	void methodB();
}

class B implements I{
	@Override
	public void methodB() {
	}
}

class A{
	void methodA(I i) {
		i.methodB();
	}
}

public class IndependencyParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
