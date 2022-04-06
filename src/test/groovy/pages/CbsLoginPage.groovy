package pages

import geb.Browser
import geb.Page
import modules.CbsLoginPageModule
import tests.LoginToCbsTest

import static geb.Browser.drive

class CbsLoginPage extends Page {
    static url = "https://test.bocbs.cardpay-test.com/"

    static at = { title == "Log in to CBS" }

    static content = {
        loginButton { $(name: "login") }
        loginForm { module CbsLoginPageModule }
    }

    void fillCredentialsForm(String username, String password) {
        drive(getBrowser(), {
            getBrowser().to(this)
            loginForm.loginField.value(username)
            loginForm.passwordField.value(password)
        })
    }

    void authorizeInCbs(Browser browser, String username, String password) {
        fillCredentialsForm(username, password)
        LoginToCbsTest.clickLoginButton(browser)
    }

    void iAmSuccesfulAuthorizedInCbs(Browser browser, String username, String password) {
        fillCredentialsForm(username, password)
        LoginToCbsTest.clickLoginButton(browser)
        LoginToCbsTest.waitTopToolBar(browser, 60)
    }

    void getErrorMessage() {
        drive(getBrowser(), {
            getBrowser().at(this)
            loginForm.error
        })
    }
}

