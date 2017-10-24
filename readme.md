# Example Geb and Gradle Project

[![CircleCI](https://circleci.com/gh/gopejavi/geb-spock-e2e.svg?style=svg)](https://circleci.com/gh/gopejavi/geb-spock-e2e)

## Description

This is an example of incorporating Geb into a Gradle build. It shows the use of Spock and JUnit 4 tests.

The build is setup to work with Firefox and Chrome. Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

## Usage

The following commands will launch the tests with the individual browsers:

    ./gradlew chromeTest
    ./gradlew firefoxTest

To run with all, you can run:

    ./gradlew test

Replace `./gradlew` with `gradlew.bat` in the above examples if you're on Windows.

## Thanks

Thanks to Geb and the original base repo! https://github.com/geb/geb-example-gradle