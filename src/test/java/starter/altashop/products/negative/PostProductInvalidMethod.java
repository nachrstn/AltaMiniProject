package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostProductInvalidMethod {
    protected String url = "https://altashop-api.fly.dev/api/products";

    @Step("I set POST Create a new product invalid method")
    public String setPostCreateProductInvalidMethod(){
        return url;
    }

    @Step("I send POST HTTP request Create a new product invalid method")
    public void sendPostHttpRequestCreateProductInvalidMethod(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS5");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", 299);

        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(29715);

        requestBody.put("categories", categoriesArray);
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .body(requestBody.toJSONString())
                .put(setPostCreateProductInvalidMethod());
    }

    @Step("I receive response code 405 for Create a new product invalid method")
    public void responseCode405CreateProductInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

