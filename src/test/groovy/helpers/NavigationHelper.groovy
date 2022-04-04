package helpers

import geb.Browser
import geb.Page
import geb.navigator.Navigator

import static geb.Browser.drive

 class NavigationHelper extends Page{

    void clickBy(Navigator navigator) {
        drive(getBrowser(), {
            getBrowser().to(this)
            navigator.click()
        })
    }

}
