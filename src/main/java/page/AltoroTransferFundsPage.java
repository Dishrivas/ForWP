package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static navigator.InitPageFactory.altoroHomePage;

public class AltoroTransferFundsPage {
    protected WebDriver wDriver;
    private WebDriverWait wait;

    public AltoroTransferFundsPage(WebDriver wDriver){
        this.wDriver = wDriver;

    }
    @FindBy(id = "fromAccount")
    private WebElement corporateAccountsDropdown;
    @FindBy(id = "toAccount")
    private WebElement checkingAccountsDropdown;

    @FindBy(xpath = "//input[@id='transfer']")
    private WebElement transferMoneyButton;

    @FindBy(id = "transferAmount")
    private WebElement transferAmountTextBox;
    @FindBy()
    private WebElement loginButton;

    //public WebElement getViewAccountsDropdown() { return viewAccountsDropdown;}
    public WebElement getCorporateAccountsDropdown() { return corporateAccountsDropdown;}
    public WebElement getCheckingAccountsDropdown() { return checkingAccountsDropdown;}


    public WebElement getTransferMoneyButton() { return transferMoneyButton;}
    public WebElement getTransferAmountTextBox() { return transferAmountTextBox;}

    public void getCorporateAccountAccountsDropdown(){
        Select s = new Select(getCorporateAccountsDropdown());
        s.selectByValue("800000");
    }
    public void getCheckingAccountAccountsDropdown(){
        Select s = new Select(getCorporateAccountsDropdown());
        s.selectByValue("800001");
    }

}
