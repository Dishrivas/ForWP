package navigator;

import configdefinition.PageTypeConfig;
import org.openqa.selenium.WebDriver;
import static navigator.WebDriverController.webDriverController;
import static navigator.InitPageFactory.*;
import static stepdef.CucumberTestHook.*;
import static org.openqa.selenium.support.PageFactory.initElements;


public class NavigationPageFactory {
  public static String baseURL = "http://www.westpac.co.nz/";
    public static String RCURL = "https://www.westpac.co.nz/kiwisaver/calculators/kiwisaver-calculator/";


    public static void navigateToLoginPage(WebDriver webDriver){
      webDriver.get(baseURL);
  }

    public static void navigateToRetirementCalculator(WebDriver webDriver){
        webDriver.get(RCURL);
    }

  public static void navigateToPage(WebDriver webDriver, PageTypeConfig pageType) {

    switch (pageType) {

        case LOGIN_PAGE:
            navigateToLoginPage(webDriver);
            break;
        case RC_PAGE:
            navigateToRetirementCalculator(webDriver);
            break;
    }
  }
}
