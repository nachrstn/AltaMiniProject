package starter.altashop.productcategories.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCategory {
    protected String url = "https://altashop-api.fly.dev/api/categories/30160";
    @Step("I set DELETE endpoints Delete a category")
    public String setDeleteEndpointDeleteCategory(){
        return url;
    }

    @Step("I send DELETE HTTP request Delete a category")
    public void sendDeleteHttpRequestDeleteCategory(){
        SerenityRest.given().delete(setDeleteEndpointDeleteCategory());
    }
    @Step("I receive response code 200 Delete a category")
    public void responseCode200DeleteCategory(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
