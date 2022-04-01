package pages

import geb.Browser
import geb.Page
import geb.navigator.DefaultNavigator
import geb.navigator.Navigator
import groovy.transform.CompileStatic
import modules.CbsLoginPageModule

import static geb.Browser.drive

class CbsLoginPage extends Page {
    static at = { title == "Log in to CBS" }

    static public content = {
        form { $("form") }
        loginForm { module(CbsLoginPageModule) }
    }



    void fillCredentialsForm(String username, String password) {
        drive(getBrowser(), {
            getBrowser().to(this)
            loginForm.loginField(form).value(username)
            loginForm.passwordField(form).value(password)
        })
    }

    void clickLoginButton() {
        drive(getBrowser(), {
            getBrowser().at(this)
            loginButton.click(MainPageCbs)
        })
    }

    static getLoginButton() {
     loginButton as DefaultNavigator
    }

    void authorizeInCbs(String username, String password) {
        fillCredentialsForm(username, password)
        clickLoginButton()
    }

    void iAmSuccessfulAuthorizeInCbs() {
        fillCredentialsForm("cbs-tester-1", "123_Qwerty")
        clickLoginButton()
        println("Text")
//        drive(getBrowser(), {
//            browser.createPage(MainPageCbs.class).verifyPageIsDisplayed()
//        })
    }

    void getErrorMessage() {
        drive(getBrowser(), {
            getBrowser().at(this)
            loginForm.error
        })
    }
}

