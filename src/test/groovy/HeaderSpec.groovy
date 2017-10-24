import Pages.HomePage
import geb.spock.GebReportingSpec
import spock.lang.Issue
import spock.lang.Narrative
import spock.lang.Title

@Title("US4: web header")
@Narrative("""
As an Internet surfer
I want a header in public pages
So that I can navigate easily to all pages
""")
@Issue("https://trello.com/c/87HqKCDP")
class HeaderSpec extends GebReportingSpec {

    def "I have a header in Home page"() {
        given: "I am at Home page"
        to HomePage

        when: "I do nothing"
        true

        then: "I see a red header with Vokuro logo"
        // We won't check the "red" in CSS as example about what should be manually tested
        // (even if correct maybe it looks ugly, etc)
        header.brand.text() == "Vökuró"
        header.homeLink.text() == "Home"
        header.aboutLink.text() == "About"
    }
}
