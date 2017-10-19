import Pages.HomePage
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

    def "Correct informative section one called Awesome Section"() {

        given: "I am at Home page"
        to HomePage

        when: "Always"
        true

        then: "I see section with title #expectedSectionTitle"
        assert awesomeSection.title.text() == expectedSectionTitle

        and: "I see some Lorem Ipsum content"
        assert awesomeSection.text().contains(expectedSectionContent)

        and: "This content has gray background"
        assert awesomeSection.children()*.hasClass("well")

        where:
        expectedSectionTitle | expectedSectionContent
        "Awesome Section"    | "Cum sociis natoque penatibus"
    }

    def "Correct informative section two called Important Stuff"() {

        given: "I am at Home page"
        to HomePage

        when: "Always"
        true

        then: "I see section with title #expectedSectionTitle"
        assert importantStuff.title.text() == expectedSectionTitle

        and: "I see some Lorem Ipsum content"
        assert importantStuff.text().contains(expectedSectionContent)

        where:
        expectedSectionTitle | expectedSectionContent
        "Important Stuff"    | "Cum sociis natoque penatibus"
    }

    def "Correct informative section three called Example Addresses"() {

        given: "I am at Home page"
        to HomePage

        when: "Always"
        true

        then: "I see section with title #expectedAddressesSectionTitle"
        assert exampleAddresses.title.text() == expectedAddressesSectionTitle

        and: "I see the correct first subsection title with #expectedOfficeAddressTitle"
        assert officeAddressTitle.text() == expectedOfficeAddressTitle

        and: "I see the correct first subsection title #expectedOfficeAddress"
        assert officeAddress.text().contains(expectedOfficeAddress)

        and: "I see the correct second subsection title #expectedInternetAddressTitle"
        assert internetAddressTitle.text() == expectedInternetAddressTitle

        and: "I see the correct second subsection content with email #expectedInternetAddress"
        assert internetAddress.text().contains(expectedInternetAddress)

        where:
        expectedAddressesSectionTitle = "Example Addresses"
        expectedOfficeAddressTitle = "Vokuri, Inc."
        expectedOfficeAddress = "456 Infinite Loop, Suite 101"
        expectedInternetAddressTitle = "Full Name"
        expectedInternetAddress = "vokuro@phalconphp.com"
    }
}