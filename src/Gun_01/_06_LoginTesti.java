package Gun_01;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_LoginTesti extends BaseDriver {

    @Test
    public void Test1(){
//        driver.get("https://opencart.abstracta.us/index.php?route=account/account");
//
//        WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
//        email.sendKeys("ertogrul1188kayi@gmail.com");
//
//        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
//        password.sendKeys("8Vtc@TQvzaCCz7");
//
//        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
//        btnLogin.click();

        // BaseDriver-da Login emeliyyati edildiyi ucun artiq yuxaridaki emeliyyatlara ehtiyac qalmadi

        System.out.println("1ci driver.getTitle() = " + driver.getTitle());
        wait.until(ExpectedConditions.titleIs("My Account")); // wait bizi ola bilecek xetalardan qorudu
        System.out.println("2ci driver.getTitle() = " + driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("My Account"),"Login xetali oldu");
    }
}
