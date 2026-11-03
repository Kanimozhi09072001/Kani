package Methods;

public class m1 {

	public static void main(String[] args) {
		m1.area();
		m1.rect();

	}
public static void area()
{
	int side=4;
	System.out.println("Area of square is "+ side*side);
}
private static void rect()
{
	double l=3.4;
	double b=1.2;
	System.out.println("Area of rectangle is "+ l*b);
	}
}

//accessmodifier static returntype name(){}
// classname.methodname();
