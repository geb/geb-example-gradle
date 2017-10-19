import Pages.AboutPage
import Pages.HomePage
import geb.spock.GebReportingSpec
import spock.lang.Issue
import spock.lang.Narrative
import spock.lang.Title

@Title("US3: About Page")
@Narrative("""
As an Internet Surfer
I want an About page
So that I know more about this web
""")
@Issue("https://trello.com/c/7PIVUNaw")
class AboutPageSpec extends GebReportingSpec {

    def "Can browse to the About page"() {
        given: "I am at Home page"
        to HomePage

        when: "I click on About link at header"
        aboutLink.click()

        then: "I am at About page"
        at AboutPage
    }

    def "About page has particular information"() {
        given: "I am at About page"
        to AboutPage

        when: "Always"
        true

        then: "I see a particular title and information"
        assert pageVisibleTitle.text() == "About this Demo"
        assert mainText.text().contains("sample application")
        assert mainText.text().contains("Feel free to clone the code")
        assert mainText.text().contains("Thanks!")
    }
}
