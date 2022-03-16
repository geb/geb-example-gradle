package pages

import geb.Browser
import geb.Page
import modules.MainPageCbsModule

class MainPageCbs extends Page {

    static at = { waitFor { title == "CBS" } }

    static content = {
        topTolbar { module(MainPageCbsModule) }
    }

    static void verifyPageIsDisplayed() {
        Browser.drive {
            at MainPageCbs
            waitFor(60) {
                topTolbar.mainMenu
            }
        }
    }

//    static void iAmAuthorizedInCbs() {
//        at MainPageCBS
//        if(!topTolbar.mainMenu.isEmpty()) {
//            return
//        } else {
//            Browser.drive {
//                CbsLoginPage.goToCBSPage()
//                at CbsLoginPage
//                CbsLoginPage.authorizeInCbs("cbs-tester-1", "123_Qwerty")
//                mainPageCbsIsDisplays()
//            }
//        }
//    }
}
