package Z.Y.SeleniumDropDownRadioCheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='male']")).click();
		
		//Another ways
		WebElement radio = driver.findElement(By.xpath("//input[@id='male']"));
		if(!radio.isSelected())
			radio.click();

	}

}
