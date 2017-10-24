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
        assert mainPanel.title.text() == "Privacy"
        assert mainPanel.mainText.text().contains(
                "Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula ut id elit."
        )
        assert mainPanel.mainText.text().contains(
                "Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Donec sed odio dui."
        )
    }
}
