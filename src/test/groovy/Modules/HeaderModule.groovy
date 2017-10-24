package Modules

import geb.Module

class HeaderModule extends Module {

    static content = {
        header { $("#header") }
        aboutLink { header.$("a", href: "/about") }
    }
}
