package Z.X.Locators;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		
//		//implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		//id
		driver.findElement(By.name("q")).sendKeys("Mac");
		System.out.println("Hiiiiii");
		
		//name
		boolean isdisplay = driver.findElement(By.name("q")).isDisplayed();
		System.out.println(isdisplay);
		
		//linktext
		driver.findElement(By.linkText("Mobiles & Tablets")).click();
		
		//PartialLinktext
		driver.findElement(By.partialLinkText("Flight Bookin")).click();
		System.out.println("partial link text");
		
		//class name
		List<WebElement> listElement = driver.findElements(By.className("_1ch8e_"));
		System.out.println("Total no. of header link "+listElement.size() );
		
		//tagname
		List<WebElement> listLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links " + listLinks.size());
		
		List<WebElement> listimg = driver.findElements(By.tagName("img"));
		System.out.println("Total no. of img " + listimg.size());
		

		driver.close();
		
	}

}
