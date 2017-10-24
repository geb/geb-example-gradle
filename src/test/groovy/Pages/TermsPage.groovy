package Pages

import Modules.HeaderModule
import Modules.TitleWithTextModule
import geb.Page

class TermsPage extends Page {

    static url = "/terms"

    static at = {
        title == "Welcome to Vökuró"
        mainPanel.title.text() == "Terms"
    }

    static content = {
        header { module HeaderModule }
        mainPanel { module TitleWithTextModule }
    }
}