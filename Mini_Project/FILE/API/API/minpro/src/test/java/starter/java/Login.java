package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Login {

    protected String url = "https://altashop-api.fly.dev/api/";


    @Step("I set POST api endpoints")
    public String setPostApiEndpoint() {
        return url + "auth/login";
    }

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone@mail.com");
        requestBody.put("password", "123123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void receiveValidHttp200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send POST HTTP request1")
    public void sendPostHttpRequest1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "123123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response code 400")
    public void receiveValidHttp400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send POST HTTP request2")
    public void sendPostHttpRequest2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone@mail.com");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response code 4002")
    public void receiveValidHttp4002() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send POST HTTP request3")
    public void sendPostHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("", "");
        requestBody.put("", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint());
    }
    @Step("I receive valid HTTP response code 4003")
    public void receiveValidHttp4003() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send POST HTTP request4")
    public void sendPostHttpRequest4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint());
    }
    @Step("I receive valid HTTP response code 4004")
    public void receiveValidHttp4004() {
        restAssuredThat(response -> response.statusCode(400));
    }
}
