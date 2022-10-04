package pages.boliviamart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CarritoComprasPage extends BasePage {
    // Pagina producto - modal = Detalle del producto agragado a la bolsa
    private By carritoCompraDetail = By.xpath("//span[contains(text(),'ha sido agregado a tu carro de compras.')]");
    // Boton ver  bolsa de compras
    private By aniadirCarritoButton = By.xpath("//*[@id=\"product-4207\"]/div[1]/div/div[2]/form/button");

    private By verCarritoButton = By.xpath("//*[@id=\"product-4207\"]/div[1]/div/div[2]/form/a");

    public CarritoComprasPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isCarritoCompraDetailDisplayed(){
        WebElement element = webDriver.findElement(carritoCompraDetail);
        return element.isDisplayed();
    }
//
    public CarritoComprasPage clickAniadirCarritoButton(){
        WebElement element = webDriver.findElement(aniadirCarritoButton);
        element.click();
        return new CarritoComprasPage(webDriver);
    }

    public CarritoComprasPage clickVerCarritoButton(){
        WebElement element = webDriver.findElement(verCarritoButton);
        element.click();
        return new CarritoComprasPage(webDriver);
    }

//    public pages.falabella.ProductoPage clickSelectGaratiaButton(){
//        WebElement element = webDriver.findElement(garantiaButton);
//        element.click();
//        return new pages.falabella.ProductoPage(webDriver);
//    }

//    public boolean isGarantiaButtonSelectedDisplayed(){
//        WebElement element = webDriver.findElement(garantiaButtonSelected);
//        return element.isDisplayed();
//    }
//
//    public CarritoComprasPage clickVerBolsaComprasButton(){
//        WebElement element = webDriver.findElement(verBolsaComprasButton);
//        element.click();
//        return new CarritoComprasPage(webDriver);
//    }

}
