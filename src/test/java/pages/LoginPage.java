package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement usernameTextField;

    @FindBy(id="txtPassword")
    public WebElement passwordTextField;

    @FindBy(id="btnLogin")
    public WebElement loginButton;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

}
/*
//config -> new -> file (config.properties)
//features -> new -> file (login.feature)
//test

username = admin
password = Hum@nhrm123

 */