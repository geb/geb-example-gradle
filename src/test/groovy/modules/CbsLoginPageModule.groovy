package modules

import geb.Module

class CbsLoginPageModule extends Module {
    static public content = {

        loginField { form -> form.$(id: "name") }
        passwordField { form -> form.$(id: "password") }
//        loginButton { form.$(name: "login") }
        loginButton { form -> form.$(name: "login") }

        error { $("div", innerHTML: contains("Invalid username or password.")) }
    }
}
