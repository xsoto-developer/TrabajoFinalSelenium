package pages.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class BolsaComprasPage extends BasePage {
    // Pagina producto - modal = Detalle del producto agragado a la bolsa
    private By bolsaCompraModal = By.xpath("//span[contains(text(),'Producto(s) agregado(s) a la bolsa de compras')]");
    // private By bolsaCompraModal = By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[1]/span/span");

    private By listGarantiaButton = By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/i");
//    private By listGarantiaButton = By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/i");

    // pagina producto - modal = Boton de gatantia de 1 año 1 año de Garantía Extendida $ 419.990
    private By garantiaButton = By.id("testId-InCart-inPDP-WarrantyOption-btn-0");
    // Option de boton seleccionado
    private By garantiaButtonSelected = By.xpath("//*[contains(@class, 'option-selected')]");

    // Boton ver  bolsa de compras
    //*[@id="__next"]/div/div/div/div/div/div/div[3]/div/div
    private By verBolsaComprasButton = By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div/div[3]/div/div");

    public BolsaComprasPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isBolsaComprasDisplayed(){
        WebElement element = webDriver.findElement(bolsaCompraModal);
        return element.isDisplayed();
    }

    public ProductoPage clickListGarantiaButton(){
        WebElement element = webDriver.findElement(listGarantiaButton);
        element.click();
        return new ProductoPage(webDriver);
    }

    public ProductoPage clickSelectGaratiaButton(){
        WebElement element = webDriver.findElement(garantiaButton);
        element.click();
        return new ProductoPage(webDriver);
    }

    public boolean isGarantiaButtonSelectedDisplayed(){
        WebElement element = webDriver.findElement(garantiaButtonSelected);
        return element.isDisplayed();
    }

    public ProductoPage clickVerBolsaComprasButton(){
        WebElement element = webDriver.findElement(verBolsaComprasButton);
        element.click();
        return new ProductoPage(webDriver);
    }

}
