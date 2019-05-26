package runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserManager {
  public static final String CHROME = "chrome";
  public static final String FIREFOX = "firefox";

  public static WebDriver getBrowser(String browserName) {
    if (CHROME.equals(browserName)) {
      WebDriverManager.chromedriver().setup();
      return new ChromeDriver();
    }

    if (FIREFOX.equals(browserName)) {
      WebDriverManager.firefoxdriver().setup();
      return new FirefoxDriver();
    }

    WebDriverManager.chromedriver().setup();
    return new ChromeDriver();
  }
}
