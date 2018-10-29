package part2;

public class I {

	void test1() {
		System.out.println("from test1");
	}
	
	public static void main(String[] args) {
		System.out.println("main begin");
		I i1=new I();
		i1.test1();
		System.out.println("main end");
	}
}
