package pages.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DetalleBolsaComprasPage extends BasePage {
    //Detalle bolsa de compras
    //*[@id="root"]/div[2]/div[1]/div[2]/span[1]
    private By bolsaComprasText = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/span[1]");

    // Boton Ir a Comprar
    private By irAComprarButton = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button");

    public DetalleBolsaComprasPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isVerBolsaComprasDisplayed(){
        WebElement element = webDriver.findElement(bolsaComprasText);
        return element.isDisplayed();
    }

    public ProductoPage clickIrAComprarButton(){
        WebElement element = webDriver.findElement(irAComprarButton);
        element.click();
        return new ProductoPage(webDriver);
    }

}
