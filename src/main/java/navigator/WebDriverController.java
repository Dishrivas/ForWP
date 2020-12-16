package navigator;

import org.openqa.selenium.WebDriver;

public class WebDriverController {
    public static WebDriver webDriverController;

    public WebDriver getWebDriver(){
        return this.webDriverController;
    }
    public void storeWebDriver (WebDriver wDriver){this.webDriverController = wDriver;}
}
