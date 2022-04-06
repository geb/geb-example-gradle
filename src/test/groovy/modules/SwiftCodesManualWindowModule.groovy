package modules

import geb.Module

class SwiftCodesManualWindowModule extends Module{
    static content = {
        mainPageBody { $("body.badBrowsers") }

        window { titleName ->
            def header = $('body.x-body').$('div.x-window').$('div.x-title-text', text: contains(titleName))
            header.empty ? header : header.parents('div.x-window')
        }

        button(required: false) { window, buttonTitle -> window.$('.x-btn').has('.x-btn-inner', innerHTML: contains(buttonTitle)) }
    }

}
