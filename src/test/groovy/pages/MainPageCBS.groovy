package pages

import geb.Page
import modules.MainPageCbsModule

class MainPageCBS extends  Page{

    static content = {
        topTolbar { module(MainPageCbsModule) }
    }


}
