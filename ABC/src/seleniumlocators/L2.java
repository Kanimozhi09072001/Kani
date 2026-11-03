package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class L2 {

	public static void main(String[] args) {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
						
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.facebook.com/");
		
		ob.findElementByName("email").sendKeys("hi");
		ob.findElementByName("pass").sendKeys("hello");
		
}

}
