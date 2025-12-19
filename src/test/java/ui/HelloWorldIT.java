import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class HelloWorldIT {

  @Test
  public void verifyHomePage() throws Exception {

    String gridUrl = System.getProperty("grid.url");
    String baseUrl = System.getProperty("base.url");

    ChromeOptions options = new ChromeOptions();
    WebDriver driver = new RemoteWebDriver(new URL(gridUrl), options);

    driver.get(baseUrl);
    System.out.println("Title: " + driver.getTitle());

    driver.quit();
  }
}
