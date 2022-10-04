package pages.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DetalleProductoPage extends BasePage {
    ////// DetalleProductoPage
//    private By descriptionProduct = By.xpath("//*[@id=\"breadcrumb\"]/ol/li[3]/a");
    private By descriptionProduct = By.xpath("//a[contains(text(),'Consolas de Videojuegos')]");

    //a[contains(text(),'Consolas de Videojuegos')]

    // Pagina producto - Boton de AGRGAR A LA BOLSA
    private By agregarBolsaButton = By.xpath("//button[contains(text(),'Agregar a la Bolsa')]");

    public DetalleProductoPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isDescriptionProductDisplayed(){
        WebElement element = webDriver.findElement(descriptionProduct);
        return element.isDisplayed();
    }

    public ProductoPage clickAgregarBolsaButton(){
        WebElement element = webDriver.findElement(agregarBolsaButton);
        element.click();
        return new ProductoPage(webDriver);
    }
}
