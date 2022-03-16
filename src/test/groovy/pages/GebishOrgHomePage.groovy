package pages

import geb.Page
import modules.ManualsMenuModule

class GebishOrgHomePage extends Page {

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module(ManualsMenuModule) }
    }
}
