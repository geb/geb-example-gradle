/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/configuration.html
*/


import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.firefox.internal.ProfilesIni
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.phantomjs.PhantomJSDriverService
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.chrome.ChromeDriver

waiting {
	timeout = 2
}

environments {
	// run via “./gradlew chromeTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}

	// run via “./gradlew firefoxTest”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		driver = { new FirefoxDriver() }
	}
	/*
	Firefox Driver setup to ignore SSL also if you want to be able to include/show this
	firefox {
	    driver = {
	        ProfilesIni allProfiles = new ProfilesIni();
	        FirefoxProfile profile = allProfiles.getProfile("geb");
	        if (profile == null) {
	            profile = new FirefoxProfile();
	        }
	        profile.setAcceptUntrustedCertificates(true)
	        profile.setAssumeUntrustedCertificateIssuer(true)
	        profile.setPreference("security.default_personal_cert", "Select Automatically")
	        new FirefoxDriver(profile)
	}
	*/
	phantom {
	    driver = {
	        def capabilities = new DesiredCapabilities()
	        //Set user-agent to Chrome or lots of things don't like phantomJS :)
	        capabilities.setCapability("phantomjs.page.settings.userAgent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/27.0.1453.93 Safari/537.36")
	        /*
	        //	These flags turn off all SSL errors - uncomment for this ability

	        capabilities.setCapability("acceptSslCerts", true);
	        capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, ["--web-security=false", "--ssl-protocol=any", "--ignore-ssl-errors=true"] as String[]);
	        */
	        new PhantomJSDriver(capabilities)
	    }
	}
}

// To run the tests with all browsers just run “./gradlew test”
