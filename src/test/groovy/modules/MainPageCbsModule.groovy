package modules

import geb.Module

class MainPageCbsModule extends Module{
    static content = {
        topToolBar { $(id: "topToolbar-innerCt") }
        mainPageBody { $("body.badBrowsers") }

        operations { mainPageBody.$('a', innerHTML: contains("Operations")) }
        documents { mainPageBody.$('a', innerHTML: contains("Documents")) }
        dictionaries { mainPageBody.$('a', innerHTML: contains("Dictionaries")) }

        institutions { mainPageBody.$('a', innerHTML: contains("Institutions")) }
        swiftCodesMenu { mainPageBody.$('a', innerHTML: contains("SWIFT codes")) }
        transactions { mainPageBody.$('a', innerHTML: contains("Transactions")) }
        swiftCodesManual { waitFor(5) { mainPageBody.$("a").$("span", innerHTML: contains("SWIFT codes manual")) }  }

        internalTransactions { mainPageBody.$(" x-box-item").$('a', innerHTML: contains("Internal")) }
    }
}
