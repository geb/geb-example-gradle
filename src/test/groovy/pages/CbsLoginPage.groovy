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

    static fillCredentialsForm(String username, String password) {
        Browser.drive {
            to CbsLoginPage
            loginForm.loginField.value(username)
            loginForm.passwordField.value(password)
        }
    }

    static void clickLoginButton() {
        Browser.drive {
            at CbsLoginPage
            loginForm.loginButton.click()
        }
    }

    static authorizeInCbs(String username, String password) {
        fillCredentialsForm(username, password)
        clickLoginButton()
    }
}

