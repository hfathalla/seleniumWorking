package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalWindoClickProblem {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "/Users/mohannaelhetawy/Desktop/Chromedriver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/entry_ad" );
        Thread.sleep( 2000 );
        WebElement click = driver.findElement( By.id( "restart-ad" ) );
        click.click();

        try {
            click.click();
        } catch(ElementClickInterceptedException e){
            WebElement element = driver.findElement( By.cssSelector( ".modal-footer" ) ) ;
            element.click();
        }

        Thread.sleep( 2000 );
        click.click();
        click = driver.findElement( By.id( "restart-ad" ) );
        click.click();

//        driver.quit();

    }
}
