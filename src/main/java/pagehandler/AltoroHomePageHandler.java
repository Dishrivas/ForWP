package pagehandler;

import navigator.WebDriverController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdef.CucumberTestHook;

import javax.swing.*;

import static navigator.InitPageFactory.altoroHomePage;
import static navigator.InitPageFactory.altoroTransferFundsPage;
import static navigator.InitPageFactory.altoroKiwiSaverRCPage;

public class AltoroHomePageHandler {
    public WebDriver wDriver;
    public WebDriverWait wait;

    public AltoroHomePageHandler(WebDriver wDriver){
        this.wDriver = wDriver;

    }
    public void selectCheckingAccountDropdown()
    {
        altoroHomePage.getCheckingAccountsDropdown();

    }
    public void selectCorporateAccountFromAccount()
    {
        altoroTransferFundsPage.getCorporateAccountAccountsDropdown();

    }
    public void selectCheckingAccountFromAccount()
    {
        altoroTransferFundsPage.getCheckingAccountAccountsDropdown();

    }
    public void enterTransferAmount()
    {
        altoroTransferFundsPage.getTransferAmountTextBox().sendKeys("1000");

    }
    public void clickTransferMoneyButton(){
        //
        altoroTransferFundsPage.getTransferMoneyButton().click();
    }

    public void clickkiwisaverCalculatorsLink(){
        //
        altoroHomePage.getkiwisaverCalculatorsLink().click();
    }
    public void clickkiwisaverLink(){
        //
        altoroHomePage.getkiwisavermenuLink().click();
    }

    public void mouseOverkiwisaverLink() throws InterruptedException {
        WebElement kiwisaverLink = wDriver.findElement(By.linkText("KiwiSaver"));
        Actions action = new Actions(wDriver);
        Thread.sleep(4000);
        action.moveToElement(kiwisaverLink).build().perform();
        Thread.sleep(4000);
        wDriver.findElement(By.xpath("//a[@id='ubermenu-item-cta-kiwisaver-calculators-ps']")).click();
        Thread.sleep(4000);

    }

}
