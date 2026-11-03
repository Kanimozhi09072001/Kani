package seleniumexecutescript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e4 {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
						
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
		// alert: pop-up/ message box
		// ob.executeScript("alert('time out')");
		ob.executeScript("window.confirm('time out')");
		
		Thread.sleep(3000);
		
		//switch our control to alert
		Alert a1 = ob.switchTo().alert();
		a1.accept();
		
	}

}
