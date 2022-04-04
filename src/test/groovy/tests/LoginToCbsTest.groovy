package tests

import geb.Browser
import geb.Page
import geb.junit5.GebReportingTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import io.github.bonigarcia.seljup.SeleniumJupiter
import org.openqa.selenium.chrome.ChromeDriver
import static org.assertj.core.api.Assertions.*
import pages.CbsLoginPage
import pages.MainPageCbs


@ExtendWith(SeleniumJupiter.class)
class LoginToCbsTest extends GebReportingTest {
    public Browser browser
    public ChromeDriver driver
    public CbsLoginPage cbsLoginPage

    @BeforeEach
    void  classLevelSetup() {
        browser = new Browser()
        driver = new ChromeDriver()
        browser.setDriver(driver)
        cbsLoginPage = browser.createPage(CbsLoginPage.class)
    }

    @AfterEach
    public void teardown() {
        browser.quit()
    }

    @Test
    void loginIsSuccessful() {
        // When
        cbsLoginPage.fillCredentialsForm("cbs-tester-1", "123_Qwerty")
        clickLoginButtonWithCheckingMainPage(browser)

        // Then
        waitTopToolBar(browser, 60)
        assertThat(browser.getPage().getClass()).isEqualTo(MainPageCbs.class)
    }

    @Test
    void loginFailsWhenPasswordIsWrong() {
        // When
        cbsLoginPage.fillCredentialsForm("cbs-tester-1", "123_Wrong_password")
        clickLoginButton(browser)

        // Then
        verifyLoginErrorIsDisplayed()
    }

    @Test
    void loginFailsWhenUsernameIsWrong() {
        // When
        cbsLoginPage.fillCredentialsForm("Wrong_username", "123_Qwerty")
        clickLoginButton(browser)

        // Then
        verifyLoginErrorIsDisplayed()
    }

    void clickLoginButton(Browser browser) {
        browser.waitFor (10, {(browser.getPage() as CbsLoginPage)
                .loginButton.click() })
    }

    void clickLoginButtonWithCheckingMainPage(Browser browser) {
        browser.waitFor (10, {(browser.getPage() as CbsLoginPage)
                .loginButton.click(MainPageCbs) })
    }

    void verifyLoginErrorIsDisplayed() {
        (browser.getPage() as CbsLoginPage).getErrorMessage()
    }

    Page waitTopToolBar(Browser browser, int timeout) {
        browser.waitFor(timeout, { browser.$(id: "topToolbar-innerCt") })
        return browser.getPage()
    }
}
