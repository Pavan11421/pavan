package part3;

public class C1 {

	void test() {
		System.out.println("test:"+this);
	}
	
	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
		System.out.println("c1: "+c1);
		C c2 = new C();
		c2.test();
		System.out.println("c2"+ c2);
	}
}
