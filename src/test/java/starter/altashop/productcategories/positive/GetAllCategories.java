package starter.altashop.productcategories.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategories {
    protected static String url = "https://altashop-api.fly.dev/api/categories";

    @Step("I set GET endpoints all categories")
    public String setGetEndpointsAllCategories(){
        return url;
    }

    @Step("I send GET HTTP request all categories")
    public void sendGetHttpRequestAllCategories(){
        SerenityRest.given()
                .when()
                .get(setGetEndpointsAllCategories());
    }

    @Step("I receive response code 200 for get all categories")
    public void responseCode200ForGetAllCategories(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
