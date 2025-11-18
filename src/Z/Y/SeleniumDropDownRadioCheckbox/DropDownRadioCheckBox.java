package Z.Y.SeleniumDropDownRadioCheckbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownRadioCheckBox {
	static WebDriver driver;


    public static void selectOption(WebElement Dropdown, String optionName){
        Dropdown.click();
        List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='country']/child::option"));
        for(WebElement option : allOptions){
            if(option.getText().trim().equalsIgnoreCase(optionName)){
                option.click();
                break;
            }


        }
    }

    public static void selectionRadioButton( String label){
    WebElement ele = driver.findElement(By.xpath("//label[text()='"+label+"']/preceding-sibling::input"));
    if(!ele.isSelected())
        ele.click();
    }

    public static void selectCheckBox( String label){
        WebElement ele = driver.findElement(By.xpath("//label[@class='form-check-label' and text()='"+label+"']/preceding-sibling::input"));
        if(!ele.isSelected())
            ele.click();
    }



    //label[text()='Male']/preceding-sibling::input


    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='country']")));

        dropdown.selectByVisibleText("Canada");
        dropdown.selectByValue("uk");
        dropdown.selectByIndex(4);

        String expectedOption = "India";
        boolean isFound=false;
        for(WebElement option : dropdown.getOptions() ){
            if(option.getText().trim().equals("India")) {
                isFound = true;
                break;
            }
        }
        if(isFound)
            System.out.println(expectedOption +"option is there in dropdown");
        else
            System.out.println(expectedOption +"option is not there in dropdown");


        // dropdowns without select tag
        WebElement dropDownelement = driver.findElement(By.xpath("//select[@id='country']"));

        selectOption(dropDownelement,"India");

        //Radio button
        selectionRadioButton("Male");

        //Check box
        selectCheckBox("Tuesday");
        selectCheckBox("Tuesday");

}
}
