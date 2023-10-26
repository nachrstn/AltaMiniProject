package starter.altashop.productcategories.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCategoriesByIDInvalidMethod {
    protected static String url = "https://altashop-api.fly.dev/api/categories/29716";
    @Step("I set GET category by ID invalid method")
    public String setGetCategoryByIDInvalidMethod(){
        return url;
    }

    @Step("I send GET HTTP request category by ID invalid method")
    public void sendGetHttpRequestCategoryByIDInvalidMethod(){
        SerenityRest.given()
                .when()
                .put(setGetCategoryByIDInvalidMethod());
    }

    @Step("I receive response code 405 for Get category by ID invalid method")
    public void responseCode405ForGetCategoryByIDInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }


}

