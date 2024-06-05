package practice12;

public class paperprogram {
	float length, width;
	void setlength(float length)
	{
		this.length = length;
	}
	
	void setwidth(float width)
	{
		this.width = width;
	}
	
	float perimeter()
	{
		return 2*(length+width);
	}
	
	float area()
	{
		return length*width;
	}
	
	void show()
	{
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
	}
	
	int sameArea(paperprogram r)
	{
		if(this.area() == r.area())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		paperprogram r1 = new paperprogram();
		r1.setlength(10);
		r1.setwidth(5);
		r1.show();
		
		paperprogram r2 = new paperprogram();
		r2.setlength(5);
		r2.setwidth(12);
		r2.show();
		
		int result = r1.sameArea(r2);
		if(result == 1)
		{
			System.out.println("Both Rectangle's Area is same");
		}
		else
		{
			System.out.println("Both Rectangle's Area is not same");
		}

	}

}
