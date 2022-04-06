package pages

import geb.Browser
import geb.Page
import geb.navigator.Navigator
import modules.MainPageCbsModule
import modules.SwiftCodeCreationWindow
import modules.SwiftCodesManualWindowModule

class MainPageCbs extends Page {

    static at = { waitFor { title == "CBS"} }

    static content = {
        mainMenu { module MainPageCbsModule }
        swiftCodesManualWindowModule { module SwiftCodesManualWindowModule }
        swiftCodeCreationWindow { module SwiftCodeCreationWindow }

        window { String titleName ->
            def header = $('body.x-body').$('div.x-window').$('div.x-title-text', text: contains(titleName))
            header.empty ? header : header.parents('div.x-window')
        }

        button { Navigator window, String buttonTitle -> window.$('.x-btn').has('.x-btn-inner', innerHTML: contains(buttonTitle)) }



    }













    void goToInstitutionsWindow() {
        Browser.drive(getBrowser(), {
            getBrowser().to(this)
            MainPageCbsModule.documents.click()
        })
    }
}