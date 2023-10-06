package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetByIdInvalidURL {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET Invalid endpoints")
    public String setApiInvalidEndpoint(){

        return url + "/1";
    }

    @Step("I send GET Invalid HTTP request")
    public void sendGetInvalidHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setApiInvalidEndpoint());
    }

    @Step("I receive valid HTTP response code 404")
    public void validateHttpResponseCode404(){

        restAssuredThat(response -> response.statusCode(404));
    }

//    @Step("I receive valid data for detail user")
//    public void validateDataDetailUser(){
//        restAssuredThat(response -> response.body("'userId'", equalTo(1)));
//        restAssuredThat(response -> response.body("'id'", equalTo(1)));
//        restAssuredThat(response -> response.body("'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
//        restAssuredThat(response -> response.body("'body'", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")));
//    }
}
