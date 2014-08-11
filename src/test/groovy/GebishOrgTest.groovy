import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class GebishOrgTest extends GebReportingTest {

    @Test
    void canGetToTheCurrentBookOfGeb() {
        to GebishOrgHomePage

        //hover over to expand the menu
        interact {
            moveToElement(manualsMenu.toggle)
        }

        //first link is for the current manual
        assert manualsMenu.links[0].text().endsWith("- CURRENT")

        manualsMenu.links[0].click()

        at TheBookOfGebPage
    }

}