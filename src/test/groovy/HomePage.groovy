import geb.Page
import modules.PageSectionModule

class HomePage extends Page {

    static url = ""

    static at = { title == "Welcome to Vökuró" }

    static content = {
        pageVisibleTitle { $("h1")}
        pageSubtitle { $("#subtitle")}

        pageSection1 { module new PageSectionModule(index: "1") }
    }
}