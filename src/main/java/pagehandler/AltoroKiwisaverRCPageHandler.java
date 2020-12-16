package pagehandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static navigator.InitPageFactory.altoroKiwiSaverRCPage;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class AltoroKiwisaverRCPageHandler {
    protected WebDriver wDriver;
    private WebDriverWait wait;

    public AltoroKiwisaverRCPageHandler(WebDriver wDriver){
        this.wDriver = wDriver;
       wait = new WebDriverWait(wDriver,5,4000);

    }
    public void waitForPageLanding(){
       wait.until(visibilityOf(altoroKiwiSaverRCPage.getpageHeaderRC()));
    }
    public String GetIMsgText(){
        //
       return altoroKiwiSaverRCPage.getIMsgText(altoroKiwiSaverRCPage.getinformationMessageForCurrentAge());
    }
    public void ClickageIMSGLink() throws InterruptedException {
        //
        Thread.sleep(3000);
        altoroKiwiSaverRCPage.switchToFRame(wDriver,0);
        altoroKiwiSaverRCPage.getageIMSGLink().click();
    }
    public void FillCurrentAge(int i) throws InterruptedException {
        //
        Thread.sleep(3000);
        altoroKiwiSaverRCPage.switchToFRame(wDriver,0);
        altoroKiwiSaverRCPage.fillCurrentAgeTxtBox(i);
    }
    public void SelectEmployeeStatus(String i){
        //
        altoroKiwiSaverRCPage.selectEmployeeStatus(i);
    }

    public void FillSalary(int i){
        //
        altoroKiwiSaverRCPage.fillSalaryTxtBox(i);
    }
    public void FillKiwisaverBalance(int i){
        //
        altoroKiwiSaverRCPage.fillKiwisaverBalanceTxtBox(i);
    }
    public void FillSavingGoalsRequirement(int i){
        //
        altoroKiwiSaverRCPage.fillSavingGoalsRequirement(i);
    }

    public void FillVoluntaryContributions(int i){
        //
        altoroKiwiSaverRCPage.fillVoluntaryContributions(i);
    }

    public void SelectVoluntaryContributionFrequency(String i) throws InterruptedException {
        //
        altoroKiwiSaverRCPage.selectVoluntaryContributionFrequency(i);
    }

    public void SelectKiwisaverContribution(Integer i){
        //
        altoroKiwiSaverRCPage.selectKiwisaverContribution(i);
    }

    public void SelectRiskProfileAs(String i){
        //
        altoroKiwiSaverRCPage.selectRiskProfileAs(i);
    }
    public void ClickValueProjections(){
        //
        altoroKiwiSaverRCPage.clickValueProjections();
    }
    public String ShowKiwisaverProj(){
        //
        return altoroKiwiSaverRCPage.showKiwisaverProj();
    }
    public void ClickGetStartedButton() throws InterruptedException {
        //
        JavascriptExecutor js = (JavascriptExecutor) wDriver;
        js.executeScript("arguments[0].scrollIntoView();",altoroKiwiSaverRCPage.getGetStartedButton());
        Thread.sleep(10000);
        System.out.print(wDriver.findElement(By.xpath("//*[@id=\"content-ps\"]/div[2]/div/section/p[4]/a"))+"222222222222222222222222222222222222222");
        wDriver.findElement(By.xpath("//*[@id=\"content-ps\"]/div[2]/div/section/p[4]/a")).click();
        //altoroKiwiSaverRCPage.clickGetStartedButton();
    }
}
