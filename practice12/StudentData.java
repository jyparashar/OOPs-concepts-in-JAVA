package practice12;

public class StudentData {
	int rno; //4
	String name; //10
	static String college = "HCST"; //20
	
	StudentData(int r, String n)
	{
		rno = r;
		name = n;
	}
	
	static void show()
    {
		college ="AEC";
    }
	
	void display()
    {
   	 System.out.println(college);
    }
	
	public static void main(String[] args) {
		StudentData s1 = new StudentData(10, "ABCD");
		//StudentData.show();
		s1.display();
		StudentData.show();
		s1.display();
		StudentData s2 = new StudentData(10, "ABCD");
		s2.display();
	}

}
