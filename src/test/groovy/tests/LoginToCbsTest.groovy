package tests

import geb.Browser
import geb.Page
import geb.junit5.GebReportingTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import io.github.bonigarcia.seljup.SeleniumJupiter
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CbsLoginPage
import pages.MainPageCbs
import static org.assertj.core.api.Assertions.*

@ExtendWith(SeleniumJupiter.class)
class LoginToCbsTest extends GebReportingTest {
    public Browser browser
    public CbsLoginPage page
//    @Test
//    void loginIsSuccessful() {
//        // When
//        CbsLoginPage.fillCredentialsForm("cbs-tester-1", "123_Qwerty")
//        CbsLoginPage.clickLoginButton()
//
//        // Then
//        MainPageCbs.verifyPageIsDisplayed()
//    }
//

    @BeforeEach
    public void classLevelSetup() {
        browser = new Browser()
        browser.setDriver(new ChromeDriver())
        page = browser.createPage(CbsLoginPage.class)
    }

    @AfterEach
    public void teardown() {
        browser.quit()
    }

    @Test
    void loginFailsWhenPasswordIsWrong() {
        // When
        page.fillCredentialsForm("cbs-tester-1", "123_Wrong_password")
        page.clickLoginButton()

        // Then
        verifyLoginErrorIsDisplayed()
    }

    @Test
    void loginFailsWhenUsernameIsWrong() {
        // When
        page.fillCredentialsForm("Wrong_username", "123_Qwerty")
        page.clickLoginButton()

        // Then
        verifyLoginErrorIsDisplayed()
    }

    void verifyLoginErrorIsDisplayed() {
        assertThat(page.getErrorMessage().isEmpty()).isFalse();
    }
}
