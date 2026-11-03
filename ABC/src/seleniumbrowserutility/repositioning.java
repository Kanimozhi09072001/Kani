package seleniumbrowserutility;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class repositioning {

	public static void main(String[] args) {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		
		//create an object for point
		// pass desired x and  y value in it
		// apply it on the window
		
		Point pt = new Point(200,300);
		ob.manage().window().setPosition(pt);
	}

}
