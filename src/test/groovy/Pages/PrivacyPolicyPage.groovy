package Pages

import geb.Page

class PrivacyPolicyPage extends Page {

    static url = "/privacy"

    static at = {
        title == "Welcome to Vökuró"
        pageVisibleTitle.text() == "Privacy"
    }

    static content = {
        publicHeader { $("#header") }
        aboutLink { publicHeader.$("a", href: "/about") }

        pageVisibleTitle { $("h2") }
        mainText { $("#main-text") }
    }
}