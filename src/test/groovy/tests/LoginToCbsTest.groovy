package tests

import geb.Browser
import geb.junit5.GebReportingTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import io.github.bonigarcia.seljup.SeleniumJupiter;

import pages.CbsLoginPage
import pages.MainPageCbs
import static org.assertj.core.api.Assertions.*


class LoginToCbsTest extends GebReportingTest {

    @ExtendWith(SeleniumJupiter.class)
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
