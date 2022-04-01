import geb.Browser
import org.junit.jupiter.api.BeforeEach
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions
import tests.BaseTest
import tests.LoginToCbsTest

waiting {
    timeout = 2
}

environments {
    driver = { new ChromeDriver() }
//    chrome {
//        driver = { new ChromeDriver() }
//    }

//    chromeHeadless {
//        driver = {
//            ChromeOptions o = new ChromeOptions()
//            o.addArguments('headless')
//            new ChromeDriver(o)
//        }
//    }
}
reportsDir = new File("target/runtime_reports_dir")
baseUrl = "https://test.bocbs.cardpay-test.com/"

