package pages.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DespachoDomicilioPage extends BasePage {
    private By opcionesDespachoDomicilioText = By.xpath("/html/body/div[3]/div[1]/div[1]/h2");

    //    private By direccionInput = By.id("address");
    private By direccionInput = By.xpath("//input[@id='address']");

    //    private By apartamentInput = By.id("departmentNumber");
    private By apartamentInput = By.xpath("//input[@id='departmentNumber']");

    private By ingresarDireccionButton = By.xpath("//*[@id=\"fbra_checkoutDeliverAndCollect\"]/div/div/div[1]/div/div[2]/div/div/form/section/div/div[4]/button");

    public DespachoDomicilioPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isOpcionesDespachoDomicilioTextDisplayed(){
        WebElement element = webDriver.findElement(opcionesDespachoDomicilioText);
        return element.isDisplayed();
    }

    public void typeDireccion(String direccion){
        WebElement element = webDriver.findElement(direccionInput);
        element.sendKeys(direccion);
    }

//    public void typeDireccion(String direccion){
//        WebElement element = webDriver.findElement(direccionInput);
//        element.sendKeys(direccion);
//    }

    public void typeApartamento(String apartamento){
        WebElement element = webDriver.findElement(apartamentInput);
        element.sendKeys(apartamento);
    }

    public ProductoPage clickIngresarDireccionButton(){
        WebElement element = webDriver.findElement(ingresarDireccionButton);
        element.click();
        return new ProductoPage(webDriver);
    }

}
