package Z.X.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag-id				tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("m33");
	
		//tag-class				tag.class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("M21");
		
		//tag-attribute			tag[attribute="value"]
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("s24");
		
		//tag-class-attribute	tag.classname[attribute="value"]
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("s25");
		

		driver.close();
	}

}
