package ntn.pages;

import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


@DefaultUrl("https://shopee.vn/")
public class LoginShopee extends PageObject {

    @FindBy(css = "div._3Iaafj input[name=\"loginKey\"]")
    private WebElementFacade username;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private  WebElementFacade password;

    @FindBy(xpath = "//li[contains(@class,\"navbar__link navbar__link--account\") and contains(text(),\"Đăng nhập\")]")
    private  WebElementFacade loginItem;

    @FindBy(xpath = "//button[@class=\"_1BMmPI _37G57D _1qIIqG _3JP5il\"]")
    private WebElementFacade loginButton;

    public void start_login_page(){
       // Actions action=new Actions(getDriver());
      //  action.moveToElement(loginItem).click().build().perform();
        this.getDriver().manage().window().maximize();
        this.withAction().moveToElement(loginItem).click().build().perform();
        this.waitForPresenceOf("//div[@class=\"shopee-modal__content _2g2zXM\"]");
        //this.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //   this.clickOn(loginItem);
    }

    public void attempt_login() {
        this.clickOn(loginButton);
    }

    public void enter_value(String value1, String value2)
    {
        this.enter(value1).into(username);
        this.enter(value2).into(password);
    }




    public String getResult() {
        WebElementFacade result = find(By.xpath("//div[@class=\"shopee-drawer \"]//div[contains(@class,\"navbar__link-text\")]"));
        return result.getText();
    }
}