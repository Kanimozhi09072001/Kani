package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class L5 {

	public static void main(String[] args) {
		// Step 1: Configuring the chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
						
		// Step 2: create an object for chromedriver class
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.mycontactform.com/");
		
		// CSS: Cascade style sheet
		// there are 7 ways
		// shortcut
		
		//1. tagname and id   syntax: tagname#id
		// ob.findElementByCssSelector("input#user").sendKeys("hi");
		
		//2. tagname and classname  syntax: tagname.classname
		// ob.findElementByCssSelector("input.txt_log").sendKeys("hello");
		
		//3. tagname and attribute  syntax: tagname[attribute= 'value']
		// ob.findElementByCssSelector("input[type='text']").sendKeys("hi");
		
		//4. tagname, classname and attribute  syntax: tagname.classname[attribute ='value']
		// ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
		
		//5. tagname and prefix of attribute  syntax: tagname[attribute^= 'prefix value']
		// ob.findElementByCssSelector("input[type^='te']").sendKeys("hi");
		
		//6. tagname and suffix of attribute  syntax: tagname[attribute$= 'suffix value']
		// ob.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
		
		//7. tagname and substring of attribute  syntax: tagname[attribute*= 'substring value']
		// ob.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
		
		// Shortcut
		// Copy -> Copy selector
		ob.findElementByCssSelector("#user").sendKeys("hi");
		
		

	}

}
