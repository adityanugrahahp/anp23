package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.RegisterScreen;
import test.automation.pages.LoginScreen;

public class RegisterSteps {

    LoginScreen loginScreen = new LoginScreen();
    RegisterScreen registerScreen = new RegisterScreen();

    // As a user I want to register account with valid data

    @And("I click text register")
    public void ClickTextRegister() {
        registerScreen.clickTextRegister();
    }

    @And("I input correct fullname in register")
    public void InputFieldFullname() {
        registerScreen.inputFieldFullName("adit");
    }

    @And("I input correct email in register")
    public void InputFieldEmail() {
        registerScreen.inputEmail("aditmobileaaaaaaaaaaaaaaaaa@mail.com");
    }

    @And("I input correct password in register")
    public void InputFieldPassword() {
        registerScreen.inputPassword("adit123");
    }

    @And("I click register button")
    public void ClickRegisterButton() {
        registerScreen.clickButtonRegister();
    }

    @Then("I get result message in register")
    public void Get() {
        registerScreen.verifyAlertButton();

    }

    // As a user I want to register account with invalid fullname

    @And("I input invalid fullname in register")
    public void InputInvalidFieldFullname() {
        registerScreen.inputFieldFullName("adity123");
    }

    // Scenario Outline: As a user i want to register account with invalid email//

    @And("I input invalid email in register")
    public void InputInvalidFieldEmail() {
        registerScreen.inputEmail("aditgmailcom");
    }

    @Then("I should be redirected to product list")
    public void validateRegisterSuccess() {
        loginScreen.isDisplayedHeaderProduct();

    }

    // As a user I want to register account with invalid password

    @And("I input invalid password in register")
    public void InputInvalidFieldPassword() {
        registerScreen.inputPassword("adit1");
    }

    // As a user I want to register account without using password

    @And("I not input password in register")
    public void InputEmptyFieldEmail() {
        registerScreen.inputPassword("");

    }

    @Then("I get result empty password message in register")
    public void GetTheEmptyPassword() {
        loginScreen.verifyAlertPassword();

    }

}
