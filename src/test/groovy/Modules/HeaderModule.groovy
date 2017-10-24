package Modules

import geb.Module

class HeaderModule extends Module {

    static content = {
        header { $("#header") }
        brand { header.$("a.brand") }
        homeLink { header.$("a", href: "/index") }
        aboutLink { header.$("a", href: "/about") }
    }
}
