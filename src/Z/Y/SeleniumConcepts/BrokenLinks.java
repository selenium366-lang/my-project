package Z.Y.SeleniumConcepts;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		/*
		1. get attribute
		2. url object
		3. httpurl connection
		4. perform api call
		5. get response status code
		6. response status code > 400
		*/
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement link : allLinks) {
			String hrefLink = link.getAttribute("href");
			URL urlObj = new URL(hrefLink);
			HttpURLConnection httpCon = (HttpURLConnection)urlObj.openConnection();
			httpCon.connect();
			
			if(httpCon.getResponseCode()>=400)
				System.out.println("its a broken link: " + hrefLink + "status code is :"+ httpCon.getResponseCode());
		}
		driver.close();
	}

}
