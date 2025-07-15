package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "signin_button")
    public WebElement singInTab;

    @FindBy(id = "user_login")
    WebElement usernameField;

    @FindBy(id = "user_password")
    WebElement passwordField;

    @FindBy(css=".btn.btn-primary")
    WebElement signInButton;

    @FindBy(id="logout_link")
    public  WebElement logoutTab;

    @FindBy(id="onlineBankingMenu")
    public  WebElement onlineBankingMenu;


    public void addUsername(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void addPassword(String password){
        passwordField.sendKeys(password);
    }

    public void  clickOnSingInTab(){
        singInTab.click();
    }

    public void  clickOnLoginButton(){
       signInButton.click();
    }

    public void clickOnLogoutButton(){
        logoutTab.click();
    }

    public void clickOnOnlineBankingMenu(){
        onlineBankingMenu.click();
    }



}