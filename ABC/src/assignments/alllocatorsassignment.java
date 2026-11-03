package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class alllocatorsassignment {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
														
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://demo.automationtesting.in/Register.html");
		
		ob.findElementByXPath("//*[@placeholder = 'First Name']").sendKeys("Kanimozhi");
		Thread.sleep(1000);
		
		ob.findElementByXPath("//input[@placeholder = 'Last Name']").sendKeys("Arunkumar");
		Thread.sleep(1000);
		
		ob.findElementByCssSelector("textarea[ng-model = 'Adress']").sendKeys("VKR Nagar");
		Thread.sleep(1000);
		
		ob.findElementByCssSelector("input[ng-model ^= 'Email']").sendKeys("kaniarun@gmail.com");
		Thread.sleep(1000);
		
		ob.findElementByXPath("/html/body/section/div/div/div[2]/form/div[4]/div/input").sendKeys("6383856097");
		Thread.sleep(1000);
		
		ob.findElementByCssSelector("#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(2) > input").click();
		Thread.sleep(1000);
		
		ob.findElementById("checkbox1").click();
		ob.findElementById("checkbox2").click();
		Thread.sleep(1000);
		
	}

}
