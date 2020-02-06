package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public abstract class AbstractClass {

/*

abstract class create

pass the parameters

use it in the step definitions

FindAll

 */

/*

abstract class create

   clickFunction
        click on element

 */


    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait =new WebDriverWait( driver,10 );

    public void clickFunction(WebElement clickElement){

        wait.until( ExpectedConditions.elementToBeClickable(clickElement) );
        clickElement.click();

    }

    public void sendkeysFunction(WebElement sendkeysElement , String value){

        wait.until( ExpectedConditions.visibilityOf( sendkeysElement ) );
        sendkeysElement.sendKeys( value );

    }

    public void verifyCreated(List<WebElement> tableList, String value ){

        boolean result = false;
        System.out.println(tableList.size());
        for(int i = 0; i<tableList.size() ; i++){
            System.out.println(tableList.get( i ).getText()+" list names ");
            if(tableList.get( i ).getText().trim().equalsIgnoreCase( value )){
                result = true;
                break;
            }
        }

        System.out.println(result + " resukt is here ");
        if(result==false){
            Assert.fail(  );
        }else{
            System.out.println(value + " is displayed");
        }

    }

    public void waitUntilVisibility(WebElement waitElement){
        wait.until( ExpectedConditions.visibilityOf( waitElement ) );
    }

    public void waitUntilInVisibility(WebElement waitElement){

        try {
            wait.until( ExpectedConditions.invisibilityOf( waitElement ) );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void deleteFunctionality(List<WebElement>name, List<WebElement>deleteButton, String value,WebElement buttonYes){

    for (int i= 0; i<name.size(); i++){
        if(name.get(i).getText().equalsIgnoreCase(value)){

            clickFunction(deleteButton.get(i));
            clickFunction(buttonYes);
        }
    }

}}