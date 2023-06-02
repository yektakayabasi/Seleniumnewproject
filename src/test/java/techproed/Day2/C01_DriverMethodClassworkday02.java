package techproed.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodClassworkday02 {
    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");

WebDriver driver= new ChromeDriver();

         //amazon sayfasına gidelim
        driver.get("https://www.amazon.com");
        //sayfa başlığının Amazon içerdiğini kontrol edelim
        String actualTitle = driver.getTitle();
        String expectedTitle ="amazon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        //url in https://amazon.com olduğunu kontrol et
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.mazon.com";
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed" + actualUrl);
        }

        //sayfayı kapatalım
        driver.close();//browserı kapatır
        //driver.quit();//birden fazla browsıtı kapatır.








    }
}
