package Pages

import Modules.PageSectionModule
import geb.Page

class HomePage extends Page {

    static url = ""

    static at = {
        title == "Welcome to Vökuró"
        pageVisibleTitle.text() == "Welcome!"
    }

    static content = {
        publicHeader { $("#header") }
        aboutLink { publicHeader.$("a", href: "/about") }

        pageVisibleTitle { $("h1") }
        pageSubtitle { $("#subtitle") }

        pageSection { indexValue -> module new PageSectionModule(index: indexValue) }
        awesomeSection { pageSection("1") }
        importantStuff { pageSection("2") }
        exampleAddresses { pageSection("3") }
        officeAddress { exampleAddresses.$("address")[0] }
        officeAddressTitle { officeAddress.$("strong") }
        internetAddress { exampleAddresses.$("address")[1] }
        internetAddressTitle { internetAddress.$("strong") }
    }
}