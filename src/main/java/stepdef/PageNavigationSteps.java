package stepdef;

import configdefinition.PageTypeConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import navigator.WebDriverController;
import org.openqa.selenium.WebDriver;
import page.BasePage;
import static navigator.NavigationPageFactory.*;
import static navigator.WebDriverController.webDriverController;
import static org.openqa.selenium.support.PageFactory.initElements;

public class PageNavigationSteps {
    public WebDriver driver;
    public PageNavigationSteps(){driver = CucumberTestHook.driver;}

    @Given("^I login and navigate to the \"([^\"]*)\" page$")
    public void I_login_and_navigate_to_the_page(String pageName)throws Throwable
    {
        PageTypeConfig pageType = PageTypeConfig.getPageType(pageName);
        webDriverController = CucumberTestHook.driver;
        navigateToPage(driver,pageType);
        Thread.sleep(2000);
    }

    @When("^I navigate to the \"([^\"]*)\" page$")
    public void I__navigate_to_the_page(String pageName)throws Throwable
    {
        PageTypeConfig pageType = PageTypeConfig.getPageType(pageName);
        navigateToPage(driver,pageType);
        Thread.sleep(2000);
    }


}
