import geb.*

class GoogleResultsPage extends Page {
	static at = { title.endsWith("Google Search") }
	static content = {
		search { module GoogleSearchModule, buttonValue: "Search" }
		results { $("li.g") }
		result { i -> results[i] }
		resultLink { i -> result(i).find("a.l") }
	}
}