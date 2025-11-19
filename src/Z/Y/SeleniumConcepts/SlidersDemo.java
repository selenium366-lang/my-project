package Z.Y.SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidersDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement left = driver.findElement(By.xpath("(//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[1]"));
		System.out.println("left location : " + left.getLocation());//(59, 250)
		act.dragAndDropBy(left, 100, 250).perform();
		System.out.println("new left location : " + left.getLocation());
		
		
		WebElement right = driver.findElement(By.xpath("//span[2]"));
		System.out.println("right location : " + right.getLocation());//(612, 250)
		act.dragAndDropBy(right, -250, 250).perform();
		System.out.println("new rightlocation : " + right.getLocation());
	}

}
