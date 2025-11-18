package Z.Y.SeleniumDropDownRadioCheckbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
		driver.findElement(By.xpath("//select[@id='country']")).click();
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='country']/child::option"));
        for(WebElement option : allOptions){
            if(option.getText().trim().equalsIgnoreCase("India")){
                option.click();
            }

        }

}}
