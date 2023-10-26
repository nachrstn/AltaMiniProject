package starter.altashop.productcategories.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostProductCategory {
    protected String url = "https://altashop-api.fly.dev/api/categories";

    @Step("I set POST Create a category endpoints")
    public String setPostCreateCategoryEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Create a category")
    public void sendPostHttpRequestCreateCategoryEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "elektronic");
        requestBody.put("description", "for elektronic purposes");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .body(requestBody.toJSONString())
                .post(setPostCreateCategoryEndpoint());
    }

    @Step("I receive response code 200 Create a category")
    public void responseCode200CreateCategoryEndpoint(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for Create a category")
    public void receiveValidDataForCreateCategory(){
        restAssuredThat(response -> response.body("data.Name", equalTo("elektronic")));
        restAssuredThat(response -> response.body("data.Description", equalTo("for elektronic purposes")));}
}
