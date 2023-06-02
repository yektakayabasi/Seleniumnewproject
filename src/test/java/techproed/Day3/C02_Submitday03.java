package techproed.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submitday03 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon saffasına gidelim
        driver.get("https://amazon.com");
        //Arama kutusunu locate edip iphone aratalım
       WebElement serachBar= driver.findElement(By.name("field-keywords"));
       serachBar.sendKeys("iphone");
       Thread.sleep(3000);
       serachBar.submit();

       //kapatalım
        driver.close();




    }
}
