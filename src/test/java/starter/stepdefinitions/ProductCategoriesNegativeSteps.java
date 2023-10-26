package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.productcategories.negative.*;

public class ProductCategoriesNegativeSteps {

    @Steps
    GetAllCategoriesInvalidEndpoints GetAllCategoriesInvalidEndpoints;
    @Steps
    GetCategoriesByIDInvalidEndpoint GetCategoriesByIDInvalidEndpoint;
    @Steps
    DeleteCategoryInvalidEndpoint DeleteCategoryInvalidEndpoint;
    @Steps
    PostProductCategoryInvalidEndpoint PostProductCategoryInvalidEndpoint;

    @Steps
    GetAllCategoriesInvalidMethods GetAllCategoriesInvalidMethods;
    @Steps
    GetCategoriesByIDInvalidMethod GetCategoriesByIDInvalidMethod;
    @Steps
    DeleteCategoryInvalidMethod DeleteCategoryInvalidMethod;
    @Steps
    PostProductCategoryInvalidMethod PostProductCategoryInvalidMethod;
    @Steps
    PostProductCategoryInvalidPayload PostProductCategoryInvalidPayload;


    @Given("I set GET all categories invalid endpoint")
    public void setGetEndpointsAllCategories(){
        GetAllCategoriesInvalidEndpoints.setGetAllCategoriesInvalidEndpoints();
    }
    @When("I send GET HTTP request all categories invalid endpoint")
    public void sendGetHttpRequestAllCategories(){
        GetAllCategoriesInvalidEndpoints.sendGetHttpRequestAllCategoriesInvalidEndpoints();
    }
    @Then("I receive response code 404 for Get all categories invalid endpoint")
    public void responseCode200ForGetAllCategories(){
        GetAllCategoriesInvalidEndpoints.responseCode404ForGetAllCategoriesInvalidEndpoints();
    }

    @Given("I set GET category by ID invalid endpoint")
    public void setGetCategoryByIDInvalidEndpoint(){
        GetCategoriesByIDInvalidEndpoint.setGetCategoryByIDInvalidEndpoint();
    }
    @When("I send GET HTTP request category by ID invalid endpoint")
    public void sendGetHttpRequestCategoryByIDInvalidEndpoint(){
        GetCategoriesByIDInvalidEndpoint.sendGetHttpRequestCategoryByIDInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get category by ID invalid endpoint")
    public void responseCode200ForGetCategoryByIDInvalidEndpoint(){
        GetCategoriesByIDInvalidEndpoint.responseCode200ForGetCategoryByIDInvalidEndpoint();
    }

    @Given("I set DELETE Delete a category invalid endpoint")
    public void setDeleteCategoryInvalidEndpoint(){
        DeleteCategoryInvalidEndpoint.setDeleteCategoryInvalidEndpoint();
    }
    @When("I send DELETE HTTP request Delete a category invalid endpoint")
    public void sendHttpRequestDeleteCategoryInvalidEndpoint(){
        DeleteCategoryInvalidEndpoint.sendHttpRequestDeleteCategoryInvalidEndpoint();
    }
    @Then("I receive response code 404 for Delete a category")
    public void responseCode404ForDeleteCategoryInvalidEndpoint(){
        DeleteCategoryInvalidEndpoint.responseCode404ForDeleteCategoryInvalidEndpoint();
    }

    @Given("I set POST Create a category invalid endpoint")
    public void setPostCreateCategoryInvalidEndpoint(){
        PostProductCategoryInvalidEndpoint.setPostCreateCategoryInvalidEndpoint();
    }
    @When("I send POST HTTP request Create a category invalid endpoint")
    public void sendPostHttpRequestCreateCategoryInvalidEndpoint(){
        PostProductCategoryInvalidEndpoint.sendPostHttpRequestCreateCategoryInvalidEndpoint();
    }
    @Then("I receive response code 404 for Create a category invalid endpoint")
    public void responseCode404CreateCategoryInvalidEndpoint(){
        PostProductCategoryInvalidEndpoint.responseCode404CreateCategoryInvalidEndpoint();
    }



    @Given("I set GET all categories invalid method")
    public void setGetMethodsAllCategories(){
        GetAllCategoriesInvalidMethods.setGetAllCategoriesInvalidMethods();
    }
    @When("I send GET HTTP request all categories invalid method")
    public void sendGetHttpRequestAllCategoriesInvalidMethods(){
        GetAllCategoriesInvalidMethods.sendGetHttpRequestAllCategoriesInvalidMethods();
    }
    @Then("I receive response code 405 for Get all categories invalid method")
    public void responseCode405ForGetAllCategoriesInvalidMethods(){
        GetAllCategoriesInvalidMethods.responseCode405ForGetAllCategoriesInvalidMethods();
    }

    @Given("I set GET category by ID invalid method")
    public void setGetCategoryByIDInvalidMethod(){
        GetCategoriesByIDInvalidMethod.setGetCategoryByIDInvalidMethod();
    }
    @When("I send GET HTTP request category by ID invalid method")
    public void sendGetHttpRequestCategoryByIDInvalidMethod(){
        GetCategoriesByIDInvalidMethod.sendGetHttpRequestCategoryByIDInvalidMethod();
    }
    @Then("I receive response code 405 for Get category by ID invalid method")
    public void responseCode405ForGetCategoryByIDInvalidMethod(){
        GetCategoriesByIDInvalidMethod.responseCode405ForGetCategoryByIDInvalidMethod();
    }

    @Given("I set DELETE Delete a category invalid method")
    public void setDeleteCategoryInvalidMethod(){
        DeleteCategoryInvalidMethod.setDeleteCategoryInvalidMethod();
    }
    @When("I send DELETE HTTP request Delete a category invalid method")
    public void sendHttpRequestDeleteCategoryInvalidMethod(){
        DeleteCategoryInvalidMethod.sendHttpRequestDeleteCategoryInvalidMethod();
    }
    @Then("I receive response code 405 for Delete a category invalid method")
    public void responseCode405ForDeleteCategoryInvalidMethod(){
        DeleteCategoryInvalidMethod.responseCode405ForDeleteCategoryInvalidMethod();
    }

    @Given("I set POST Create a category invalid method")
    public void setPostCreateCategoryInvalidMethod(){
        PostProductCategoryInvalidMethod.setPostCreateCategoryInvalidMethod();
    }
    @When("I send POST HTTP request Create a category invalid method")
    public void sendPostHttpRequestCreateCategoryInvalidMethod(){
        PostProductCategoryInvalidMethod.sendPostHttpRequestCreateCategoryInvalidMethod();
    }
    @Then("I receive response code 405 for Create a category invalid method")
    public void responseCode405CreateCategoryInvalidMethod(){
        PostProductCategoryInvalidMethod.responseCode405CreateCategoryInvalidMethod();
    }

    @Given("I set POST Create a category invalid payload")
    public void setPostCreateCategoryInvalidPayload(){
        PostProductCategoryInvalidPayload.setPostCreateCategoryInvalidPayload();
    }
    @When("I send POST HTTP request Create a category invalid payload")
    public void sendPostHttpRequestCreateCategoryInvalidPayload(){
        PostProductCategoryInvalidPayload.sendPostHttpRequestCreateCategoryInvalidPayload();
    }
    @Then("I receive response code 400 for Create a category invalid payload")
    public void responseCode400CreateCategoryInvalidPayload(){
        PostProductCategoryInvalidPayload.responseCode400CreateCategoryInvalidPayload();
    }



}
