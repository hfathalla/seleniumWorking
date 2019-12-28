package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRole {
    public static void main(String[] args) {

        System.setProperty( "webdriver.chrome.driver", "/Users/mohannaelhetawy/Desktop/Chromedriver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://ultimateqa.com/automation/fake-pricing-page" );

//        WebDriverWait wait = new WebDriverWait( driver, 15 );
//        WebElement h4 = wait.until( ExpectedConditions.visibilityOfElementLocated( By.cssSelector( ".et_pb_blurb_0 h4" ) ) );
        WebElement h4 = driver.findElement( By.cssSelector( ".et_pb_blurb_0 h4" ) );

        // Scroll to h4 element
        ((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView(true);", h4 );
        String testH4 = "Help Finding Information Online?";

        System.out.println( "Tag name:" + h4.getTagName() );
        System.out.println( "Displayed:" + h4.isDisplayed() );
        System.out.println( "Text is:" +  h4.getText() );

        System.out.println(h4.getText().equals( testH4 ) ? "Success": "Failure");

        driver.quit();

    }
}
