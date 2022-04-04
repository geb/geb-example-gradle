package pages

import geb.Browser
import geb.Page
import modules.MainPageCbsModule

import static geb.Browser.drive

class MainPageCbs extends Page {

    static at = { waitFor { title == "CBS"} }

    static content = {
        topToolbar { module(MainPageCbsModule) }
    }

    void verifyPageIsDisplayed() {
        drive(getBrowser(), {
            getBrowser().to(this)
            waitFor(60) { topToolbar.mainMenu }
        })
    }

    void goToInstitutionsWindow() {
        drive(getBrowser(), {
            getBrowser().to(this)
            MainPageCbsModule.documents.click()

        })
    }
}