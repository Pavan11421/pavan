package part3;

public class R {

	int i;
	static void test(R r1) {
		R r2 = new R();
		r2.i=r1.i;
		System.out.println(r1.i);
		System.out.println(r2.i);
	}
	public static void main(String[] args) {
		R obj = new R();
		obj.i=70;
		test(obj);
	}
}
