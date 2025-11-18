package Z.X.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver .get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//self
		String self = driver.findElement(By.xpath("//a[contains(text(), 'DCB Bank')]/self::a")).getText();
		System.out.println("self "+self);
		
		//parent
		String parent = driver.findElement(By.xpath("//a[contains(text(), 'DCB Bank')]/parent::td")).getText();
		System.out.println("parent "+parent);
		
		//ancestor
		String ancestor = driver.findElement(By.xpath("//a[contains(text(), 'DCB Bank')]/ancestor::tr")).getText();
		System.out.println("ancestor "+ancestor);
		
		//child
		List<WebElement> child = driver.findElements(By.xpath("//a[contains(text(), 'DCB Bank')]/ancestor::tr/child::td"));
		System.out.println("No. of child "+child.size());
		
		//descendant
		List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(), 'DCB Bank')]/ancestor::tr/descendant::*"));
		System.out.println("No. of descendant "+descendant.size());
		
		
		//following
		List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(), 'DCB Bank')]/ancestor::tr/following::tr"));
		System.out.println("No. of following "+following.size());
		
		//following-sibling
		List<WebElement> followingsb = driver.findElements(By.xpath("//a[contains(text(), 'DCB Bank')]/ancestor::tr/following-sibling::tr"));
		System.out.println("No. of following-sibling "+followingsb.size());
		
		//preceding
		List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(), 'DCB Bank')]/ancestor::tr/preceding::tr"));
		System.out.println("No. of preceding "+following.size());
		
		//preceding
		List<WebElement> precedingsb = driver.findElements(By.xpath("//a[contains(text(), 'DCB Bank')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("No. of preceding-sibling "+followingsb.size());
		
		driver.close();
		
		

	}

}
