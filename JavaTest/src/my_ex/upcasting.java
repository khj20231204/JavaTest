package my_ex;

class Parent{
	public void parentPrn() {
		System.out.print("parentPrn");
	}
}

class Child extends Parent{
	public void childPrn() {
		System.out.println("childPrn");
	}
}

public class upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p;
		p = new Child(); 			//업캐스팅
		
		Parent p2 = new Child();//업캐스팅
		
		p2.parentPrn();
		//p2.childPrn(); //업캐스팅이 되면 참조 가능 영역 축소
		
		Child c;
		c = (Child)p;			//다운캐스팅
		
		Child c2 = (Child)p;	//다운캐스팅
		
		c2.parentPrn();
		c2.childPrn();
		//다운 캐스팅이 되면 참조 가능 영역 확대
	}
}
