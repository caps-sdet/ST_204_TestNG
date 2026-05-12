package Gun_01;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class _04_Enable {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Test(priority = 1)
    public void Test1() {
        System.out.println("Test 1 icra olundu");
        driver.get("https://www.facebook.com/");
    }

    @Test(enabled = false) // heleki icra edilmesin
    public void Test2() {
        System.out.println("Test 2 icra olundu");
    }

    @Test(priority = 3)
    public void Test3() {
        System.out.println("Test 3 icra olundu");
        driver.get("https://www.google.com/");
    }

    @BeforeClass // Class-in icindekilerden evvel ishlesin
    public void BeforeClassim() {
        System.out.println("Before class icra olundu");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterClass // Class-in icindekilerden ishledikden sonra icra olunsun
    public void AfterClassim() {
        System.out.println("After class icra olundu");
        driver.quit();
    }
}
