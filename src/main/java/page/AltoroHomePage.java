package page;

import cucumber.api.java.eo.Se;
import navigator.WebDriverController;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static navigator.InitPageFactory.altoroHomePage;

public class AltoroHomePage {

    //*[text()='Kiwisaver-Calculators']
    @FindBy(xpath = "//a[@id='ubermenu-item-cta-kiwisaver-calculators-ps']")
    private WebElement kiwisaverCalculatorsLink;

    @FindBy(linkText = "KiwiSaver")
    private WebElement kiwisavermenuLink;


    @FindBy(css = "button.icon-target.icon-target-help-toggle.icon-btn.icon-btn-info.ir.ng-scope")
    private WebElement ageIMSGLink;


   // public WebElement getAccountsDropdown() { return viewAccountDropdown;}
    public WebElement getkiwisaverCalculatorsLink() { return kiwisaverCalculatorsLink;}

    public WebElement getkiwisavermenuLink() { return kiwisavermenuLink;}

    public void getCheckingAccountsDropdown(){
        //Select s = new Select(getAccountsDropdown());
     //   s.selectByValue("800001");
    }
    public WebElement getageIMSGLink() { return ageIMSGLink;}


    public void hoverAndClickkiwisaverCalculatorsLink()
    {
        Actions action = new Actions(WebDriverController.webDriverController);
        action.moveToElement(getkiwisavermenuLink()).perform();
        action.moveToElement(getkiwisaverCalculatorsLink()).build().perform();
    }


}
