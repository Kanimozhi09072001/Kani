package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		
		Set<Cookie> s = ob.manage().getCookies();
		System.out.println("Number of cookies "+ s.size());
		
		ob.quit();
	}

}
