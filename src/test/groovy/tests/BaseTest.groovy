package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver

    @BeforeEach
    public classLevelSetup() {
        driver = new ChromeDriver()
    }

    @AfterEach
    public void teardown() {
        driver.quit()
    }
}
