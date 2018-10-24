package sych;

public class A {
	
	static int i = test1();
	static int j = test2();
	static {
		System.out.println("sid"+i+","+j);
		i+=1;
		j+=i;
		main(null);
		System.out.println("sid again"+i+","+j);
		i+=2;
		j+=i;
	}
	
	public static int test1() {
		System.out.println("test"+i+","+j);
		i+=3;
		j+=i;
		main(null);
		System.out.println("test again"+i+","+j);
		i+=4;
		j+=i;
		return i+j+5;
	}
	
	public static int test2() {
		System.out.println("test"+i+","+j);
		i+=6;
		j+=i;
		main(null);
		System.out.println("test again"+i+","+j);
		i+=7;
		j+=i;
		return i+j+8;
	}
	
	
	public static void main(String[] args) {
		System.out.println("main"+i);
		i+=9;
		j+=i;
		System.out.println(i);
		System.out.println(j);
	}
		
}
	
	

