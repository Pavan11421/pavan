package part2;

public class L {

	int i;
	void test1() {
		System.out.println("from test");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main begin");
		L l1= new L();
		System.out.println(l1.i);
		System.out.println("..........");
		l1.test1();
		System.out.println(".............");
		System.out.println("main end");
	}
}
