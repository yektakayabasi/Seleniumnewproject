import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodday01 {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());//sayfanıj başlığını aldık.



        driver.get("https://techproeducation.com");
        System.out.println(driver.getTitle());
        //getcurrenturl
        System.out.println(driver.getCurrentUrl()); //Incınde olunan sayanın Url Strıng olarak getirir

        //getPageSource açılan sayfanın kaynak kodlarını verir
        //System.out.println(driver.getPageSource());

        //Get window Handle  önceki sekmeye gidebilmek için window handle kullanırız.
        System.out.println(driver.getWindowHandle());//5CFB1F6DC2AF24DFE8822B9E3FEB54AE





    }
}
