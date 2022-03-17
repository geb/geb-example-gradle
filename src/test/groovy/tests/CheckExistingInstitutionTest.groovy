package tests

import geb.Browser
import geb.junit5.GebReportingTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import io.github.bonigarcia.seljup.SeleniumJupiter;

import pages.CbsLoginPage
import pages.MainPageCbs
import static org.assertj.core.api.Assertions.*

class CheckExistingInstitutionTest extends GebReportingTest{
    @Test
    void checkExistingInstitution() {
        MainPageCbs.iAmAuthorizedInCbs()
    }


}
