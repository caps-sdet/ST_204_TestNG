package Gun_02;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_SubsNewsLetter extends BaseDriver {

    By link = By.xpath("(//a[text()='Newsletter'])[1]");
    By subYes = By.xpath("(//*[@name='newsletter'])[1]");
    By subNo = By.xpath("(//input[@name='newsletter'])[2]");
    By btnCtn = By.xpath("//*[@value='Continue']");


    @Test(priority = 1)
    public void SubsYes() {
        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();
        Tools.wait(2);

        WebElement subscribeYes = driver.findElement(subYes);
        subscribeYes.click();
        Tools.wait(2);

        WebElement btnContinue = driver.findElement(btnCtn);
        btnContinue.click();
        Tools.wait(2);

        Tools.SuccessMsgValidation();
    }

    @Test(priority = 2)
    public void SubsNo() {
        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();
        Tools.wait(2);

        WebElement subscribeNo = driver.findElement(subNo);
        subscribeNo.click();
        Tools.wait(2);

        WebElement btnContinue = driver.findElement(btnCtn);
        btnContinue.click();
        Tools.wait(2);

        Tools.SuccessMsgValidation();
    }

}
