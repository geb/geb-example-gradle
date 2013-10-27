This is an example of incorporating Geb into a Gradle build. It shows the use of Spock and JUnit 4 tests.

The build is setup to work with HTMLUnit, FireFox and Chrome. Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

The following commands will launch the tests with the individual browsers:

    ./gradlew chromeTest
    ./gradlew firefoxTest

Note: To run tests in Chrome, you will need to download and configure the [ChromeDriver](https://code.google.com/p/selenium/wiki/ChromeDriver) library.

To run with all, you can run:

    ./gradlew test
