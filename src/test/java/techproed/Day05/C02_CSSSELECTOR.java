package techproed.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CSSSELECTOR {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
/*

        Xpath ve cssSelector arasındaki farklar:

        - Xpath text ile calısır.
        - cssSelector text ile calısmaz
        - Xpath index'e göre arama yapabilir.Daha fazla kombinasyona sahiptir.
        - cssSelector index'e göre arama yapamaz. Daha hızlı calısır

         */




       // https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
         //Add Element butonuna basin
        WebElement button = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        button.click();
         //Delete butonu’nun gorunur oldugunu test edin
WebElement delete = driver.findElement(By.cssSelector("button[onclick = 'deleteElement()']"));
        System.out.println(delete.isDisplayed());
        // Delete tusuna basin
        delete.click();
        Thread.sleep(2000);
         //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
WebElement adddelete = driver.findElement(By.cssSelector("h3"));
        System.out.println(adddelete.isDisplayed());
Thread.sleep(10000);
//sayfayı kapatın
        driver.close();


//// http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
//// Add Element butonuna 100 defa basınız
//// 100 defa basıldığını test ediniz
//// 90 defa delete butonuna basınız
//// 90 defa basıldığını doğrulayınız
//// Sayfayı kapatınız



    }
}
