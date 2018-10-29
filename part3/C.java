package part3;

public class C {

	public static void main(String[] args) {
		C c1 = new C();
		System.out.println("main "+c1);
		c1.test();
	}
	void test() {
		System.out.println("test "+this);
		// "this keyword" is the current class instance variable
	}
	
}
