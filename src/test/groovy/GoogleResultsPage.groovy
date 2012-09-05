import geb.*

class GoogleResultsPage extends Page {
    static at = { results }
    static content = {
        results(wait: true) { $("li.g") }
        result { i -> results[i] }
        resultLink { i -> result(i).find("a.l")[0] }
        firstResultLink { resultLink(0) }
    }
}