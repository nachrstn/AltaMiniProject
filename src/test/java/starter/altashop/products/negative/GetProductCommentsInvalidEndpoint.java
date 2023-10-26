package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductCommentsInvalidEndpoint {
    protected static String url = "https://altashop-api.fly.dev/api/pr0ducts/85525/comments";
    @Step("I set GET product comments invalid endpoint")
    public String setGetEndpointsProductCommentsInvalidEndpoints(){
        return url;
    }

    @Step("I send GET HTTP request product comments invalid endpoint")
    public void sendGetHttpRequestGetProductCommentsInvalidEndpoints(){
        SerenityRest.given()
                .when()
                .get(setGetEndpointsProductCommentsInvalidEndpoints());
    }

    @Step("I receive response code 404 for Get product comments invalid endpoint")
    public void responseCode404ForGetProductCommentsInvalidEndpoints(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
