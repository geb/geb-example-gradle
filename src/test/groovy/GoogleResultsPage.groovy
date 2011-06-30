import geb.*

class GoogleResultsPage extends Page {
	static at = { waitFor { title.endsWith("Google Search") } }
	static content = {
		search { module GoogleSearchModule }
		results { $("li.g") }
		result { i -> results[i] }
		resultLink { i -> result(i).find("a.l") }
		firstResultLink { resultLink(0) }
	}
}