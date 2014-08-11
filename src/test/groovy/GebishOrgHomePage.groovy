import geb.Page

class GebishOrgHomePage extends Page {

    static url = "http://gebish.org"
    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module MenuModule, $("#header-content ul li", 0) }
    }
}
