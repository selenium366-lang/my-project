package Z.Y.SeleniumDropDownRadioCheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Single check box
		WebElement singlebox = driver.findElement(By.xpath("//input[@id='sunday']"));
		if(!singlebox.isSelected())
			singlebox.click();
		
		//Single check box
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		
		//All check boxes
  		List<WebElement> allCheckbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		for(WebElement checkboxes : allCheckbox)
			checkboxes.click();

		//select last 3 check boxes 
  	    //total no. of checkbox - how many checkbox want to select = start index
  	    //7-3=4
    	for(int i=4; i<allCheckbox.size();i++)
  		allCheckbox.get(i).click();

	}

}
