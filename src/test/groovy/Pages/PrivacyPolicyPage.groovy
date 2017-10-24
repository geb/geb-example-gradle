package Pages

import Modules.HeaderModule
import Modules.TitleWithTextModule
import geb.Page

class PrivacyPolicyPage extends Page {

    static url = "/privacy"

    static at = {
        title == "Welcome to Vökuró"
        mainPanel.title.text() == "Privacy"
    }

    static content = {
        header { module HeaderModule }
        mainPanel { module TitleWithTextModule }
    }
}