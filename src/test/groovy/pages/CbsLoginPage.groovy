package pages

import geb.Browser
import geb.Page
import modules.CbsLoginPageModule

class CbsLoginPage extends Page {
    static at = { title == "Log in to CBS" }

    static content = {
        loginForm { module(CbsLoginPageModule) }
    }

    static void goToCBSPage() {
        Browser.drive {
            go(baseUrl)             //ToDo разобраться с переопределением baseUrl
        }
    }

    static fillCredentialsForm() {
        Browser.drive {
            to CbsLoginPage
            loginForm.loginField.value("cbs-tester-1")
            loginForm.passwordField.value("123_Qwerty")
        }
    }

    static void clickLoginButton() {
        Browser.drive {
            at CbsLoginPage
            loginForm.loginButton.click()
            waitFor(60) { MainPageCBS.topTolbar.mainMenu }
        }
    }



}
