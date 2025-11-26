package Z.Y.SeleniumDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerDemo {
    public static void main(String[] args) {

        String year = "2026";
        String month = "April";
        String date = "7";

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        while(true) {

            String xpathmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String xpathyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (xpathmonth.equals(month) && xpathyear.equals(year)) {
                break;
            }
        }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

            List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
            for(WebElement dt : dates) {
                if(dt.getText().equals(date)) {
                    dt.click();
                    break;
                }
            }
    }
}
