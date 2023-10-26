package starter.altashop.authentication.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostRegister {
    protected String url = "https://altashop-api.fly.dev/api/auth/register";

    @Step("I set POST endpoints Register")
    public String setPostRegisterEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Register")
    public void sendPostHttpRequestRegisterEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akunke8@gmail.com");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "akun baru");

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostRegisterEndpoint());
    }

    @Step("I receive response code 200 Register")
    public void responseCode200RegisterEndpoint(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for Register")
    public void receiveValidDataForRegister(){
        restAssuredThat(response -> response.body("data.Fullname", equalTo("akun baru")));
        restAssuredThat(response -> response.body("data.Email", equalTo("akunke8@gmail.com")));
    }
}
