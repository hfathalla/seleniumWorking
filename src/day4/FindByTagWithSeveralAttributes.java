package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindByTagWithSeveralAttributes {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/mohannaelhetawy/Desktop/Chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        List<WebElement> elements = driver.findElements( By.tagName( "input" ) );
        List<WebElement> cssElements = driver.findElements( By.cssSelector( "input[type='text'][placeholder=\"E-Mail Address\"]" ) );
        for(WebElement e : elements) {
            System.out.println(e.getAttribute( "outerHTML" ));
        }
        System.out.println("---------------------------------------");
        for(WebElement e : cssElements) {
            System.out.println(e.getAttribute( "outerHTML" ));
        }

        // css selector can have several attributes
        driver.quit();

    }
}
