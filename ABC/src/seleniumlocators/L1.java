package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class L1 {

	public static void main(String[] args) {
		/* Locators: work with particular element
		* id
		* name
		* classname
		* linktext
		* partial linktext
		* tagname
		* xpath
		* css
		***/
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.mycontactform.com/");
		
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
		
		ob.findElementByName("pass").sendKeys("12345");
		
		ob.findElementByClassName("btn_log").click();
		

	}

}
