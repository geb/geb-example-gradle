/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
	timeout = 5
	includeCauseInMessage = true
}

atCheckWaiting = true

environments {
	
	// run via “./gradlew chromeTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = {
			def driverInstance = new ChromeDriver()
			driverInstance.manage().window().maximize()
			driverInstance
		}
	}

	// run via “./gradlew chromeHeadlessTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chromeHeadless {
		driver = {
			ChromeOptions o = new ChromeOptions()
			o.addArguments('headless')
			def driverInstance = new ChromeDriver(o)
			driverInstance.manage().window().maximize()
			driverInstance
		}
	}
	
	// run via “./gradlew firefoxTest”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		driver = {
			def driverInstance = new FirefoxDriver()
			driverInstance.manage().window().maximize()
			driverInstance
		}
	}

}
// To run the tests with all browsers just run “./gradlew test”

baseUrl = System.getProperty('geb.build.baseUrl') ?: 'http://localhost'
