import Pages.TermsPage
import geb.spock.GebReportingSpec
import spock.lang.Issue
import spock.lang.Narrative
import spock.lang.Title

@Title("US7: Terms page")
@Narrative("""
As Internet surfet willing to be a nice guy
I want a Terms page
So that I know some rules for using this site
""")
@Issue("https://trello.com/c/eobcRpAi")
class TermsPageSpec extends GebReportingSpec {

    def "Terms page has particular information"() {
        given: "I am at Terms Page"
        to TermsPage

        when: "I do nothing"
        true

        then: "I see a particular title and information"
        at TermsPage
        assert mainPanel.title.text() == "Terms"
        assert mainPanel.mainText.text().contains(
                "Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula ut id elit."
        )
        assert mainPanel.mainText.text().contains(
                "Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Donec sed odio dui."
        )
    }
}
