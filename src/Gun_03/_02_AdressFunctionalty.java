package Gun_03;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class _02_AdressFunctionalty extends BaseDriver {

    @Test
    void AddAdress(){

        WebElement adressBook =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Address Book'])[1]")));
        adressBook.click();

        WebElement newAdress =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='New Address']")));
        newAdress.click();

        WebElement firstName =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-firstname']")));
        firstName.sendKeys("Tester");

        WebElement lastName =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-lastname']")));
        lastName.sendKeys("Manualzade");

        WebElement company =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-company']")));
        company.sendKeys("Manualizm");

        WebElement adress1 =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-address-1']")));
        adress1.sendKeys("Random1");

        WebElement adress2 =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-address-2']\n")));
        adress2.sendKeys("Random2");

        WebElement city =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-city']")));
        city.sendKeys("Tesadufi");

        WebElement postCode =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-postcode']")));
        postCode.sendKeys("1111");

        WebElement Webcountry =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='input-country']")));
        Select coutry = new Select(Webcountry);
        coutry.selectByValue("15");

        WebElement WebregionState =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='input-zone']")));
        Select region = new Select(WebregionState);
        region.selectByValue("209");

        WebElement defaultYes =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='default'])[1]")));
        defaultYes.click();

        Tools.wait(2);

        WebElement defaultNo =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='default'])[2]")));
        defaultNo.click();

        WebElement btnContinue =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Continue']")));
        btnContinue.click();

        Tools.SuccessMsgValidation();

        WebElement btnDelete =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='btn btn-danger'])[2]")));
        btnDelete.click();

        Tools.SuccessMsgValidation();

    }
}
