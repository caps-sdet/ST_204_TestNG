package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Logger logAdd = LogManager.getLogger(); // Log-lari elave edeceyim qurgunu bashlatdim

    @BeforeClass
    public void Bashlangic() throws InterruptedException, AWTException {
        logAdd.info("Loglama bashladildi");

        driver = new ChromeDriver();
        logAdd.info("Driver bashladildi");

        //Deyekki xeta olsaydi (driver yuklenmeseydi ve ya bashqa problem olsaydi)
        logAdd.error("Driver yaradilarken xeta oldu");


//        driver.manage().window().maximize(); // Ekrani max et
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Login();
    }

    @AfterClass
    public void Baglanish() {
        Tools.Wait(3);
        driver.quit();
        logAdd.info("Loglama yekunlashdi");
    }

    public void Login() throws AWTException, InterruptedException {
        driver.get("https://opencart.abstracta.us/index.php?route=account/account");

        Robot robot = new Robot();
        // 4 defe TAB duymesi
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(200); // 0.2 saniye gozle
        }
        // Enter etmek
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(200);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(200);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(200);

        Tools.Wait(5);

        WebElement email = driver.findElement(By.xpath("//div/input[@name='email']"));
        email.sendKeys("rirol10130@dubokutv.com");

        WebElement password = driver.findElement(By.xpath("//div/input[@name='password']"));
        password.sendKeys("Kod12345");

        logAdd.info("Hazirda " + "rirol10130@dubokutv.com" + " adinda user login olmaq ucun gonderildi");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
        btnLogin.click();

        wait.until(ExpectedConditions.titleIs("My Account"));
        logAdd.debug("Login testine kecid edirem");
        Assert.assertTrue(driver.getTitle().equals("My Account"),"Login olunmadi");
        logAdd.debug("Login ugurla tamamlandi");
    }

    @BeforeClass
    public void BeforeMetod(){
        logAdd.info("Metod ishlemeye bashlayacaq");
    }

//    @AfterClass
//    public void AfterMetod(ITestResult netice)
//    // ITestResult : testin netice ve ad melumatinin oldugu deyishendir
//    {
//        logAdd.info(netice.getName() + " Metod ishleyib tamamlandi");
//        logAdd.info(netice.getStatus() == 1 ? "Passed" : "Failed"); // ternary operatoru
//
//        // cox muhum bir xeta bash verdi (crash ya da sistem cokdu)
//        logAdd.fatal(netice.getName() + " Metodda cox muhum bir xeta bash verdi");
//    }
}
