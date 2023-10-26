package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductByIDInvalidMethod {
    protected static String url = "https://altashop-api.fly.dev/api/products/85543";
    @Step("I set GET product By ID invalid method")
    public String setGetProductByIDInvalidMethod(){
        return url;
    }

    @Step("I send GET HTTP request product By ID invalid method")
    public void sendGetHttpRequestProductByIDInvalidMethod(){
        SerenityRest.given()
                .when()
                .put(setGetProductByIDInvalidMethod());
    }

    @Step("I receive response code 405 for Get product By ID invalid method")
    public void responseCode405ForGetProductByIDInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

