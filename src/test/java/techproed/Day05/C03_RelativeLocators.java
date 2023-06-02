package techproed.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazona gidelim
        driver.get("https://www.amazon.com");
        //city bike aratalım
        WebElement searchBar = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        searchBar.sendKeys("city bike", Keys.ENTER);

        //relative locator ile hybrid altındaki elemente tıklayalım
        WebElement hybrid =driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement electric =driver.findElement(with(By.tagName("a")).below(hybrid));
        electric.click();
        //aynı şekilde yaparak tüm hepsine altı altına diyerek yapabikiirz.
    }
}
