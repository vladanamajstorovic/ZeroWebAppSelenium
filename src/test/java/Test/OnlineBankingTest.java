package Test;

import Base.BaseTest;
import Page.LoginPage;
import Page.OnlineBankingPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class OnlineBankingTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));


        loginPage = new LoginPage();
        onlineBankingPage=new OnlineBankingPage();

        loginPage.clickOnSingInTab();
        Thread.sleep(2000);
        loginPage.addUsername("username");
        loginPage.addPassword("password");
        Thread.sleep(2000);
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
        driver.navigate().back();
    }


    @Test
    public void CheckingTransactionsListShown(){

        loginPage.clickOnOnlineBankingMenu();
        onlineBankingPage.clickOnAccountActivityTab();
        onlineBankingPage.clickOnAccountDropdownMenu();
        onlineBankingPage.selectFromDropdownAccountMenu("2");
        Assert.assertTrue(onlineBankingPage.tabelDataCheckDeposit.isDisplayed());
        Assert.assertTrue(onlineBankingPage.tabelDataTelecom.isDisplayed());

    }




}