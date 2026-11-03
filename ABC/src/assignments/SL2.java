package assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SL2 {

	public static void main(String[] args) {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
								
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.facebook.com/");
		
		List<WebElement> L = ob.findElementsByTagName("img");
		System.out.println("No. of images "+ L.size());
		
		List<WebElement> L1 = ob.findElementsByTagName("img");
		System.out.println("No. of links "+ L1.size());
		
		ob.quit();
		
	}

}
