import Pages.AboutPage
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
        given: "I am at About page"
        to AboutPage

        when: "I do nothing"
        true

        then: "I am at About page"
        at AboutPage
    }

    def "About page has particular information"() {
        given: "I am at About page"
        to AboutPage

        when: "I do nothing"
        true

        then: "I see a particular title and information"
        at AboutPage
        assert mainPanel.title.text() == "About this Demo"
        assert mainPanel.mainText.text().contains(
                "This is a sample application for the Phalcon Framework. We expect to implement as many features as possible to show how the framework works and its potential. Please write us if you have any feedback or comments. Feel free to clone the code of this application here. The purpose of this application is merely academic. Thanks!."
        )
    }
}
