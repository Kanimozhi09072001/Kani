package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L4 {

	public static void main(String[] args) {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
								
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.google.com/");
				
		// Tagname: collection purpose
		// images: img
		// links: a
		// elements: div, input, select, li
				
		List<WebElement> l = ob.findElementsByTagName("img");
		System.out.println("Number of images "+ l.size());
				
		List<WebElement> l1 = ob.findElementsByTagName("a");
		System.out.println("Number of links "+ l1.size());
				
		List<WebElement> l2 = ob.findElementsByTagName("div");
		System.out.println("Number of elements with div tag "+ l2.size());
				
		ob.quit();

	}

}
