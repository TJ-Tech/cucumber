package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class leftNav {


    @FindBy(xpath="//span[text()='Discounts']")

    private WebElement discounts;

    public void clickOnDiscounts(){
        clickFunction(discounts);


    }

    private void clickFunction(WebElement discounts) {
    }
}
