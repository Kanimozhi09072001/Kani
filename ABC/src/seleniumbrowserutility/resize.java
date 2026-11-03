package seleniumbrowserutility;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class resize {

	public static void main(String[] args) {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		
		// create an object for dimension class
		// pass desired height and width in it
		// apply it on the window
		
		Dimension d = new Dimension(300,500);
		ob.manage().window().setSize(d);

	}

}
