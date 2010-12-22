import geb.*

class GoogleSearchModule extends Module {
	def buttonValue
	static content = {
		field { $("input", name: "q") }
		button(to: GoogleResultsPage) {
			$("input", value: buttonValue)
		}
	}
}