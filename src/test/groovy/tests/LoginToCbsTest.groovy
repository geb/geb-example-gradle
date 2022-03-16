package tests

import geb.Browser
import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import pages.CbsLoginPage

@RunWith(JUnit4)
class LoginToCbsTest extends GebReportingTest {
    @Test
    void loginToCbs() {
        CbsLoginPage.fillCredentialsForm()
        CbsLoginPage.clickLoginButton()
    }


}
