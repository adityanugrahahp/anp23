package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.HomePage;
import starter.java.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    // Positive

    @Given("I am on the alta-shop login page")
    public void onTheLoginPage() {
        homePage.openPage();
    }

    @And("I enter correct email")
    public void inputEmail() {
        loginPage.inputEmail("adit@gmail.com");
    }

    @And("I enter correct password")
    public void inputPassword() {
        loginPage.inputPassword("adit123");
    }

    @When("I click on the login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to my alta-shop home page")
    public void validateOnHomePage() {
        homePage.validateOnHomePage();
    }

    // Negative

    @And("I enter incorrect password")
    public void inputIncorrectPassword() {
        loginPage.inputPassword("adit1");
    }

    @Then("I should see the error message")
    public void alertContent() {
        loginPage.incorrectAlert();
    }

    @And("I enter incorrect email")
    public void inputIncorrectEmail() {
        loginPage.inputEmail("adit1@gmail.com");
    }

    @And("I enter invalid email")
    public void inputIncnvalidEmail() {
        loginPage.inputEmail("adit");
    }

    @And("I enter empty email")
    public void inputEmptyEmail() {
        loginPage.inputEmail("");
    }

    @And("I enter empty password")
    public void inputEmptyPassword() {
        loginPage.inputPassword("");
    }

}
