/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/#configuration
*/

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions

waiting {
    timeout = 2
}

environments {

    chrome {
        driver = { new ChromeDriver() }
    }

    chromeHeadless {
        driver = {
            ChromeOptions o = new ChromeOptions()
            o.setBinary(new File("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"))
            o.addArguments('headless')
            new ChromeDriver(o)
        }
    }
}
reportsDir = new File("target/runtime_reports_dir")
baseUrl = "https://test.bocbs.cardpay-test.com/"
