package part4;

public class G {

	int i =test();
	G(){
		System.out.println("G():"+i);
		i = 20;
	}
	int test() {
		System.out.println("from test:"+i);
		return 30;
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		G g1 = new G();
		System.out.println(g1.i);
		System.out.println("main end");
	}
}
