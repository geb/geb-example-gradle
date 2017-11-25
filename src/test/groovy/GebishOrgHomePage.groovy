import geb.Page


class GebishOrgHomePage extends Page {

//    “at checkers” allow verifying that the browser is at the expected page.
    static at = { title == "Geb - Very Groovy Browser Automation" }

//  Include the previously defined module.
    static content = {
        manualsMenu { module(ManualsMenuModule) }
    }
}
