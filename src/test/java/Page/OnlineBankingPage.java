package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OnlineBankingPage extends BaseTest {

    public OnlineBankingPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "account_activity_link")
    public WebElement accountActivityTab;


    @FindBy(id = "aa_accountId")
    public WebElement accountDropdownMenu;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[2]")
    public WebElement tabelDataCheckDeposit;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]")
    public WebElement tabelDataTelecom;




    public void clickOnAccountActivityTab(){
      accountActivityTab.click();
    }

    public void clickOnAccountDropdownMenu(){
        accountDropdownMenu.click();
    }

    public void selectFromDropdownAccountMenu(String value) {
        Select dropdown = new Select(accountDropdownMenu);
        dropdown.selectByValue(value);
    }





}
