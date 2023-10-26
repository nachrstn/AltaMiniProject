package starter.altashop.productcategories.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetCategoriesByID {
    protected static String url = "https://altashop-api.fly.dev/api/categories/29715";
    @Step("I set GET endpoints category by ID")
    public String setGetEndpointsCategoriesByID(){
        return url;
    }

    @Step("I send GET HTTP request category by ID")
    public void sendGetHttpRequestCategoriesByID(){
        SerenityRest.given()
                .when()
                .get(setGetEndpointsCategoriesByID());
    }

    @Step("I receive response code 200 for get category by ID")
    public void responseCode200ForGetCategoriesByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail category by ID")
    public void receiveValidDataForDetailCategoryByID(){
        restAssuredThat(response -> response.body("data.ID", equalTo(29715)));
        restAssuredThat(response -> response.body("data.Name", equalTo("gaming")));
        restAssuredThat(response -> response.body("data.Description", equalTo("for gaming purposes")));
    }
}
