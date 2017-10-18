import geb.spock.GebReportingSpec
import spock.lang.Issue
import spock.lang.Narrative
import spock.lang.Title

@Title("US2: Home page information")
@Narrative("""
As Internet surfer
I want basic info in the Home page
So that I know what's for
""")
@Issue("https://trello.com/c/rzlnz5FX")
class HomePageInformationSpec extends GebReportingSpec {

    def "Correct subtitle"() {
        given: "I am at Home page"
        to HomePage

        when: "Always"
        true

        then: "I see an informative subtitle with text #expectedSubtitleText"
        assert pageSubtitle.text() == expectedSubtitleText

        where:
        expectedSubtitleText = "This is a website secured by Phalcon Framework"
    }

    def "Correct informative section one"() {

        given: "I am at Home page"
        to HomePage

        when: "Always"
        true

        then: "I see section with title #expectedSectionTitle"
        assert pageSection1.title.text() == expectedSectionTitle

        and: "I see some Lorem Ipsum content"
        assert pageSection1.text().contains(expectedSectionContent)

        and: "This content has gray background"
        assert pageSection1.children()*.hasClass("well")

        where:
        expectedSectionTitle    |   expectedSectionContent
        "Awesome Section"       |   "Cum sociis natoque penatibus"
    }
}
/*
AA2:
Given I am at Home page
When always
Then I see section with title "Awesome Section"
And some lorem ipsum text
And with gray background

AA3:
Given I am at Home page
When always
Then I see section with title "Important Stuff"
And some lorem ipsum text

AA4:
Given I am at Home page
When always
Then I see section with title "Example Adresses"
And a subsection called "Vokuri, Inc." with address and Phone
And a subsection called "Full Name" with a contact email
*/