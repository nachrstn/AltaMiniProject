package starter.altashop.productcategories.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategoriesInvalidEndpoints {
    protected static String url = "https://altashop-api.fly.dev/api/categ0ries";

    @Step("I set GET all categories invalid endpoint")
    public String setGetAllCategoriesInvalidEndpoints(){
        return url;
    }

    @Step("I send GET HTTP request all categories invalid endpoint")
    public void sendGetHttpRequestAllCategoriesInvalidEndpoints(){
        SerenityRest.given()
                .when()
                .get(setGetAllCategoriesInvalidEndpoints());
    }

    @Step("I receive response code 404 for Get all categories invalid endpoint")
    public void responseCode404ForGetAllCategoriesInvalidEndpoints(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
