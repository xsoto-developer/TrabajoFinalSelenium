package pages.boliviamart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class FacturacionPage extends BasePage {

    private By detalleFacturacionText = By.xpath("//h3[contains(text(),'Detalles de facturación')]");

    public FacturacionPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isDetalleFacturacionDisplayed(){
        WebElement element = webDriver.findElement(detalleFacturacionText);
        return element.isDisplayed();
    }
}
