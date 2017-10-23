package Modules

import geb.Module

class TitleWithTextModule extends Module {

    static content = {
        pageVisibleTitle { $("h2") }
        mainText { $("#main-text") }
    }
}
