package pages

import geb.Browser
import geb.Page
import modules.MainPageCbsModule
import modules.SwiftCodeCreationWindow
import modules.SwiftCodesManualWindowModule

class MainPageCbs extends Page {

    static at = { waitFor { title == "CBS"} }

    static content = {
        mainMenu { module MainPageCbsModule }
        swiftCodesManualWindowModule { module SwiftCodesManualWindowModule }
        swiftCodeCreationWindow { module SwiftCodeCreationWindow }
    }

    void goToInstitutionsWindow() {
        Browser.drive(getBrowser(), {
            getBrowser().to(this)
            MainPageCbsModule.documents.click()
        })
    }
}