package part4;

public class M {

	static int count;
	M(){
		count++;
	}
	public static void main(String[] args) {
		M m1 = new M();
		M m2 = new M();
		M m3 = new M();
		M m4 = new M();
		System.out.println(m1.count);
		System.out.println(m2.count);
		System.out.println(m3.count);
		System.out.println(m4.count);
	}
}
