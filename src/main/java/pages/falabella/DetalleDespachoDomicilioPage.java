package pages.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DetalleDespachoDomicilioPage extends BasePage {

    private By irPagarText = By.xpath(" //*[@id=\"fbra_checkoutDeliveryActions\"]/div/div/span/div/div/div/div[1]/h1");
    private By continuarButton = By.xpath("//*[@id=\"fbra_checkoutDeliveryActions\"]/div/div/span/div/div/div/div[2]/button");

    public DetalleDespachoDomicilioPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isIrAPagarDisplayed(){
        WebElement element = webDriver.findElement(irPagarText);
        return element.isDisplayed();
    }

    public ProductoPage clickcontinuarButton(){
        WebElement element = webDriver.findElement(continuarButton);
        element.click();
        return new ProductoPage(webDriver);
    }

}
