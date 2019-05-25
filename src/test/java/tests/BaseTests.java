package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.AgregarPage;
import pages.FiltrarPage;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;
import runner.BrowserManager;

public class BaseTests {


    public WebDriver driver;
    public HomePage homePage;
    public LoginPage loginPage;
    public FiltrarPage filtrarPage;
    public AgregarPage agregarPage;


    @BeforeTest
    @Parameters("browserName")
    public void setup(String browserName) {
        this.driver = BrowserManager.getBrowser(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.audiomusica.com/");


        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        filtrarPage = new FiltrarPage(driver);
        agregarPage = new AgregarPage(driver);
    }

    @AfterTest
    public void tearDownSuite() {
        if (driver != null) {
            driver.quit();
        }
    }
}
