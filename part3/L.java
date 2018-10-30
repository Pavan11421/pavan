package part3;

public class L {

	int i;
	void test() {
		i = 20;
	}
	
	public static void main(String[] args) {
		L obj = new L();
		System.out.println("a:"+ obj.i);
		obj.test();
		System.out.println("b:"+obj.i);
		L obj1 = new L();
		System.out.println("c:"+obj1.i);
		obj1.test();
		System.out.println("d:"+obj1.i);
	}
}
