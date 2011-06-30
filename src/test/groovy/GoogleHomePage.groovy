import geb.*

class GoogleHomePage extends Page {
	static url = "http://google.com/ncr"
	static at = { title == "Google" }
	static content = {
		search { module GoogleSearchModule }
	}
}