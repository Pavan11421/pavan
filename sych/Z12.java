package sych;

 class Z22 {

	static
	{
		System.out.println("z22.sib");
	}
	static void test() {
		System.out.println("z22.test()");
	}
}

class Z23{
	static {
		System.out.println("Z23.sib");
	}
	
	public static void main(String[] args) {
		
		System.out.println("z23.main begin");
		Z22.test();
		System.out.println("...........");
		Z22.test();
		System.out.println("...........");
		Z22.test();
		System.out.println("main end");
	}
	
}
