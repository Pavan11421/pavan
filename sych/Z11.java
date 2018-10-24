package sych;

 class Z20 {

	 static int i;
	 static {
		 int i =10;
		 System.out.println("z20.sib"+i);
		 System.out.println("z20.sib:"+Z20.i);
		 i =20;
		 Z20.i=200;
	 }
}

 class Z21{
	static {
		System.out.println("z21.sib");
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		System.out.println(Z20.i);
		Z20.i=300;
		System.out.println(".................");
		System.out.println(Z20.i);
		Z20.i+=300;
		System.out.println(".................");
		System.out.println(Z20.i);
		System.out.println("main end");
	}
}
