import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClassday01 {
    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
//Java uygulamalarında system özelliklerini ayarlamak için set Property methodu kullanırız.
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        //getProperty key değerini girerek value ulaşabiliriz
        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com");


    }
}
