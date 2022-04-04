package modules

import geb.Module

class CbsLoginPageModule extends Module {

    static public content = {
        form { $("form") }
        loginField { form.$(id: "name") }
        passwordField { form.$(id: "password") }

        error { $("div", innerHTML: contains("Invalid username or password.")) }
    }
}
