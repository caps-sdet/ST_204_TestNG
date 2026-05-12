package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Tools {

    public static void Wait (int sn){
        try {
            Thread.sleep(sn*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void SuccessMessageValidation(){
        WebElement msgSuccess = BaseDriver.driver.findElement
                (By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(msgSuccess.getText().toLowerCase().contains("success"));
    }
}
