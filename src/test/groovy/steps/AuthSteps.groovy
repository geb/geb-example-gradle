package steps

import pages.GebishOrgHomePage
import geb.Browser

//public static void gotoHomePage() {
//    to GebishOrgHomePage
//}

public static void gotoHomePage() {
    Browser.drive { go "http://gebish.org" }
}