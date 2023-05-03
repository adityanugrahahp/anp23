package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Register {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpointsa")
    public String setPostApiEndpointa() {
        return url + "auth/register";
    }

    @Step("I send POST HTTP requesta")
    public void sendPostHttpRequesta() {
        JSONObject requestBody = new JSONObject();
        // GANTI SETIAP RUN
        requestBody.put("email", "adussadsssaasssfasstttaa@gmail.com");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "aditya nugraha perdana");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointa());
    }

    @Step("I receive valid HTTP response code 200a")
    public void receiveValidHttp200a() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send POST HTTP requestb")
    public void sendPostHttpRequestb() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "aditya@gmail.com");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointa());
    }

    @Step("I receive valid HTTP response code 400b")
    public void receiveValidHttp400b() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send POST HTTP requestc")
    public void sendPostHttpRequestc() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "aditya nugraha perdana");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointa());
    }

    // @Step("I receive valid HTTP response code 400c")
    // public void receiveValidHttp400c() {
    // restAssuredThat(response -> response.statusCode(400));
    // }

    @Step("I send POST HTTP requestd")
    public void sendPostHttpRequestd() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "aditya@gmail.com");
        requestBody.put("password", "");
        requestBody.put("fullname", "aditya nugraha perdana");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointa());
    }
    // @Step("I receive valid HTTP response code 400d")
    // public void receiveValidHttp400d() {
    // restAssuredThat(response -> response.statusCode(400));
    // }

    @Step("I send POST HTTP requeste")
    public void sendPostHttpRequeste() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone@mail.com");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "Firstname Lastname");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointa());
    }
    // @Step("I receive valid HTTP response code 400e")
    // public void receiveValidHttp400e() {
    // restAssuredThat(response -> response.statusCode(400));
    // }
}
