package modules

import geb.Module

class SwiftCodeCreationWindow extends Module{
    static content = {
        mainPageBody { $("body.badBrowsers") }
    }
}
