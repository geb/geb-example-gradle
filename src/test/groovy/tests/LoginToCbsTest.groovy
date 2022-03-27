package tests

import geb.Browser
import geb.junit5.GebReportingTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import io.github.bonigarcia.seljup.SeleniumJupiter
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.*
import pages.CbsLoginPage
import pages.MainPageCbs

@ExtendWith(SeleniumJupiter.class)
class LoginToCbsTest extends GebReportingTest {
    public Browser browser
    public CbsLoginPage cbsLoginPage
    public MainPageCbs mainPageCbs
    public ChromeDriver driver

    @BeforeEach
    public void classLevelSetup() {
        browser = new Browser()
        driver = new ChromeDriver()
        browser.setDriver(driver)
        cbsLoginPage = browser.createPage(CbsLoginPage.class)
        mainPageCbs = browser.createPage(MainPageCbs.class)
    }

    @AfterEach
    public void teardown() {
        browser.quit()
    }

//    @Test
//    void loginIsSuccessful() {
//        // When
//        cbsLoginPage.fillCredentialsForm("cbs-tester-1", "123_Qwerty")
//        cbsLoginPage.clickLoginButton()
//
//        // Then
//        mainPageCbs.verifyPageIsDisplayed()
//    }
//
//    @Test
//    void loginFailsWhenPasswordIsWrong() {
//        // When
//        cbsLoginPage.fillCredentialsForm("cbs-tester-1", "123_Wrong_password")
//        cbsLoginPage.clickLoginButton()
//
//        // Then
//        verifyLoginErrorIsDisplayed()
//    }

    @Test
    void loginFailsWhenUsernameIsWrong() {
        // When
        cbsLoginPage.fillCredentialsForm("Wrong_username", "123_Qwerty")
        cbsLoginPage.clickLoginButton()

        // Then
        verifyLoginErrorIsDisplayed()
    }

    void verifyLoginErrorIsDisplayed() {
        browser.getPage().getErrorMessage()
    }
}
