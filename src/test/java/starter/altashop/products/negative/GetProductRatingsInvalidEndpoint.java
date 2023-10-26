package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRatingsInvalidEndpoint {
    protected static String url = "https://altashop-api.fly.dev/api/pr0ducts/85525/ratings";
    @Step("I set GET product ratings invalid endpoint")
    public String setGetProductRatingsInvalidEndpoints(){
        return url;
    }

    @Step("I send GET HTTP request product ratings invalid endpoint")
    public void sendGetHttpRequestProductRatingsInvalidEndpoints(){
        SerenityRest.given()
                .when()
                .get(setGetProductRatingsInvalidEndpoints());
    }

    @Step("I receive response code 404 for Get product ratings invalid endpoint")
    public void responseCode404ForGetProductRatingsInvalidEndpoints(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
