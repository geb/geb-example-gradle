package Pages

import Modules.TitleWithTextModule
import geb.Page

class PrivacyPolicyPage extends Page {

    static url = "/privacy"

    static at = {
        title == "Welcome to Vökuró"
        mainContent.pageVisibleTitle.text() == "Privacy"
    }

    static content = {
        publicHeader { $("#header") }
        aboutLink { publicHeader.$("a", href: "/about") }

        mainContent { module TitleWithTextModule }
        visibleTitle { mainContent.pageVisibleTitle }
        mainText { mainContent.mainText }
    }

}