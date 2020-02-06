package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signInPage {

    private WebDriver driver;
    signInPage sip = new signInPage();


    public void signInMethod(){

        @FindBy(css="[formcontrolname=\"username\"]")
        private WebElement inputUserName;

        @FindBy(css="[formcontrolname=\"password\"]")
        private WebElement inputPassword;

        @FindBy(css="button[aria-label=\"LOGIN\"]")
        private WebElement buttonLogin;

        public void typeInInputUsarname(){
            inputUserName.sendKeys("");


        }
}
