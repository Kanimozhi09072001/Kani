package Methods;

public class m7 {

	public static void main(String[] args) {
		m7 ob = new m7();
		ob.area(10,15);
		System.out.println(m7.age());
	}
//static method: return ur age
public static int age() {
	return 25;
}

//nonstatic method: find out area of rectangle (parameters, void)
public void area(int l, int b) {
	int result = l*b;
	System.out.println("Area is: "+result);
}

}
