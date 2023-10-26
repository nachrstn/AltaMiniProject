package starter.altashop.authentication.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostRegisterInvalidPayload {
    protected String url = "https://altashop-api.fly.dev/api/auth/register";

    @Step("I set POST Register invalid payload")
    public String setPostRegisterInvalidPayload(){
        return url;
    }

    @Step("I send POST HTTP request Register invalid payload")
    public void sendPostHttpRequestRegisterInvalidPayload(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akunbaru@gmail.com");
        requestBody.put("password", 123123);
        requestBody.put("fullname", "akun baru");

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostRegisterInvalidPayload());
    }

    @Step("I receive response code 400 for Register invalid payload")
    public void responseCode400RegisterInvalidPayload(){
        restAssuredThat(response -> response.statusCode(400));
    }


}

