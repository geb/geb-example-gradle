import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class GebishOrgTest extends GebReportingTest {

    @Test
    void canGetToTheCurrentBookOfGeb() {
        to GebishOrgHomePage

        manualsMenu.open()

        //first link is for the current manual
        assert manualsMenu.links[0].text().startsWith("current")

        manualsMenu.links[0].click()

        at TheBookOfGebPage
    }

}