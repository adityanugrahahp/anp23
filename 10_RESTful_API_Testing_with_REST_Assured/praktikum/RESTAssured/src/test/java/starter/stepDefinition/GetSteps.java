package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;

public class GetSteps {
    @Steps
    Get get;
    @Given("I set GET endpoints")
    public void setGetEndpoints(){
        get.setGetEndpoints();

    }
    @When("I send GET HTTP request")
    public void getHTTPrequest(){
        get.getHTTPrequest();

    }
    @Then("I receive valid HTTP response code 200")
    public void HTTPresponse200(){
        get.HTTPresponse200();

    }
    @And("I receive valid data for detail data")
    public void validData(){
        get.validData();
    }
}
