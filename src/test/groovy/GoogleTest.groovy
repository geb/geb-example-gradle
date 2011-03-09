import geb.*
import geb.junit4.*
import org.junit.Test

import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class GoogleTest extends GebReportingTest {
	
	File getReportDir() {
		new File("build/reports/geb-reports")
	}
	
	@Test 
	void theFirstLinkShouldBeWikipedia() {
		to GoogleHomePage
		
		// enter wikipedia into the search field
		search.field.value("wikipedia")

		// wait for the change to results page to happen
		// (google updates the page without a new request)
		waitFor { at(GoogleResultsPage) }

		// is the first link to wikipedia?
		assert resultLink(0).text() == "Wikipedia"

		// click the link
		resultLink(0).click()

		// wait for Google's javascript to redirect us
		// to wikipedia
		waitFor { at(WikipediaPage) }
	}
	
}