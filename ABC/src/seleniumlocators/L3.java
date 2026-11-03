package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class L3 {

	public static void main(String[] args) {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
								
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.google.com/");
				
		// Linktext: word/ group of words : click on it ; new URL will be opened
		// ob.findElementByLinkText("About").click();
				
		// Partial Linktext: substring of linktext
		ob.findElementByPartialLinkText("Ab").click();				

	}

}
