package Methods;

public class m2 {

	public static void main(String[] args) {
		System.out.println("Addition of two numbers is "+ m2.add());
		System.out.println("Subtraction of two numbers is " +m2.sub());
		System.out.println("Division of two numbers is " +m2.div());
		System.out.println(m2.fruits());
		System.out.println(m2.letter());
		System.out.println(m2.result());
	}
public static int add()
{
	//local variables: only within the method
	int a = 30;
	int b = 35;
	return a+b;
}
public static double sub()
{
	double a = 3.9;
	double b = 2.5;
	return a-b;
}
public static float div()
{
	float a = 4.8f;
	float b = 1.6f;
	return a/b;
}
public static String fruits()
{
	String n = "Apple";
	return n;
}
public static char letter()
{
	char l2 ='a';
	return l2;
}
public static boolean result()
{
	// boolean n=true;
	//return n;
	return true;
}
}
