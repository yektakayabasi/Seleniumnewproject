package techproed.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethodsday02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        //techpro edcucation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com"); //get() methodu ile aynı mantıkta çalışır
        Thread.sleep(3000);

        //Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);
        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon sayfası title "+ driver.getTitle());
        Thread.sleep(3000);
        //Techpro sayfasına geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);
        //sayfa başlığını yazdıralım
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        //Amazon sayfasına ger, g,d,p url yazdıralım
        driver.navigate().forward();
        System.out.println("Amazon sayfası url: " + driver.getCurrentUrl());
        //Amazon sayfasındayken sayfayı yenileyeşlim
        driver.navigate().refresh();
        Thread.sleep(3000);

       //sayfaları kapat
        driver.close();





    }

}
