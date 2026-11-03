package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class I3 {
	public static void main(String[] args) throws InterruptedException{
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		
		ob.manage().window().maximize();
		ob.navigate().refresh();
		
		// hold the page for certain seconds
		Thread.sleep(3000); //3s
		
		ob.quit();
	}

}
