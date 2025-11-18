package Z.Y.SeleniumConcepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.hackerearth.com/windows");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		 Set<String> allWindows = driver.getWindowHandles();
		 
		 List<String>  windowList = new ArrayList<>(allWindows);
	        System.out.println(windowList);
	        driver.switchTo().window(windowList.get(1));
	        System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
	        
	        driver.quit();

	}

}
