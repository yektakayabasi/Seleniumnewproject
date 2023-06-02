package techproed.Day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethodsday02 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        //Browsırın konumunu yazdıralım
        System.out.println(driver.manage().window().getPosition());
        //Browsırın boyutlarınını yazdıralım
        System.out.println(driver.manage().window().getSize());
        //Browsır maximize
        driver.manage().window().maximize();
        /*
        Bir web siteinde gittiğimizde browser default olarak gelir. Ve açılan elementlere ulaşamayabiliriz.
        Bu tüzden açıldığında maximize yaparak tüm web elementelrni görebiliriz.
         */
        //Techpro edcutaıon sitesine gidelim
        driver.navigate().to("https://techproeducation.com");
        //Browsırı konumu yazdıralım
        System.out.println(driver.manage().window().getPosition());
        //Browsırın boyutlarını yazdıralım
        System.out.println(driver.manage().window().getSize());
        Thread.sleep(3000);
        //Sayfayı mınımıze
        driver.manage().window().minimize();
        Thread.sleep(3000);
        //sayfayı full screen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));

//sayfayı kapatınız
        driver.close();






    }
}
