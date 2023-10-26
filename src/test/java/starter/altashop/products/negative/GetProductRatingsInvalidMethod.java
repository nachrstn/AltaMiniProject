package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRatingsInvalidMethod {
    protected static String url = "https://altashop-api.fly.dev/api/products/85525/ratings";
    @Step("I set GET product ratings invalid method")
    public String setGetProductRatingsInvalidMethods(){
        return url;
    }

    @Step("I send GET HTTP request product ratings invalid method")
    public void sendGetHttpRequestProductRatingsInvalidMethods(){
        SerenityRest.given()
                .when()
                .put(setGetProductRatingsInvalidMethods());
    }

    @Step("I receive response code 405 for Get product ratings invalid method")
    public void responseCode405ForGetProductRatingsInvalidMethods(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

