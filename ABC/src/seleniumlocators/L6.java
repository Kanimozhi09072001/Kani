package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class L6 {

	public static void main(String[] args) {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
								
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.mycontactform.com/");
		
		// XPath: XML Path Language
		// relative xpath
		// absolute xpath
		
		// absolute xpath: start finding the element from the root
		// shortcut: Copy -> Copy full Xpath
		
		ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hi");
		
		// relative Xpath:
		
		// Syntax: //*[@attribute='value']  or  //tagname[@attribute='value']
		
		ob.findElementByXPath("//[@id='user']").sendKeys("hi");
		
		ob.findElementByXPath("//input[@type='password']").sendKeys("hello");
		
		// shortcut: Copy -> Copy Xpath
		
		ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
		

	}

}
