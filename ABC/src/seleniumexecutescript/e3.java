package seleniumexecutescript;

import org.openqa.selenium.chrome.ChromeDriver;

public class e3 {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
		// page down, up
		/* ob.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		Thread.sleep(3000); */
		
		ob.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0, -300)");
		Thread.sleep(3000);
		
		ob.quit();

	}

}
