package practice12;

public class Rectangle {
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
		return (length * width);
	}
	
	void show()
	{
		System.out.println("Length: "+length + " Width: "+width);
	}
	
	int sameArea(Rectangle r)
	{
		if (this.area() == r.area())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setlength(10);
		r1.setwidth(5);
		r1.show();
		
		Rectangle r2 = new Rectangle();
		r2.setlength(5);
		r2.setwidth(10);
		r2.show();
		
		int result = r1.sameArea(r2);
		if(result == 1)
		{
			System.out.println("Area is same for both rectangle");
		}
		else
		{
			System.out.println("Area is not same for both rectangle");
		}
	}
}
