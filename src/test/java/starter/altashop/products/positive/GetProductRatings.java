package starter.altashop.products.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRatings {
    protected static String url = "https://altashop-api.fly.dev/api/products/85525/ratings";
    @Step("I set GET endpoints all products")
    public String setGetEndpointsProductRatings(){
        return url;
    }

    @Step("I send GET HTTP request all products")
    public void sendGetHttpRequestProductRatings(){
        SerenityRest.given()
                .when()
                .get(setGetEndpointsProductRatings());
    }

    @Step("I receive response code 200 for get all products")
    public void responseCode200ForGetProductRatings(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
