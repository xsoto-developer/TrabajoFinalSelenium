package pages.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class GiftcardMessagePage extends BasePage {

    //    private By giftcardText = By.xpath("//p[contains(text(),'Giftcard')]");
    private By giftcardText = By.xpath("//*[@id=\"fbra_notifications\"]/div/div/div/div/section");

    public GiftcardMessagePage(WebDriver webDriver) {
        super(webDriver);
    }
    public boolean isGiftcardTextDisplayed(){
        WebElement element = webDriver.findElement(giftcardText);
        return element.isDisplayed();
    }

}
