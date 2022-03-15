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

baseUrl = "http://gebish.org"
