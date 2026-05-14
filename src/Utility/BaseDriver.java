package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeClass
    public void startTest() { // Acilish
        System.out.println("Before class icra olundu");
        driver = new ChromeDriver();
        Tools.wait(3);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Login();
    }

    @AfterClass
    public void endTest() { // Baglanish
        System.out.println("After class icra olundu");
        Tools.wait(2);
        driver.quit();
    }

    public void Login(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/account");

        WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
        email.sendKeys("ertogrul1188kayi@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        password.sendKeys("8Vtc@TQvzaCCz7");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
        btnLogin.click();

//        System.out.println("1ci driver.getTitle() = " + driver.getTitle());
//        wait.until(ExpectedConditions.titleIs("My Account")); // wait bizi ola bilecek xetalardan qorudu
//        System.out.println("2ci driver.getTitle() = " + driver.getTitle());
//        Assert.assertTrue(driver.getTitle().equals("My Account"),"Login xetali oldu");
    }
}
