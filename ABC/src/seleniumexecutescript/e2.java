package seleniumexecutescript;

import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		
		// Zoom in: greater than 100
		// normal: 100
		// Zoom out: less than
		
		ob.executeScript("document.body.style.zoom = '150%'");
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom = '100%'");
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom = '50%'");
		Thread.sleep(3000);
		
		ob.quit();

	}

}
