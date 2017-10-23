package Modules

import geb.Module

class PageSectionModule extends Module {

    def index

    static content = {
        section { $("#section-$index") }
        visibleTitle { section.$("h3") }
    }
}
