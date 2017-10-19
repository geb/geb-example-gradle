package modules

import geb.Module

class PageSectionModule extends Module {

    def index

    static content = {
        section { $("#section-$index") }
        title { section.$("h3") }
    }
}
