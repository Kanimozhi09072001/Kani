package Methods;

public class m3 {

	public static void main(String[] args) {
		//parameter: variable passed to a function definition
		//argument: value assigned to the parameter while calling it
		// number of parameter = number of argument
		
		m3.details("divya", 32);
		m3.details("kanimozhi", 25);
		m3.details("Janani", 25);

	}
public static void details(String name, int age) //parameters
{
	System.out.println("Name is "+ name);
	System.out.println("Age is "+ age);
}

}
