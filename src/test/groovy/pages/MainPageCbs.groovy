package pages

import geb.Browser
import geb.Page
import modules.MainPageCbsModule

import static geb.Browser.drive

class MainPageCbs extends Page {

    static at = { waitFor { title == "CBS" } }

    static content = {
        topTolbar { module(MainPageCbsModule) }
    }

    void verifyPageIsDisplayed() {
        drive(getBrowser(), {
            getBrowser().to(this)
            waitFor(60) { topTolbar.mainMenu }
        })
    }

    void iAmLoginedToCbs(Page cbsLoginPage, Page mainPageCbs) {
        drive(getBrowser(), {
            getBrowser().to(this)

            if (!topTolbar.mainMenu.isDisplayed()) {
                return
            }

            go(browser.getConfig().getRawConfig().baseUrl as String)
            //go to mainpage
            //go to loginpage
            //loginToCbs()

            verifyPageIsDisplayed()

        })
    }


}
