package starter.altashop.productcategories.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCategoryInvalidMethod {
    protected String url = "https://altashop-api.fly.dev/api/categories/29723";
    @Step("I set DELETE Delete a product invalid method")
    public String setDeleteCategoryInvalidMethod(){
        return url;
    }
    @Step("I send DELETE HTTP request Delete a product invalid method")
    public void sendHttpRequestDeleteCategoryInvalidMethod(){
        SerenityRest.given().put(setDeleteCategoryInvalidMethod());
    }
    @Step("I receive response code 405 for Delete a product")
    public void responseCode405ForDeleteCategoryInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }
}

