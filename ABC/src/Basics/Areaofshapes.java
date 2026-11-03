package Basics;

public class Areaofshapes {

	public static void main(String[] args) {
		// area of square: side*side
		// perimeter of square: 4*side
		// average: (n1+n2+n3)/3
		// area of circle: 3.14*r*r
		
		int side = 4;
		System.out.println("Area of square is "+ side*side);
		System.out.println("Perimeter of square is "+ 4*side);
		
		int n1 = 4;
		int n2 = 40;
		int n3 = 50;
		System.out.println("Average of three numbers  "+ (n1+n2+n3)/4);
		
		double r = 3.2;
		System.out.println("Area of circle is "+ 3.14*r*r);
				
	}

}
