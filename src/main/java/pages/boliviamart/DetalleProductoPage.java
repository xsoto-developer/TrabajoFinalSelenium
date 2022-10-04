package pages.boliviamart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DetalleProductoPage extends BasePage {
    ////// DetalleProductoPage
//    private By descriptionProduct = By.xpath("//*[@id=\"product-4207\"]/div[1]/div/div[2]/h2");
    private By descriptionProduct = By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[2]/p[1]");

    //a[contains(text(),'Consolas de Videojuegos')]


    private By aniadirCarritoButton =   By.xpath("//button[contains(text(),'Añadir al carrito')]");

    //*[@id="product-4207"]/div[1]/div/div[2]/form/button
    //*[@id="product-4207"]/div[1]/div/div[2]/form/button
    //button[contains(text(),'Añadir al carrito')]


    public DetalleProductoPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isDescriptionProductDisplayed(){
        WebElement element = webDriver.findElement(descriptionProduct);
        return element.isDisplayed();
    }

    public DetalleProductoPage clickAniadirCarritoButton(){
        try{
            WebElement element = webDriver.findElement(aniadirCarritoButton);
            element.click();

        }catch (Exception e){
            e.getMessage();
        }
        return new DetalleProductoPage(webDriver);
    }
}
