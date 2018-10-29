package part4;

public class D {

	int i =test1();
	int j = test1();
	int test1() {
		System.out.println("from test");
	    System.out.println(i);
	    System.out.println(j);
	    return 10;
	}
	
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println("main begin ");
		System.out.println(d1.i);
		System.out.println(d1.j);
		System.out.println("main end");
	}
}
