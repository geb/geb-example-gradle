package modules

import geb.Module

class SwiftCodesManualWindowModule extends Module{
    static content = {
        mainPageBody { $("body.badBrowsers") }
    }

}
