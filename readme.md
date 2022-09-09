# Example Geb and Gradle Project

[![Build Status][build_status]](https://circleci.com/gh/geb/geb-example-gradle/tree/master)

## Description

This is an example of incorporating Geb into a Gradle build. It shows the use of Spock and JUnit 4 tests.

The build is setup to work with Firefox and Chrome. Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

## Usage

The build is using a specific version of geckodriver and chromedriver which might seem outdated but are compatible with the versions of Firefox and Chrome installed in CI environments used by this project.
Prior to running any builds you might need to update `chromeDriverVersion` and `geckoDriverVersion` extension variables in `build.gradle` to a more recent ones and ones which are compatible with the versions of Chrome and Firefox in your environment.

The following commands will launch the tests with the individual browsers:

    ./gradlew chromeTest
    ./gradlew firefoxTest

To run with all, you can run:

    ./gradlew test

Replace `./gradlew` with `gradlew.bat` in the above examples if you're on Windows.

## Questions and issues

Please ask questions on [Geb user mailing list][mailing_list] and raise issues in [Geb issue tracker][issue_tracker].


[build_status]: https://circleci.com/gh/geb/geb-example-gradle/tree/master.svg?style=shield&circle-token=38eb8de9af8f889922b91624a7943c474c0c3617 "Build Status"
[mailing_list]: https://groups.google.com/forum/#!forum/geb-user
[issue_tracker]: https://github.com/geb/issues/issues
