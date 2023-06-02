package techproed.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicityWaitday02 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /*
        İmplicityWait(Duration.ofSeconds(20) sayfadaki web eleentleri görünür olana kadar maximum 20 saniye bekler e
        eğer 2 saniyede oluşursa 2 saniye bekler.Eğer belirttiğiniz süre boyunca interbet kaynaklı web elementleri
        oluşmazsa test fail verir
        Thread.sleep() java kodlarını bizim belirttiğimiz sürekadar bekler 30 saniye beklemesini belirtirsem 30 sn bekler

         */
        //techpro sayfasına gidelim
        driver.get("https://techproeducation.com");
        //amazona gidelm
        driver.get("https://amazon.com");
        //techpro sayfasına geri dönelim
        driver.navigate().back();
        //sayfa başlığının teckpro içerdiğini kontrol edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failde");
        }
        //tekrar amazona gidelim
        driver.navigate().forward();
        //sayfa başlığının amazon içerdiini ko trol edelim
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test Passed");;
        }else {
            System.out.println("Test Failed");
        }






    }


}
