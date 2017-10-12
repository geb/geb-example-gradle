import geb.spock.GebReportingSpec
import spock.lang.Issue
import spock.lang.Narrative
import spock.lang.Title

@Title("US1: Basic Home Page")
@Narrative("""
As Internet surfer
I want a Home page
so that I can start using this web
""")
@Issue("https://trello.com/c/x9lV0DqC")
class BasicHomePageSpec extends GebReportingSpec {

    def "Can get to the home page"() {
        given: "Always"
            true

        when: "Web surfer goes to our web"
            to HomePage

        then: "a Home Page is displayed with title #title"
            at HomePage
            visibleTitle.text() == title

        where:
            title = "Welcome!"
    }
}