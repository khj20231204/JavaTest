package my_ex.inherit01;

class Parent{
	/*
	public Parent() {
		System.out.println("Parent 기본 생성자");
	}
	*/
	
	public Parent(int a) {
		System.out.println("Parent 매개변수가 있는 생성자");
	}
}

class Child extends Parent{
	
	public Child() {
		super(4);
		System.out.println("Child 기본 생성자");
	}
	
	 public Child(int a) {
		 super(8);
		 System.out.println("Child 매개변수가 있는 생성자");
	 }
}

public class inherit_constructor {

	public static void main(String[] args) {
		//Child c = new Child();
		//Parent 기본 생성자
		//Child 기본 생성자
		
		//1.Child에 기본 생성자가 없는 경우
		//Child c2 = new Child(4);
		//Parent 기본 생성자
		//Child 매개변수가 있는 생성자
		
		//2.Parent에 기본 생성자가 없는 경우
		Child c3 = new Child();
		//Parnet에 생성자가 없는 경우 기본 생성자가 자동 호출 되지만, 매개변수가 있는 생성자가 있는 경우 
		//자동으로 Parent의 기본 생성자를 호출 할 수 없기 때문에 error 발생
		//즉, Parent에 아무런 생성자가 없으면 기본 생성자가 호출 되어 error 없음
		//하지만 매개변수가 있는 생성자가 있으면 error 발생
		
		//3.Parent에 기본 생성자는 없고, 매개변수를 가진 생성자만 있는 경우
		//자식 생셩자에서 super(12)로 Parent 생성자를 명시적으로 호출
		
		
		
	}
	

}
