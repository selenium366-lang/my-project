package Z.Y.SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.hackerearth.com/nested_frames");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame("frame-top");  // outerframe
        driver.switchTo().frame("frame-middle");  // innerframe

        System.out.println(driver.findElement(By.xpath("//body")).getText());

	}

}
