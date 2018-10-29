package part2;

public class P1 {

	int i;
	static int j = test1();
	static void test1() {
		P1 obj = new P1();
		System.out.println(obj.i);
	}
	
	public static void main(String[] args) {
		System.out.println("done");
	}
}
