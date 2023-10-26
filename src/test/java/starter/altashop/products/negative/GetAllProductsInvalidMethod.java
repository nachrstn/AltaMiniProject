package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProductsInvalidMethod {
    protected static String url = "https://altashop-api.fly.dev/api/products";

    @Step("I set GET all products invalid method")
    public String setGetAllProductInvalidMethods(){
        return url;
    }

    @Step("I send GET HTTP request all products invalid method")
    public void sendGetHttpRequestAllProductInvalidMethods(){
        SerenityRest.given()
                .when()
                .put(setGetAllProductInvalidMethods());
    }

    @Step("I receive response code 405 for Get all products invalid method")
    public void responseCode405ForGetAllProductInvalidMethods(){
        restAssuredThat(response -> response.statusCode(405));
    }

}
