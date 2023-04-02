package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Delete;

public class DeleteSteps {
    @Steps
    Delete delete;
    @Given("I set DELETE endpoints")
    public void setDeleteEndpoints(){
        delete.setDeleteEndpoints();

    }
    @When("I send DELETE HTTP request")
    public void deleteHTTPrequest(){
        delete.deleteHTTPrequest();

    }
    @Then("I receive valid HTTP response code 200")
    public void HTTPresponse200(){
        delete.HTTPresponse200();

    }
    @And("I receive valid data for detail data")
    public void validData(){
        delete.validData();
    }
}
