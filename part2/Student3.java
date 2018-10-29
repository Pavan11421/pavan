package part2;

public class Student3 {

	String name;
	int rollnumber;
	
	Student3(String name,int rollnumber){
		this.name=name;
		this.rollnumber=rollnumber;
	}
	
	public static void main(String[] args) {
		
		Student3 s1 = new Student3("pavan",21);
		Student3 s2 = new Student3("sai",31);
		Student3 s3 = new Student3("prasad",41);
		Student3 s4 = new Student3("lakshmi",51);

		System.out.println("Name:"+s1.name);
		System.out.println("RollNumber:"+s1.rollnumber);
		System.out.println("-------------------");
		System.out.println("Name:"+s2.name);
		System.out.println("RollNumber:"+s2.rollnumber);
		System.out.println("-------------------");
		System.out.println("Name:"+s3.name);
		System.out.println("RollNumber:"+s3.rollnumber);
		System.out.println("-------------------");
		System.out.println("Name:"+s4.name);
		System.out.println("RollNumber:"+s4.rollnumber);
	}
}
