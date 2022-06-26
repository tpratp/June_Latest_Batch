package pkg1;

public class Student {
	
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("Welcome to all of you"); 
	
	}

	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args)
	{
		Student st=new Student();
		st.display1();
		st.display2();
		st.age=18;
		st.rollno=24;
		System.out.println("Student age is : " +st.age);
		System.out.println("Student Rollno. is : " +st.rollno);
		
	}
}
