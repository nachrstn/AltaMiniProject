package starter.altashop.authentication.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostRegisterInvalidMethod {
    protected String url = "https://altashop-api.fly.dev/api/auth/register";

    @Step("I set POST Register invalid method")
    public String setPostRegisterInvalidMethod(){
        return url;
    }

    @Step("I send POST HTTP request Register invalid method")
    public void sendPostHttpRequestRegisterInvalidMethod(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akunbaru@gmail.com");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "akun baru");

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .put(setPostRegisterInvalidMethod());
    }

    @Step("I receive response code 405 for Register invalid method")
    public void responseCode405RegisterInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }


}

