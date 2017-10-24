package Modules

import geb.Module

class TitleWithTextModule extends Module {

    static content = {
        title { $("h2") }
        mainText { $("#main-text") }
    }
}
