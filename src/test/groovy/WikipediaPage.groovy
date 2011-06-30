import geb.*

class WikipediaPage extends Page {
	static at = { assert title == "Wikipedia"; true }
}