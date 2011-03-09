import spock.lang.*
import geb.*
import geb.spock.*

class GoogleSpec extends GebReportingSpec {
	
	File getReportDir() {
		new File("build/reports/geb-reports")
	}
	
	def "the first link should be wikipedia"() {
		when:
		to GoogleHomePage
		
		and:
		// enter wikipedia into the search field
		search.field.value("wikipedia")

		then:
		// wait for the change to results page to happen
		// (google updates the page without a new request)
		waitFor { at(GoogleResultsPage) }

		and:
		// is the first link to wikipedia?
		resultLink(0).text() == "Wikipedia"

		when:
		// click the link
		resultLink(0).click()

		then:
		// wait for Google's javascript to redirect us
		// to wikipedia
		waitFor { at(WikipediaPage) }
	}
	
}