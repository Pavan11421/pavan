package part4;

public class F {

	int i;
	int j;
	F(){
		System.out.println("F():");
		System.out.println("I:"+i);
		System.out.println("J:"+j);
		i = 10;
		j =20;
	}
	
	public static void main(String[] args) {
		System.out.println(" main begin");
		F f1 = new F();
		System.out.println(f1.i);
		System.out.println(f1.j);
		System.out.println("main end");
	}
}
