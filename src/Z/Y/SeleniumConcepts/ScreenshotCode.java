package Z.Y.SeleniumConcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.xpath("//div[@id='HTML14']"));

        // Take element screenshot (Selenium 4 feature)
        File src = logo.getScreenshotAs(OutputType.FILE);

        // Save file
        FileUtils.copyFile(src, new File("element.png"));
        
        //full
        File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src1, new File("viewport.png"));


	}

}
