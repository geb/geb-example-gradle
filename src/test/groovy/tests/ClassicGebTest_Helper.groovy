package tests

import geb.Browser
import geb.junit5.GebReportingTest
import geb.navigator.Navigator
import io.github.bonigarcia.seljup.SeleniumJupiter
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.openqa.selenium.chrome.ChromeDriver
import pages.CbsLoginPage
import pages.MainPageCbs

@ExtendWith(SeleniumJupiter.class)
class ClassicGebTest_Helper extends GebReportingTest {
    public Browser browser
    public ChromeDriver driver
    public CbsLoginPage cbsLoginPage
    public MainPageCbs mainPageCbs

    @BeforeEach
    void classLevelSetup() {
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
    void loginClassic() {
        browser.drive {
            to cbsLoginPage
            cbsLoginPage.loginForm.loginField.value("cbs-admin")
            cbsLoginPage.loginForm.passwordField.value("123_Qwerty")
            cbsLoginPage.loginButton.click(MainPageCbs)
        }
    }

    @Test
    void openInstitutionWindowTest() {
        browser.drive {
            to cbsLoginPage
            cbsLoginPage.loginForm.loginField.value("cbs-admin")
            cbsLoginPage.loginForm.passwordField.value("123_Qwerty")
            cbsLoginPage.loginButton.click(MainPageCbs)

            mainPageCbs = getPage() as MainPageCbs
            waitFor(60) { mainPageCbs.mainMenu.topToolBar }

            mainPageCbs.mainMenu.dictionaries.click()
            mainPageCbs.mainMenu.swiftCodesMenu.click()
            mainPageCbs.mainMenu.swiftCodesManual.click()

            Navigator window = mainPageCbs.window("SWIFT codes manual")
            window.isDisplayed()

            mainPageCbs.button(window, "Add").click()
            mainPageCbs.window("Add SWIFT code").isDisplayed()

        }
    }
}
