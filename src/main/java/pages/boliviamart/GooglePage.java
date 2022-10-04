package pages.boliviamart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class GooglePage extends BasePage {

//    private By searchInput = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
    private By searchInput = By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");

//    private By searchButton = By.xpath("//header/div[3]/div[1]/div[3]/div[1]/button[1]");
//    private By selectFirstLink = By.xpath("//h3[contains(text(),'Lo encontré en Falabella.com')]");
    private By selectFirstLink = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3");

    public GooglePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void typeSearchName(String name){
        WebElement element = webDriver.findElement(searchInput);
        element.sendKeys(name);
        element.sendKeys(Keys.ENTER);
    }

    public GooglePage clickSelectFirstLink(){
        WebElement element = webDriver.findElement(selectFirstLink);
        element.click();
        return new GooglePage(webDriver);
    }

}
