package my_ex;

public class ObjectTest {

	private Object obj;
	
	public void setObj(Object o) {
		obj = o;
	}
	
	public Object getObj() { 
		return obj;
	}
	
	public static void main(String[] args) {

		ObjectTest ot = new ObjectTest();
		ot.setObj(1000);
		System.out.println(ot.getObj()); //1000
		System.out.println(((Integer)ot.getObj()).intValue()); //1000
		
		ot.setObj(3.14);
		System.out.println(ot.getObj()); //3.14
		System.out.println(((Double)ot.getObj()).doubleValue()); //3.14
		
		ot.setObj("abcd");
		System.out.println(ot.getObj()); //abcd
		System.out.println((ot.getObj()).toString()); //abcd
	}
}
