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
    public Browser browser = new Browser()
    public ChromeDriver driver = new ChromeDriver()
    public CbsLoginPage cbsLoginPage
    public MainPageCbs mainPageCbs

    @BeforeEach
    public void  classLevelSetup() {
        browser.setDriver(driver)
        cbsLoginPage = browser.createPage(CbsLoginPage.class)
        mainPageCbs = browser.createPage(MainPageCbs.class)
    }

    @AfterEach
    public void teardown() {
        browser.quit()
    }

    @Test
    void checkExistingInstitution() {
        cbsLoginPage.iAmSuccessfulAuthorizeInCbs()
//        mainPageCbs.goToInstitutionsWindow()
    }


}
