package modules

import geb.Module

class MainPageCbsModule extends Module{
    static content = {
        mainMenu { $(id: "topToolbar-innerCt") }
        documents { $("div.x-docked-noborder-bottom").$("a", innerHTML: contains("Documents")) }

    }
}
