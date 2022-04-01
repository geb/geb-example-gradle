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

    void iAmLoginedToCbs(Page cbsLoginPage, Page mainPageCbs) {
        drive(getBrowser(), {
            getBrowser().to(this)

            if (!$("#topToolbar").isEmpty()) {
                return
            }

            go(browser.getConfig().getRawConfig().baseUrl as String)
            go(baseUrl)
            CbsLoginPage.authorizeInCbs("cbs-tester-1", "123_Qwerty")
            verifyPageIsDisplayed()

        })
    }


    void goToInstitutionsWindow() {
        drive(getBrowser(), {
            getBrowser().to(this)


        })
    }
}