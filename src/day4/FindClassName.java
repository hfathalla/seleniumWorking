package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindClassName {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mohannaelhetawy/Desktop/Chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement element = driver.findElement( By.className( "form-control" ) );
        WebElement sameElement = driver.findElement( By.cssSelector( ".form-control" ) );

        System.out.println(element.getAttribute( "outerHTML" ));
        System.out.println("---------------------------------------");
        System.out.println(sameElement.getAttribute( "outerHTML" ));

        driver.quit();


    }
}