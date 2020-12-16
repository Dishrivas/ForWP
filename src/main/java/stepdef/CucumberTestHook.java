package stepdef;

import cucumber.api.java.After;
import navigator.InitPageFactory;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class CucumberTestHook {
    public static WebDriver driver;
    public static String URL;

    @Before(order = 1)
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:/code/WP/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver .manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        initAllpages();
    }
    public void initAllpages()
    {
        InitPageFactory.altoroLoginPageInit(driver);
        InitPageFactory.altoroHomePageInit(driver);

    }

    @After
    public void Close()
    {
        driver.close();

    }
}
