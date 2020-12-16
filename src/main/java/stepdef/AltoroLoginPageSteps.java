package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import navigator.WebDriverController;
import pagehandler.AltoroKiwisaverRCPageHandler;
import pagehandler.AltoroHomePageHandler;

import static org.junit.Assert.assertEquals;

public class AltoroLoginPageSteps{
//public WebDriver driver;


    AltoroKiwisaverRCPageHandler pagehandler = new AltoroKiwisaverRCPageHandler(WebDriverController.webDriverController);
    AltoroHomePageHandler altoroHomePageHandler = new AltoroHomePageHandler(WebDriverController.webDriverController);



    @Then("^I should be able to see the home page$")
    public void iShouldBeAbleToSeeTheHomePage() {

    }

    @When("^I Click KiwisaverCalculatorsLink button from the menu bar$")
    public void iClickKiwisaverCalculatorsLinkFromTheMenuBar() {
        altoroHomePageHandler.clickkiwisaverCalculatorsLink();
    }


    @When("^I hover the mouse over Kiwisaver link in the menu bar$")
    public void iHoverTheMouseOverKiwisaverLinkInTheMenuBar() throws InterruptedException {
        altoroHomePageHandler.mouseOverkiwisaverLink();
    }

    @When("^I Click KiwisaverLink button from the menu bar$")
    public void iClickKiwisaverLinkButtonFromTheMenuBar() {
        altoroHomePageHandler.clickkiwisaverLink();
    }

    @When("^I Click information icon besides Current age$")
    public void iClickInformationIconBesidesCurrentAge() throws InterruptedException {
        pagehandler.ClickageIMSGLink();
    }

    @Then("^I the msg should be \"([^\"]*)\"$")
    public void iTheMsgShouldBe(String expectedMsg) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String ActualMsg = pagehandler.GetIMsgText();
        assertEquals(expectedMsg, ActualMsg);
        WebDriverController.webDriverController.quit();
    }

    @When("^I fill in Current age as (\\d+)$")
    public void iFillInCurrentAgeAs(int arg0) throws InterruptedException {
        pagehandler.FillCurrentAge(arg0);
    }

    @When("^I select Employee Status as \"([^\"]*)\"$")
    public void iSelectEmployeeStatusAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pagehandler.SelectEmployeeStatus(arg0);
    }

    @When("^I Input Salary as (\\d+)$")
    public void iInputSalaryAs(int arg0) {
        pagehandler.FillSalary(arg0);
    }

    @When("^I Select Kiwisaver Contribution as (\\d+)$")
    public void iSelectKiwisaverContributionAs(int arg0) {
        pagehandler.SelectKiwisaverContribution(arg0);
    }

    @When("^I Select Risk Profile as \"([^\"]*)\"$")
    public void iSelectRiskProfileAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pagehandler.SelectRiskProfileAs(arg0);

    }

    @And("^I Click View Projections$")
    public void iClickViewProjections() {
        pagehandler.ClickValueProjections();
    }

    @Then("^I shoudl see the message \"([^\"]*)\"$")
    public void iShoudlSeeTheMessage(String expectedMsg) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String ActualMsg = pagehandler.ShowKiwisaverProj();
        assertEquals(expectedMsg, ActualMsg);
        WebDriverController.webDriverController.quit();
    }

    @When("^I fill my Kiwisaver balance as (\\d+)$")
    public void iFillMyKiwisaverBalanceAs(int arg0) {
        pagehandler.FillKiwisaverBalance(arg0);
    }

    @And("^I fill saving goals requirement of \\$(\\d+)$")
    public void iFillSavingGoalsRequirementOf$(int arg0) {
        pagehandler.FillSavingGoalsRequirement(arg0);
    }

    @And("^I Choose Voluntary Contributions of \\$(\\d+)")
    public void iChooseVoluntaryContributionsOf$WithAFrequencyOf(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pagehandler.FillVoluntaryContributions(arg0);
    }

    @And("^I choose Voluntary Contributions frequency as \"([^\"]*)\"$")
    public void iChooseVoluntaryContributionsFrequencyAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pagehandler.SelectVoluntaryContributionFrequency(arg0);
    }

    @When("^I click Get Started Button on Calculators page$")
    public void iClickGetStartedButtonOnCalculatorsPage() throws InterruptedException {
        pagehandler.ClickGetStartedButton();
    }
}

