import geb.Page

class HomePage extends Page {

    static url = ""

    static at = { title == "Welcome to Vökuró" }

    static content = {
        visibleTitle { $("h1")}
    }

}