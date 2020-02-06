package stepDefinition;

import Utilities.Driver;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class countrySteps {
    WebDriver driver;
    public void signInPage(){
        driver = Driver.getDriver();

    }
    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver(  );


        driver.get("https://test-basqar.mersys.io");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, )

    }

    @Given("^type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("nigeria_tenant_admin");
        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("TnvLOl54WxR75vylop2A");
        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();
        sip.signInMethod();

    }


    }
}
