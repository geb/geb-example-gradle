import geb.*

class GoogleHomePage extends Page {
    static url = "http://google.com/ncr"
    static at = { title == "Googles" }
    static content = {
        search { module GoogleSearchModule }
    }
}