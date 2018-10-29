package part3;

public class J {

	// inside static method we can't use this keyword
	static void test() {
		System.out.println(this);
	}
}
