package tests

import geb.Browser
import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import pages.CbsLoginPage
import pages.MainPageCbs
import static org.assertj.core.api.Assertions.*

@RunWith(JUnit4)
class LoginToCbsTest extends GebReportingTest {
    @Test
    void loginIsSuccessful() {
        // When
        CbsLoginPage.fillCredentialsForm("cbs-tester-1", "123_Qwerty")
        CbsLoginPage.clickLoginButton()

        // Then
        MainPageCbs.verifyPageIsDisplayed()
    }

//    @Test
//    void loginFailsWhenPasswordIsWrong() {
//        // When
//        CbsLoginPage.fillCredentialsForm("cbs-tester-1", "123_Wrong_password")
//        CbsLoginPage.clickLoginButton()
//
//        // Then
//        verifyLoginErrorIsDisplayed()
//    }
//
//    @Test
//    void loginFailsWhenUsernameIsWrong() {
//        // When
//        CbsLoginPage.fillCredentialsForm("cbs-tester-1", "123_Qwerty")
////        CbsLoginPage.fillCredentialsForm("Wrong_username", "123_Qwerty")
//        CbsLoginPage.clickLoginButton()
//
//        // Then
//        verifyLoginErrorIsDisplayed()
//    }
//
//    private void verifyLoginErrorIsDisplayed() {
//        Browser.drive {
//            assertThat($("div", innerHTML: contains("Invalid username or password.")).isEmpty()).isFalse();
//        }
//    }
}
