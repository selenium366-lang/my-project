package Z.Y.SeleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

        //Get specific column all values
        List<WebElement> subj = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[3]"));
        for(WebElement ele : subj)
        System.out.println(ele.getText());

        WebElement table = driver.findElement(By.xpath("//table[@id='taskTable']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

//        for(WebElement row : rows){
//                List<WebElement> allColumns = row.findElements(By.tagName("td"));
//                for(WebElement cell:allColumns){
//                    System.out.print(cell.getText()+ "\t");
//                }
//                System.out.println();
//        }

        for(WebElement row : rows){
            System.out.println(row.getText());
        }

	}

}
