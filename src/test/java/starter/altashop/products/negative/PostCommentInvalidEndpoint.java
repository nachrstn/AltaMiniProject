package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostCommentInvalidEndpoint {
    protected String url = "https://altashop-api.fly.dev/api/pr0ducts/85525/comments";

    @Step("I set POST endpoints Create a comment for product invalid endpoint")
    public String setPostCreateCommentInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Create a comment for product invalid endpoint")
    public void sendPostHttpRequestCreateCommentInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");


        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .body(requestBody.toJSONString())
                .post(setPostCreateCommentInvalidEndpoint());
    }

    @Step("I receive response code 404 Create a comment for product invalid endpoint")
    public void responseCode404CreateCommentInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }


}
