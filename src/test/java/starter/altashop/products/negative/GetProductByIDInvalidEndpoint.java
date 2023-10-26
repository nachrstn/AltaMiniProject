package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductByIDInvalidEndpoint {
    protected static String url = "https://altashop-api.fly.dev/api/pr0ducts/85525";
    @Step("I set GET product By ID invalid endpoint")
    public String setGetProductByIDInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request product By ID invalid endpoint")
    public void sendGetHttpRequestProductByIDInvalidEndpoint(){
        SerenityRest.given()
                .when()
                .get(setGetProductByIDInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get product By ID invalid endpoint")
    public void responseCode404ForGetProductByIDInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
