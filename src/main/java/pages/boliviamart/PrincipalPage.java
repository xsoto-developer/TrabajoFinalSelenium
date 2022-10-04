package pages.boliviamart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class PrincipalPage extends BasePage {

//    private By searchInput = By.id("testId-SearchBar-Input");
    private By searchInput = By.xpath("//header/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/span[1]/input[1]");
//    private By searchButton = By.xpath("//header/div[3]/div[1]/div[3]/div[1]/button[1]");
    private By searchButton = By.xpath("//*[@id=\"header\"]/div[2]/div/div[2]/div/form/div[1]/span[2]/button");
//    private By searchButton = By.xpath("//header/div[3]/div[1]/div[3]/div[1]/button[1]");
//    private By searchButton = By.xpath("//*[@id=\"testId-search-wrapper\"]/div/button");

    public PrincipalPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void typeProductName(String name){
        WebElement element = webDriver.findElement(searchInput);
        element.sendKeys(name);
    }

    public ProductoPage clickSearchButton(){
        WebElement element = webDriver.findElement(searchButton);
        element.click();
        return new ProductoPage(webDriver);
    }

    public ProductoPage search(String name){
        typeProductName(name);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return clickSearchButton();
    }



//    public ProductoPage clickOnLoginButton(){
//        WebElement element = webDriver.findElement(loginButton);
//        element.click();
//        return new EmployeePage(webDriver);
//    }

}
