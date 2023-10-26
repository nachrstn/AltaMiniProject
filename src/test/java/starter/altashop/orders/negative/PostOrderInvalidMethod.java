package starter.altashop.orders.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostOrderInvalidMethod {
    protected static String url = "https://altashop-api.fly.dev/api/orders";
    @Step("I set POST Create a new order invalid method")
    public String setPostOrderInvalidMethod(){
        return url;
    }

    @Step("I send POST HTTP request Create a new order invalid method")
    public void sendPostHttpRequestPostOrderInvalidMethod(){
        JSONArray orderItems = new JSONArray();
        JSONObject orderItem = new JSONObject();
        orderItem.put("product_id", 86220);
        orderItem.put("quantity", 1);
        orderItems.add(orderItem);

        JSONArray requestBody = new JSONArray();
        JSONObject orderCreate = new JSONObject();
        orderCreate.put("order_items", orderItems);
        requestBody.add(orderCreate);

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .body(requestBody.toJSONString())
                .put(setPostOrderInvalidMethod());
    }

    @Step("I receive response code 405 for Create a new order")
    public void responseCode405ForPostOrderInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

