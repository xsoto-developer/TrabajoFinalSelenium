package pages.boliviamart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class PagoPage extends BasePage {

    private By pagoButton = By.xpath("//*[@id=\"panel-cart-total\"]/div/div/a");

    public PagoPage(WebDriver webDriver) {
        super(webDriver);
    }

    public PagoPage clickPagoButton(){
        WebElement element = webDriver.findElement(pagoButton);
        element.click();
        return new PagoPage(webDriver);
    }
}
