package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Put;

public class PutSteps {
    @Steps
    Put put;
    @Given("I set PUT endpoints")
    public void setPutEndpoints(){
        put.setPutEndpoints();

    }
    @When("I send PUT HTTP request")
    public void putHTTPrequest(){
        put.putHTTPrequest();

    }
    @Then("I receive valid HTTP response code 200")
    public void HTTPresponse200(){
        put.HTTPresponse200();

    }
    @And("I update the data")
    public void validPutData(){
        put.validPutData();
    }
}
