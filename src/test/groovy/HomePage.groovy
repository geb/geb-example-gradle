import geb.Page

class HomePage extends Page {

    static url = "https://vokuro.phalconphp.com/"

    static at = { title.contentEquals("Welcome to Vökuró") }

}