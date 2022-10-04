package pages.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class OpcionesDespachoPage extends BasePage {
    private By opcionesDespachoText = By.xpath("/html/body/div[3]/div[1]/div[1]/h2");

    private By departamentoDespachoSelect= By.xpath("//select[@id=\"region\"]");

    private By ciudadDespachoSelect= By.xpath("//select[@id=\"ciudad\"]");

    private By barrioDespachoSelect= By.xpath("//select[@id=\"comuna\"]");

    private By continuarDespachoButton = By.xpath("//*[@id=\"fbra_checkoutRegionAndComuna\"]/div/section/section/form/div/div[4]/div/button");

    public OpcionesDespachoPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isOpcionesDespachoTextDisplayed(){
        WebElement element = webDriver.findElement(opcionesDespachoText);
        return element.isDisplayed();
    }

    public void selectDepartamentoDespacho(String name){
        Select select = new Select(webDriver.findElement(departamentoDespachoSelect));
        select.selectByVisibleText(name);
    }

    public void selectCiudadDespacho(String name){
        Select select = new Select(webDriver.findElement(ciudadDespachoSelect));
        select.selectByVisibleText(name);
    }

    public void selectBarrioDespacho(String name){
        Select select = new Select(webDriver.findElement(barrioDespachoSelect));
        select.selectByVisibleText(name);
    }

    public ProductoPage clickContinuarDespachoButton(){
        WebElement element = webDriver.findElement(continuarDespachoButton);
        element.click();
        return new ProductoPage(webDriver);
    }

}
