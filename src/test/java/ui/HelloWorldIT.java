package ui;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class HelloWorldIT {

    @Test
    public void verifyHomePage() throws Exception {

        String gridUrl = System.getProperty("grid.url", "http://localhost:4444");
        String baseUrl = System.getProperty("base.url", "http://localhost:9091/mvn-hello-world");

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL(gridUrl), options);

        driver.get(baseUrl);
        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}
