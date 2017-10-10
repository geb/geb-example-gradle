import geb.Page

class HomePage extends Page {

    static url = ""

    static at = { title.contentEquals("Welcome to Vökuró") }

}