package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Register {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints register")
    public String setPostApiEndpointRegister() {
        return url + "auth/register";
    }

    ///POSITIF
    @Step("I send POST HTTP request register")
    public void sendPostHttpRequestRegister() {
        JSONObject requestBody = new JSONObject();

        // GANTI SETIAP RUN
        requestBody.put("email", "adityaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaci@gmail.com");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "aditya nugraha perdana");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }


    ///NEGATIFFF
    @Step("I send POST HTTP request register2")
    public void sendPostHttpRequestRegister2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "aditya@gmail.com");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request register3")
    public void sendPostHttpRequestRegister3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "aditya nugraha perdana");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request register4")
    public void sendPostHttpRequestRegister4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "aditya@gmail.com");
        requestBody.put("password", "");
        requestBody.put("fullname", "aditya nugraha perdana");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request register5")
    public void sendPostHttpRequestRegister5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adit@gmail.com");
        requestBody.put("password", "adit123");
        requestBody.put("fullname", "adit");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }
//
//    ///GANTI SETIAP RUN
//    @Step("I send POST HTTP request register6")
//    public void sendPostHttpRequestRegister6() {
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("email", "aditaaaagmail.com");
//        requestBody.put("password", "adit123");
//        requestBody.put("fullname", "adit");
//
//        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
//    }
//
//    ///GANTI SETIAP RUN
//    @Step("I send POST HTTP request register7")
//    public void sendPostHttpRequestRegister7() {
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("email", "aditbaaa@gmail.com");
//        requestBody.put("password", " ");
//        requestBody.put("fullname", "adit");
//
//        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
//    }
//
//    ///GANTI SETIAP RUN
//    @Step("I send POST HTTP request register8")
//    public void sendPostHttpRequestRegister8() {
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("email", "aditcaaa@gmail.com");
//        requestBody.put("password", "adit123");
//        requestBody.put("fullname", " ");
//
//        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
//    }

    @Step("I receive valid HTTP response code 200 register")
    public void receiveValidHttp200Register() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response code 400 register")
    public void receiveValidHttp400Register() {
        restAssuredThat(response -> response.statusCode(400));
    }
}