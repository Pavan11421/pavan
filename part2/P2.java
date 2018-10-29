package part2;

public class P2 {

	int i;
	static int j = test1();
	static int test1() {
		P2 obj = new P2();
		System.out.println(obj.i);
		return 10;
	}
	
	public static void main(String[] args) {
		System.out.println("done");
	}
}
