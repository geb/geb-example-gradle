package modules

import geb.Module

class CbsLoginPageModule extends Module {
    static content = {
        form { $("form") }
        loginField { form.$(id: "name") }
        passwordField { form.$(id: "password") }
        loginButton { form.$(name: "login") }

        error { $("div", innerHTML: contains("Invalid username or password.")) }
    }
}
