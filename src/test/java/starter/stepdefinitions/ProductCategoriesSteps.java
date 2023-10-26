package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.productcategories.positive.DeleteCategory;
import starter.altashop.productcategories.positive.GetAllCategories;
import starter.altashop.productcategories.positive.GetCategoriesByID;
import starter.altashop.productcategories.positive.PostProductCategory;
import starter.altashop.products.positive.PostProduct;

public class ProductCategoriesSteps {

    @Steps
    GetAllCategories GetAllCategories;
    @Steps
    GetCategoriesByID GetCategoriesByID;
    @Steps
    DeleteCategory DeleteCategory;
    @Steps
    PostProductCategory PostProductCategory;

    @Given("I set GET endpoints all categories")
    public void setGetEndpointsAllCategories(){
        GetAllCategories.setGetEndpointsAllCategories();
    }
    @When("I send GET HTTP request all categories")
    public void sendGetHttpRequestAllCategories(){
        GetAllCategories.sendGetHttpRequestAllCategories();
    }
    @Then("I receive response code 200 for get all categories")
    public void responseCode200ForGetAllCategories(){
        GetAllCategories.responseCode200ForGetAllCategories();
    }

    @Given("I set GET endpoints category by ID")
    public void setGetEndpointsCategoriesByID(){
        GetCategoriesByID.setGetEndpointsCategoriesByID();
    }
    @When("I send GET HTTP request category by ID")
    public void sendGetHttpRequestCategoriesByID(){
        GetCategoriesByID.sendGetHttpRequestCategoriesByID();
    }
    @Then("I receive response code 200 for get category by ID")
    public void responseCode200ForGetCategoriesByID(){
        GetCategoriesByID.responseCode200ForGetCategoriesByID();
    }
    @And("I receive valid data for detail category by ID")
    public void receiveValidDataForDetailCategoryByID(){
        GetCategoriesByID.receiveValidDataForDetailCategoryByID();
    }

    @Given("I set DELETE endpoints Delete a category")
    public void setDeleteEndpointDeleteCategory(){
        DeleteCategory.setDeleteEndpointDeleteCategory();
    }
    @When("I send DELETE HTTP request Delete a category")
    public void sendDeleteHttpRequestDeleteCategory(){
        DeleteCategory.sendDeleteHttpRequestDeleteCategory();
    }
    @Then("I receive response code 200 Delete a category")
    public void responseCode200DeleteCategory(){
        DeleteCategory.responseCode200DeleteCategory();
    }

    @Given("I set POST Create a category endpoints")
    public void setPostCreateCategoryEndpoint(){
        PostProductCategory.setPostCreateCategoryEndpoint();
    }
    @When("I send POST HTTP request Create a category")
    public void sendPostHttpRequestCreateCategoryEndpoint(){
        PostProductCategory.sendPostHttpRequestCreateCategoryEndpoint();
    }
    @Then("I receive response code 200 Create a category")
    public void responseCode200CreateCategoryEndpoint(){
        PostProductCategory.responseCode200CreateCategoryEndpoint();
    }
    @And("I receive valid data for Create a category")
    public void receiveValidDataForCreateCategory(){
        PostProductCategory.receiveValidDataForCreateCategory();
    }

}
