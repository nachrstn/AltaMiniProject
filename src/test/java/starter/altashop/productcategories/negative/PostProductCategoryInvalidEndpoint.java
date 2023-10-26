package starter.altashop.productcategories.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostProductCategoryInvalidEndpoint {
    protected String url = "https://altashop-api.fly.dev/api/categ0ries";

    @Step("I set POST Create a category invalid endpoint")
    public String setPostCreateCategoryInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Create a category invalid endpoint")
    public void sendPostHttpRequestCreateCategoryInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "elektronic");
        requestBody.put("description", "for elektronic purposes");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .body(requestBody.toJSONString())
                .post(setPostCreateCategoryInvalidEndpoint());
    }

    @Step("I receive response code 404 for Create a category invalid endpoint")
    public void responseCode404CreateCategoryInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
