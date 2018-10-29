package part1;

public class Z11 {

	static int i =test();
	
	public static int test() {
		System.out.println("test "+i);
		i=99;
		main(null);
		return 10;
	}
	
	public static void main(String[] args) {
		
		System.out.println("z11.main "+i);
		i=33;
		System.out.println("z11.main end "+ i);
	}
		
}
