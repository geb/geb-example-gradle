package Pages

import Modules.HeaderModule
import Modules.TitleWithTextModule
import geb.Page

class AboutPage extends Page {

    static url = "/about"

    static at = {
        title == "Welcome to Vökuró"
        mainPanel.title.text() == "About this Demo"
    }

    static content = {
        header { module HeaderModule }
        mainPanel { module TitleWithTextModule }
    }
}