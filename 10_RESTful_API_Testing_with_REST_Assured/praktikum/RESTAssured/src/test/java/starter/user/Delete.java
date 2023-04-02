package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Delete {
    protected static String url = "https://jsonplaceholder.typicode.com/posts/1";
    @Step("I set DELETE endpoints")
    public String setDeleteEndpoints(){
        return url + "users/2";
    }
    @Step("I send DELETE HTTP request")
    public void deleteHTTPrequest(){
        SerenityRest.given().when().get(setDeleteEndpoints());
    }
    @Step("I receive valid HTTP response code 200")
    public void HTTPresponse200(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I deleted the data")
    public void validData(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(1)));

    }

}
