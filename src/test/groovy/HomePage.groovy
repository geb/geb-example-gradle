import geb.Page
import modules.PageSectionModule

class HomePage extends Page {

    static url = ""

    static at = { title == "Welcome to Vökuró" }

    static content = {
        pageVisibleTitle { $("h1")}
        pageSubtitle { $("#subtitle")}

        pageSection { indexValue -> module new PageSectionModule(index: indexValue) }
        pageSection1 { pageSection("1") }
        pageSection2 { pageSection("2") }
    }
}