package starter.altashop.productcategories.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostProductCategoryInvalidMethod {
    protected String url = "https://altashop-api.fly.dev/api/categories";

    @Step("I set POST Create a category invalid method")
    public String setPostCreateCategoryInvalidMethod(){
        return url;
    }

    @Step("I send POST HTTP request Create a category invalid method")
    public void sendPostHttpRequestCreateCategoryInvalidMethod(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "elektronic");
        requestBody.put("description", "for elektronic purposes");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .body(requestBody.toJSONString())
                .put(setPostCreateCategoryInvalidMethod());
    }

    @Step("I receive response code 405 for Create a category invalid method")
    public void responseCode405CreateCategoryInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

