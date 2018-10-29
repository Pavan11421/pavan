package part1;

public class Z10 {

	static int i=test();
	static {
		System.out.println("z10.sib "+i);
		i=10;
	}
	static int test() {
		System.out.println("z10.test "+i);
		return 69;
	}
	
	public static void main(String[] args) {
		System.out.println("z10.main "+i);
		i=33;
		System.out.println(test());
		System.out.println("z10.main end "+i);
		System.out.println(Z10.i);
	}
}
