package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BaseDriverParameter {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    @Parameters("baruzer")
    public void Bashlangic(String baruzer) throws InterruptedException, AWTException {
        switch (baruzer.toLowerCase()){
            case "firefox" : driver=new FirefoxDriver(); break;
            case "edge" : driver = new EdgeDriver(); break;
            case "safari" : driver = new SafariDriver(); break;
            default:driver = new ChromeDriver();
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Login();
    }

    @AfterClass
    public void Baglanish() {
        Tools.Wait(3);
        driver.quit();
    }

    public void Login() throws AWTException, InterruptedException {

        Tools.Wait(3);
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

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
        btnLogin.click();

        wait.until(ExpectedConditions.titleIs("My Account"));
        Assert.assertTrue(driver.getTitle().equals("My Account"),"Login olunmadi");
    }
}
