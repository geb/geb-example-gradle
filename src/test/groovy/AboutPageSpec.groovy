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
}
