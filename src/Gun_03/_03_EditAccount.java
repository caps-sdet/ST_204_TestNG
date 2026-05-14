package Gun_03;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _03_EditAccount extends BaseDriver {
    // Edit Acoount edib,
    // first name, last name, telefon melumalarini random olaraq doldurun
    // ! emaile toxunmuruq !
    // Sonda da dogrulama edek
    @Test
    void EditAccount(){
        WebElement editAccount =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Edit Account'])[1]")));
        editAccount.click();

        WebElement firstName =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-firstname']")));
        firstName.clear();
        firstName.sendKeys("John");

        WebElement lastName =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-lastname']")));
        lastName.clear();
        lastName.sendKeys("Conor");

        WebElement telephone =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-telephone']")));
        telephone.clear();
        telephone.sendKeys("103");

        WebElement continuebtn =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Continue']")));
        continuebtn.click();

        Tools.SuccessMsgValidation();
    }
}
