package part4;

public class R {

	R(int i)
	{
		System.out.println("R(int i)");
	}
	R(int j)
	{
		System.out.println("R(int j)");
	}
	public static void main(String[] args) 
	{
		R r1 = new R(9);
		System.out.println("done");
	}

}
