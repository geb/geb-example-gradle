import geb.Module

//Modules are reusable fragments that can be used across pages.
// Here we are using a module to model a dropdown menu
class ManualsMenuModule extends Module {

//  Content DSL.
    static content = {

//      Content definitions can use other content definitions to define relative content elements.
        toggle { $("div.menu a.apis") }
        linksContainer { $("#apis-menu") }
        links { linksContainer.find("a") }
    }

//  Modules can contain methods that allow to hide document structure details or interaction complexity.
    void open() {
        toggle.click()
        println("Toggle link")
        waitFor { !linksContainer.hasClass("animating") }

    }
}
