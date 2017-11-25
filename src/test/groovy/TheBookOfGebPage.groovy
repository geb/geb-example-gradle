import geb.Page

class TheBookOfGebPage extends Page {

//    Check that we are at The Book of Geb.
    static at = { title.startsWith("Overview (Groovy API for Geb 2.0)") }
}
