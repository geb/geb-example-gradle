package tests

import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import pages.MainPageCbs

@RunWith(JUnit4)
class CheckExistingInstitutionTest extends GebReportingTest{
    @Test
    void checkExistingInstitution() {
        MainPageCbs.iAmAuthorizedInCbs()
    }


}
