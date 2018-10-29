package part2;

public class Student2 {

	String name;
	int rollnumber;
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		s1.name="pavan";
		s1.rollnumber=21;
		Student2 s2 = new Student2();
		s2.name="sai";
		s2.rollnumber=25;
		Student2 s3 = new Student2();
		s3.name="prasad";
		s3.rollnumber=28;
		Student2 s4 = new Student2();
		s4.name="lakshmi";
		s4.rollnumber=66;
		
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
