import geb.spock.GebSpec

class HomeSpec extends GebSpec {

    def "Can get to the home page"() {
        given:
        to HomePage

        when:
        true

        then:
        at HomePage
    }
}