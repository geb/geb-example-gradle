import spock.lang.*
import geb.*
import geb.spock.*

class GoogleSpec extends GebReportingSpec {
		
	def "the first link should be wikipedia"() {
		when:
		to GoogleHomePage
		
		and:
		search.forTerm "wikipedia"

		then:
		at GoogleResultsPage

		and:
		firstResultLink.text() == "Wikipedia"

		when:
		firstResultLink.click()

		then:
		waitFor { at WikipediaPage }
	}
	
}