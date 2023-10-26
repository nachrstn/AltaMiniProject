package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProductsInvalidEndpoint {
    protected static String url = "https://altashop-api.fly.dev/api/pr0ducts";

    @Step("I set GET all products invalid endpoint")
    public String setGetAllProductInvalidEndpoints(){
        return url;
    }

    @Step("I send GET HTTP request all products invalid endpoint")
    public void sendGetHttpRequestAllProductInvalidEndpoints(){
        SerenityRest.given()
                .when()
                .get(setGetAllProductInvalidEndpoints());
    }

    @Step("I receive response code 404 for Get all products invalid endpoint")
    public void responseCode404ForGetAllProductInvalidEndpoints(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
