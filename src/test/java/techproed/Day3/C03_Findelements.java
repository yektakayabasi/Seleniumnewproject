package techproed.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Findelements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //Sayfadaki linklerin sayısını ve linkleri yazdıralım


        /*
        findeelement ile bir webelemente ulaşabilirken
        birden fazla webelement için find elements kullanırım
        Bu webelemenlerin sayısına ulaşmak için ya da bu web elementlerin yazısını konsola
        yazdırabilmek için List<Webelement > Linkler Listesi = driver.findElements(By.Locator("Locator değerii")
oluşturmuş olduüumuz listi loop le yazdırabiliriz.
         */

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayısı "+linklerListesi.size());

        /*for (WebElement w : linklerListesi){
            if (!w.getText().isEmpty()){
            System.out.println(w.getText());
            }
        }*/



        //Lambda ile

       /* linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}}); */

        System.out.println(driver.findElement(By.linkText("Shop great deals now")).getText());


    }
}
