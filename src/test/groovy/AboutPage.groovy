import geb.Page

class AboutPage extends Page {

    static url = "/about"

    static at = {
        title == "Welcome to Vökuró"
        pageVisibleTitle.text() == "About this Demo"
    }

    static content = {
        publicHeader { $("#header") }
        aboutLink { publicHeader.$("a", href: "/about") }

        pageVisibleTitle { $("h2") }
        pageText { $("#subtitle") }
    }
}