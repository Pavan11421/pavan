package part1;

public class Z17 {

	static {
		System.out.println("z17.sib");
	}
	public static void main(String[] args) {
		System.out.println(" z17.main begin");
		System.out.println(Z16.i);
		System.out.println("main end");
	}
	
}

class Z16{
	
	static int i;
	static {
		System.out.println("z16.sib");
	}
	public static void main(String[] args) {
		System.out.println("z16.main");
	}
}
