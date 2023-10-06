package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostInvalidURL {
    protected String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set POST Invalid endpoints")
    public String setPostApiInvalidEndpoint(){
        return url ;
    }

    @Step("I send POST Invalid HTTP request")
    public void sendPostInvalidHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "dolorem eum magni eos aperiam quia");
        requestBody.put("body", "repudiandae veniam quaerat sunt sed");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiInvalidEndpoint());
    }

    @Step("I receive valid HTTP response code 404")
    public void validateHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

//    @Step("I receive valid data for new user")
//    public void validateDatanewUser(){
//        restAssuredThat(response -> response.body("'title'", equalTo("dolorem eum magni eos aperiam quia")));
//        restAssuredThat(response -> response.body("'body'", equalTo("repudiandae veniam quaerat sunt sed")));
//    }
}
