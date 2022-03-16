package modules

import geb.Module

class CbsLoginPageModule extends Module {
    static content = {
        form { $("form") }
        loginField { form.$(id: "name") }
        passwordField { form.$(id: "password") }
        loginButton { form.$(name: "login") }
    }

}
