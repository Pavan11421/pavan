package part2;


public class W {

	double j;
	public static void main(String[] args) {
		 W w1 = new W();
		 System.out.println(w1.j);
		 W w2 = w1;
		 w2.j=5.0;
		 System.out.println(w1.j);
		 System.out.println(w2.j);
		 W w3 = w2;
		 w3.j=6.0;
		 System.out.println(w1.j);
		 System.out.println(w2.j);
		 System.out.println(w3.j);
	}
}
