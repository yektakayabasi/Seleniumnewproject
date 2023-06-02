package techproed.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {
                  System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
                  WebDriver driver = new ChromeDriver();
                  driver.manage().window().maximize();
                  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

                  //1 amazon siteine git
        driver.get("https://amazon.com");
        //2 arama kutusun  city bike yazıp aratın
        WebElement searchBar = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        searchBar.sendKeys("city bike",Keys.ENTER);

        //Hybrid bike bölümüne tıklayın
        driver.findElement(By.xpath("//*[text()='Hybrid Bikes']")).click();


        //Sonuç yazısını yazdıralım ve
        WebElement result = driver.findElement(By.xpath("(//*[@class ='sg-col-inner'])[1]"));
    String [] resultMy =result.getText().split(" ");
        System.out.println("resultMy = " + resultMy[0]);

        //ilk ürüne tıklayın
    driver.findElement(By.xpath("//h2[1]")).click();
    
    //sonra kapatın
        driver.close();
    }
}
