package techproed.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebelementLocator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
// https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");
// arama kutusuna "city bike" yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);
// sonuc yazısını yazdırın
        List<WebElement> sonucYazisi = driver.findElements(By.className("sg-col-inner"));//irden fazla çıktığı için list içine alıyoruz.
        System.out.println(sonucYazisi.get(0).getText());//1-16 of 185 results for "city bike"

        // sonuc sayısını yazdırın
String [] sonucSayisi = sonucYazisi.get(0).getText().split(" ");
        System.out.println("sonucSayisi = " + sonucSayisi[2]);
        WebElement firstElement = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[12]"));
        System.out.println(firstElement.getText());
        // ilk ürünün locatini alın
        List<WebElement>products = driver.findElements(By.className("s-image"));
        WebElement ilkUrun = products.get(0);
// ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isDisplayed());//true
// ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isEnabled());//true
// ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isSelected());//false
// ilk urune tıklayın
        ilkUrun.click();
// sayfayı kapatın

        //Relative Xpath --> Xpath syntax //tagname[@attributeName ='attributeValue']
                                           //input[@type ='text']
                                          // (//input[@type='text'])[1]
                                          //*[@type='text']
         /*
        Aldığımız xpath unique olmadığı zaman parantez kullanarak index belirtebiliriz.
        Böylelikle webelementleri liste atıp istediğimiz elementi almakla uğraşmayız.

         */








    }



}
