package pages.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class MedioPagoPage extends BasePage {

    private By medioPagoText = By.xpath("/html/body/div[3]/div[1]/div[1]/h2");
    //    private By giftCardButton = By.xpath("//*[@id=\"fbra_checkoutAddGiftCard\"]/div/div");
//    private By giftCardButton = By.xpath("//*[@id=\"fbra_checkoutAddGiftCard\"]/div/div/div/a");
    private By giftCardButton = By.xpath("//body/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]");

    private By giftCardNumber = By.id("giftCardNumber");
//    private By giftCardNumber = By.xpath("//input[@id='giftCardNumber']");

    private By giftCardSecurityCode = By.id("giftCardSecurityCode");
//    private By giftCardSecurityCode = By.id("//input[@id='giftCardSecurityCode']");

    private By agregarButton = By.xpath("//button[contains(text(),'AGREGAR')]");

    public MedioPagoPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isMedioPagoDisplayed(){
        WebElement element = webDriver.findElement(medioPagoText);
        return element.isDisplayed();
    }

    public ProductoPage clickGiftCardButton(){
        WebElement element = webDriver.findElement(giftCardButton);
        element.click();
        return new ProductoPage(webDriver);
    }

    public void typeGiftCardNumber(String giftCardNumero){
        WebElement element = webDriver.findElement(giftCardNumber);
        element.sendKeys(giftCardNumero);
    }

    public void typeGiftCardSecurityCode(String giftCardCode){
        WebElement element = webDriver.findElement(giftCardSecurityCode);
        element.sendKeys(giftCardCode);
    }

    public ProductoPage clickAgregarButton(){
        WebElement element = webDriver.findElement(agregarButton);
        element.click();
        return new ProductoPage(webDriver);
    }

}
