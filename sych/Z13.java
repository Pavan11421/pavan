package sych;

 class Z24 {
	 
	 static int i;
	 
	 static {
		 System.out.println("z24.sib");
	 }
	 
	 static void test() {
		 System.out.println("z24.test()");
	 }
}
 
 class Z25{
	 static {
		 System.out.println("z25.sib");
		 
	 }
	 public static void main(String[] args) {
		System.out.println("z25.main");
		Z24.test();
		System.out.println(".............");
		System.out.println(Z24.i);
		System.out.println("............");
		Z24.test();
		System.out.println(Z24.i);
		System.out.println("............");
		Z24.test();
		System.out.println("Z25.main end");
	}
 }
