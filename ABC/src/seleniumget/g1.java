package seleniumget;

import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {

	public static void main(String[] args) {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		
		// title
		System.out.println(ob.getTitle());
		
		// url
		System.out.println(ob.getCurrentUrl());
		
		// size: height and width of the window: Dimension
		System.out.println(ob.manage().window().getSize());
		
		// Position: x and y value of the window: Point
		System.out.println(ob.manage().window().getPosition());
		
		// browser
		System.out.println(ob.getCapabilities());
		
		ob.quit();

	}

}
