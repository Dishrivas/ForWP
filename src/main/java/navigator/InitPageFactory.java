package navigator;

import org.openqa.selenium.WebDriver;
import page.AltoroKiwiSaverRCPage;
import page.AltoroTransferFundsPage;
import page.AltoroHomePage;
import static org.openqa.selenium.support.PageFactory.initElements;

public class InitPageFactory {
    public static AltoroKiwiSaverRCPage altoroKiwiSaverRCPage;
    public static AltoroHomePage altoroHomePage;
    public static AltoroTransferFundsPage altoroTransferFundsPage;

    public static AltoroKiwiSaverRCPage altoroLoginPageInit(WebDriver webDriver){
        altoroKiwiSaverRCPage = initElements(webDriver, AltoroKiwiSaverRCPage.class);
        return altoroKiwiSaverRCPage;
    }

    public static AltoroHomePage altoroHomePageInit(WebDriver webDriver){
        altoroHomePage = initElements(webDriver,AltoroHomePage.class);
        return altoroHomePage;
    }
}
