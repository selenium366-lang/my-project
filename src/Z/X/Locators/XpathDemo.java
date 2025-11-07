package Z.X.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Tshirt");
		
		//multiple attribute
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More'][@name='q']")).sendKeys("Tshirt");
		
		//and operator
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More' and @name='q']")).sendKeys("Tshirt");
		
		//or operator
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More' or @name='q']")).sendKeys("Tshirt");
		
		//contains
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and ')]")).sendKeys("Tshirt");
		
		//starts with
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search for Products, Brands and ')]")).sendKeys("Tshirt");
		
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://demo.opencart.com/");
		driver1.manage().window().maximize();
		
		//inner text
		driver1.findElement(By.xpath("//a[text()='MacBook']")).click();
		
		//only text is there in dom
		boolean displayStatus = driver1.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displayStatus);
		
		//get text
		String text = driver1.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(text);
		
		//chained xpath realtive+absolute combination
		 boolean displayStatus1 = driver1.findElement(By.xpath("//div[@id='logo'/a/img")).isDisplayed();
		System.out.println(displayStatus1);
		
	}

}
