package modules

import geb.Module

class MainPageCbsModule extends Module{
    static content = {
        mainMenu { $(id: "topToolbar-innerCt") }
    }
}
