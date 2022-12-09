package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class loginSteps extends CommonMethods {
    @Given("User Navigates To the URL")
    public void user_navigates_to_the_url() {
        openBrowserAndLaunchApplication();
    }
    @When("User Enters The correct UserName {string}")
    public void user_enters_the_correct_user_name(String string) {
        LoginPage login = new LoginPage();
        //   WebElement usernameField = driver.findElement(By.id("txtUsername"));
        // usernameField.sendKeys(ConfigReader.getPropertyValue("username"));
        //  sendText(login.usernameTextField, ConfigReader.getPropertyValue("username"));
        login.usernameTextField.sendKeys(string);
        //  WebElement passwordField = driver.findElement(By.id("txtPassword"));
        //    passwordField.sendKeys(ConfigReader.getPropertyValue("password"));

    }
    @When("User Enters The correct Password {string}")
    public void user_enters_the_correct_password(String string) {
        LoginPage login = new LoginPage();
        //sendText(login.passwordTextField, string);
        login.passwordTextField.sendKeys(string);
    }
    @When("user clicks On login button")
    public void user_clicks_on_login_button() {
        LoginPage login = new LoginPage();
        login.loginButton.click();
    }
    @Then("user is logged in")
    public void user_is_logged_in() {
        System.out.println("User is logged in successfully!");
    }

}
