package Test;
import Base.BaseTest;
import Page.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));


        loginPage = new LoginPage();
    }

    @Test
    public void userCanLoginWithValidCredentials() throws InterruptedException {

        loginPage.clickOnSingInTab();
        Thread.sleep(2000);
        loginPage.addUsername("username");
        loginPage.addPassword("password");
        Thread.sleep(2000);
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "http://zero.webappsecurity.com/index.html");
        Assert.assertTrue(loginPage.logoutTab.isDisplayed());



        //LOGOUT

        loginPage.clickOnLogoutButton();
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.singInTab.isDisplayed());
    }









}