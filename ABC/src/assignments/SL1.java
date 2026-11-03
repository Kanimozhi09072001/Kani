package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class SL1 {

	public static void main(String[] args) {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.mycontactform.com/");
		
		ob.findElementByLinkText("Help").click();

	}

}
