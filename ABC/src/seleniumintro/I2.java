package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class I2 {
	// Step 1: adding selenium jar
	// project -> right click -> properties -> java Build path
	// libraries -> classpath -> add external jar -> browser -> selenium jar -> apply and close
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
	}

}
