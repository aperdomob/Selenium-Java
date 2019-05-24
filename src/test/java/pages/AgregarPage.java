package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgregarPage {

    private WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//div[@id='amasty-shopby-product-list']//ol/li[10]")
    private WebElement clickEnArticulo;

    @FindBy(css = ".price-wrapper .price")
    private WebElement articuloVisible;

    @FindBy(xpath= "//a[@href='#stores']")
    private WebElement linkStockTienda;


    public AgregarPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(this.driver, this);

    }

    public void seleccionarArticulo(){
        clickEnArticulo.click();

    }

    public void verStockEnTienda(){
        linkStockTienda.click();
    }

    public boolean articuloDisponible() {
        return articuloVisible.isDisplayed();
    }

    public boolean at() {
        return linkStockTienda.isDisplayed();

    }
}

