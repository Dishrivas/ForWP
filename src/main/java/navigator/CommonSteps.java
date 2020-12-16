package navigator;

import configdefinition.PageTypeConfig;
import cucumber.api.java.en.Given;
import page.BasePage;

import static navigator.WebDriverController.webDriverController;
import static org.openqa.selenium.support.PageFactory.initElements;

public class CommonSteps extends BasePage {
    BasePage basePage;
    public CommonSteps(){
    basePage = initElements(webDriver,BasePage.class);
        System.out.print(webDriver + "###################################");

    }


}
