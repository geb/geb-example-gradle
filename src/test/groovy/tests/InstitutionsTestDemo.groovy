package tests

import geb.Browser
import geb.junit5.GebReportingTest
import io.github.bonigarcia.seljup.SeleniumJupiter
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.openqa.selenium.chrome.ChromeDriver
import pages.CbsLoginPage
import pages.MainPageCbs

@ExtendWith(SeleniumJupiter.class)
class InstitutionsTestDemo extends GebReportingTest {
    public Browser browser
    public ChromeDriver driver
    public CbsLoginPage cbsLoginPage

    @BeforeEach
    public void  classLevelSetup() {
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
    void checkExistingInstitution() {
        cbsLoginPage.iAmSuccesfulAuthorizedInCbs(browser, "Cbs-tester-1", "123_Qwerty")
        (browser.getPage() as MainPageCbs).goToInstitutionsWindow()
    }


}
