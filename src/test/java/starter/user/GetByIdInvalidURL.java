package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetInvalidURL {
    protected static String url = "https://jsonplaceholder.typicode.com/post9ng";

    @Step("I set GET invalid endpoints")
    public String setApiInvalidEndpoint(){

        return url;
    }

    @Step("I send GET invalid HTTP request")
    public void sendGetInvalidHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setApiInvalidEndpoint());
    }

    @Step("I receive HTTP response code 404")
    public void validateHttpResponseCode404(){

        restAssuredThat(response -> response.statusCode(404));
    }

}
