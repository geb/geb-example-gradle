package Pages

import Modules.TitleWithTextModule
import geb.Page

class AboutPage extends Page {

    static url = "/about"

    static at = {
        title == "Welcome to Vökuró"
        mainContent.pageVisibleTitle.text() == "About this Demo"
    }

    static content = {
        publicHeader { $("#header") }
        aboutLink { publicHeader.$("a", href: "/about") }

        mainContent { module TitleWithTextModule }
    }
}