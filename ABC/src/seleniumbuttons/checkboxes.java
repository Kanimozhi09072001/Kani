package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
												
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
				
		ob.findElementById("bmwcheck").click();
		Thread.sleep(3000);
				
		ob.findElementById("benzcheck").click();
		Thread.sleep(3000);
				
		ob.findElementById("hondacheck").click();
		Thread.sleep(3000);
		
		ob.quit();

	}

}
