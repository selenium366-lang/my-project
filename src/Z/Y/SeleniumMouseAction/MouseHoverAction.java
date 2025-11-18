package Z.Y.SeleniumMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//mouse hover
		WebElement ele = driver.findElement(By.xpath("(//span[normalize-space()='Account & Lists'])[1]"));
		WebElement innerele = driver.findElement(By.xpath("(//span[normalize-space()='Account'])[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).moveToElement(innerele).click().build().perform();
		
	}

}
