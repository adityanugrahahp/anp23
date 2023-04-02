package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Put {
    protected static String url = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set PUT endpoints")
    public String setPutEndpoints(){
        return url + "users/2";
    }
    @Step("I send PUT HTTP request")
    public void putHTTPrequest(){
        SerenityRest.given().when().get(setPutEndpoints());
    }
    @Step("I receive valid HTTP response code 200")
    public void HTTPresponse200(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I update the data")
    public void validPutData(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(1)));

    }

}
