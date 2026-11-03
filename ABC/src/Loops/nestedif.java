package Loops;

public class nestedif {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 5;
		if(a>b && a>c) {
			System.out.println("a is smaller");
		}
		else if(b>a && b>c) {
			System.out.println("b is smaller");
		}
		else {
			System.out.println("c is smaller");
		}
			

	}

}
