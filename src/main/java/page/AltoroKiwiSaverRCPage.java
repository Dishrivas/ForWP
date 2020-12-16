package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AltoroKiwiSaverRCPage {

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[1]/h1")
    private WebElement pageHeaderRC;

    public WebElement getpageHeaderRC() {
        return pageHeaderRC;
    }

    @FindBy(css = "button.icon-target.icon-target-help-toggle.icon-btn.icon-btn-info.ir.ng-scope")
    private WebElement ageIMSGLink;

    public WebElement getageIMSGLink() {
        return ageIMSGLink;
    }

    @FindBy(css = "div.field-message.message-info.ng-binding")
    public WebElement informationMessageForCurrentAge;

    public WebElement getinformationMessageForCurrentAge() {
        return informationMessageForCurrentAge;
    }

    //@FindBy(css = "button.icon-target.icon-target-help-toggle.icon-btn.icon-btn-info.ir.ng-scope")
    @FindBy(xpath = "//input[@ng-model='displayModel']")
    private WebElement currentAgeTxtBox;

    public WebElement getcurrentAgeTxtBox() {
        return currentAgeTxtBox;
    }

    @FindBy(css = "div.well-value.ng-binding")
    private WebElement viewEmployeeDropown;

    public WebElement getEmployeeDropown() {
        return viewEmployeeDropown;
    }

    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]/div")
    private WebElement viewVCFrequencyDropown;

    public WebElement getVoluntaryContributionFrequency() {
        return viewVCFrequencyDropown;
    }

    @FindBy(css = "input.ng-pristine.ng-valid")
    private WebElement salaryTxtBox;

    public WebElement getSalaryTxtBox() {
        return salaryTxtBox;
    }

    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
    private WebElement kiwisaverBalanceTxtBox;

    public WebElement getKiwisaverBalanceTxtBox() {
        return kiwisaverBalanceTxtBox;
    }

    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
    private WebElement savingGoalsRequirementTxtBox;

    public WebElement getSavingGoalsRequirement() {
        return savingGoalsRequirementTxtBox;
    }

    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input")
    private WebElement voluntaryContributionsTxtBox;

    public WebElement getVoluntaryContributions() {
        return voluntaryContributionsTxtBox;
    }

    @FindBy(xpath = "//input[@value='3']")
    private WebElement kiwisaverContribution3;

    public WebElement get3PCKiwisaverContribution() {
        return kiwisaverContribution3;
    }

    @FindBy(xpath = "//input[@value='4']")
    private WebElement kiwisaverContribution4;

    public WebElement get4PCKiwisaverContribution() {
        return kiwisaverContribution4;
    }

    @FindBy(xpath = "//input[@value='medium']")
    private WebElement conservativeRiskProfile;

    public WebElement getConservativeRiskProfile() {
        return conservativeRiskProfile;
    }

    @FindBy(xpath = "//input[@value='high']")
    private WebElement balancedRiskProfile;

    public WebElement getBalancedRiskProfile() {
        return balancedRiskProfile;
    }

    @FindBy(xpath = "//input[@value='low']")
    private WebElement defensiveRiskProfile;

    public WebElement getDefensiveRiskProfile() {
        return defensiveRiskProfile;
    }
    public String getIMsgText(WebElement element) {
        return element.getText();
    }

    public void fillCurrentAgeTxtBox(Integer i) {
        getcurrentAgeTxtBox().click();
        getcurrentAgeTxtBox().sendKeys(i.toString());
    }

    public void selectEmployeeStatus(String i) {
        getEmployeeDropown().click();
        selectEmployeeStatusasListed(i);
    }

    public void selectVoluntaryContributionFrequency(String i) throws InterruptedException {
        getVoluntaryContributionFrequency().click();
        Thread.sleep(3000);
        selectVCFrequency(i);
    }

    public void fillSalaryTxtBox(Integer i) {
        getSalaryTxtBox().sendKeys(i.toString());
    }
    public void fillKiwisaverBalanceTxtBox(Integer i) {
        getKiwisaverBalanceTxtBox().click();
        getKiwisaverBalanceTxtBox().clear();
        getKiwisaverBalanceTxtBox().sendKeys(i.toString());
    }
    public void fillSavingGoalsRequirement(Integer i) {
        getSavingGoalsRequirement().click();
        getSavingGoalsRequirement().clear();
        getSavingGoalsRequirement().sendKeys(i.toString());
    }

    public void fillVoluntaryContributions(Integer i) {
        getVoluntaryContributions().click();
        getVoluntaryContributions().clear();
        getVoluntaryContributions().sendKeys(i.toString());
    }
    public void switchToFRame(WebDriver driver, int i) {
        Integer size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(i);
    }

    public void selectKiwisaverContribution(Integer i) {

        switch (i) {
            case 3:
                get3PCKiwisaverContribution().click();
                break;
            case 4:
                get4PCKiwisaverContribution().click();
                break;
        }
    }
    public void selectRiskProfileAs(String i) {

        switch (i) {
            case "Defensive":
                getDefensiveRiskProfile().click();
                break;
            case "Conservative":
                getConservativeRiskProfile().click();
                break;
            case "Balanced":
                getBalancedRiskProfile().click();
                break;

        }
    }
    @FindBy(css = "button.btn.btn-regular.btn-results-reveal.btn-has-chevron")
    private WebElement valueProjectionsButton;
    public WebElement getValueProjectionsButton() {
        return valueProjectionsButton;
    }
    public void clickValueProjections() {
        getValueProjectionsButton().click();
    }


    @FindBy(xpath = "//*[.='Click here to get started.']")
    private WebElement GetStartedButton;
    public WebElement getGetStartedButton() {
        return GetStartedButton;
    }
    public void clickGetStartedButton() {
        getGetStartedButton().click();
    }

    @FindBy(xpath = "//*[.='At age 65, your KiwiSaver balance is estimated to be:']")
    private WebElement valueProjectionsText;
    public WebElement getValueProjections() {
        return valueProjectionsText;
    }
    public String showKiwisaverProj() {
        return getValueProjections().getText();
    }

    @FindBy(xpath = "//li[@value='employed']")
    private WebElement EmployeeStatusEmployed;
    public WebElement getselectEmployeeStatusEmployed() {
        return EmployeeStatusEmployed;
    }
    @FindBy(xpath = "//li[@value='self-employed']")
    private WebElement EmployeeStatusSelfEmployed;
    public WebElement getselectEmployeeStatusSelfEmployed() {
        return EmployeeStatusSelfEmployed;
    }
    @FindBy(xpath = "//li[@value='not-employed']")
    private WebElement EmployeeStatusNotEmployed;
    public WebElement getselectEmployeeStatusNotEmployed() {
        return EmployeeStatusNotEmployed;
    }

    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[5]/div/span")
    private WebElement VCAnnually;
    public WebElement getselectVCAnnually() {
        return VCAnnually;
    }
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[2]/ul/li[3]/div/span")
    private WebElement VCFortNightly;
    public WebElement getselectVCFortNightly() {
        return VCFortNightly;
    }

    public void selectEmployeeStatusasListed(String i) {

        switch (i) {
            case "Employed":
                getselectEmployeeStatusEmployed().click();
                break;
            case "Self-Employed":
                getselectEmployeeStatusSelfEmployed().click();
                break;
            case "Not Employed":
                getselectEmployeeStatusNotEmployed().click();
                break;
        }
    }
    public void selectVCFrequency(String i) {

        switch (i) {
            case "Annually":
                getselectVCAnnually().click();
                break;
            case "Fortnightly":
                getselectVCFortNightly().click();
                break;
        }
    }
}
