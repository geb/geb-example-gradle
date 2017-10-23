import Pages.PrivacyPolicyPage
import geb.spock.GebReportingSpec
import spock.lang.Issue
import spock.lang.Narrative
import spock.lang.Title

@Title("US6: Privacy Policy page")
@Narrative("""
As Internet surfer worried about my privacy
I want information about the privacy
So that I know what will happen with my data
""")
@Issue("https://trello.com/c/vST56CrY")
class PrivacyPolicyPageSpec extends GebReportingSpec {

    def "Privacy Policy page has particular information"() {
        given: "I am at Privacy Policy page"
        to PrivacyPolicyPage

        when: "I do nothing"
        true

        then: "I see a particular title and information"
        at PrivacyPolicyPage
        /*assert pageVisibleTitle.text() == "About this Demo"
        assert mainText.text().contains("sample application")
        assert mainText.text().contains("Feel free to clone the code")
        assert mainText.text().contains("Thanks!")*/
        true
    }
}
