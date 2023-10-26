package starter.altashop.authentication.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserInformationInvalidMethod {
    protected static String url = "https://altashop-api.fly.dev/api/auth/info";
    @Step("I set GET user information invalid method")
    public String setPostUserInformationInvalidMethod(){
        return url;
    }

    @Step("I send GET HTTP request user information invalid method")
    public void sendPostHttpRequestUserInformationInvalidMethod(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .put(setPostUserInformationInvalidMethod());
    }

    @Step("I receive response code 405 for Get user information invalid method")
    public void responseCode405UserInformationInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

