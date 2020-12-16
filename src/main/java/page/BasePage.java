package page;

import navigator.WebDriverController;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import stepdef.CucumberTestHook;

public class BasePage {
    protected WebDriver webDriver;
    public BasePage(){
        this.webDriver = CucumberTestHook.driver;
        WebDriverController.webDriverController = this.webDriver;
        System.out.print(WebDriverController.webDriverController+"99999999999999999999999999999999999999999999");
    }
    @FindBy(id = "")
    private WebElement viewAccountsDropdown;

}
