package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class User {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET api endpointss")
    public String setGetApiEndpointt() {
        return url + "auth/info";
    }

    @Step("I set GET api endpointsss")
    public String setGetApiEndpointtt() {
        return url + "auth/info";
    }

    @Step("I send GET HTTP requestt")
    public void sendGetHttpRequestt() {
        SerenityRest.given().get(setGetApiEndpointt());
    }
    @Step("I receive valid HTTP response code 2000")
    public void receiveValidHttp2000() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I send GET HTTP requesttt")
    public void sendGetHttpRequesttt() {
        SerenityRest.given().get(setGetApiEndpointtt());
    }
    @Step("I receive valid HTTP response code 4000")
    public void receiveValidHttp4000() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
