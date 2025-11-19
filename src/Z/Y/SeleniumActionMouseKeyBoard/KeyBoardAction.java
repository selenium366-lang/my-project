package Z.Y.SeleniumActionMouseKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.txt-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@placeholder='Paste your original text here...']")).sendKeys("ABC");
		
		Actions act = new Actions(driver);
		
		//ctrl + A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//ctrl + C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//ctl + V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
	}

}
