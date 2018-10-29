package part1;

public class Z8 {

	static int i=test();
	static {
		System.out.println("z8.sib");
	}
	
	public static void main(String[] args) {
		System.out.println("main "+i);
	}
	
	static int test() {
		System.out.println("z8.test()");
	return 69;
	}
}
