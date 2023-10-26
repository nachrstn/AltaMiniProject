package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.products.negative.*;
import starter.altashop.products.negative.PostCommentInvalidEndpoint;
import starter.altashop.products.negative.PostProductInvalidEndpoint;

public class ProductNegativeSteps {
    @Steps
    GetAllProductsInvalidEndpoint GetAllProductInvalidEndpoint;
    @Steps
    GetProductByIDInvalidEndpoint GetProductByIDInvalidEndpoint;
    @Steps
    GetProductRatingsInvalidEndpoint GetProductRatingsInvalidEndpoint;
    @Steps
    GetProductCommentsInvalidEndpoint GetProductCommentsInvalidEndpoint;
    @Steps
    DeleteProductInvalidEndpoint DeleteProductInvalidEndpoint;
    @Steps
    PostProductInvalidEndpoint PostProductInvalidEndpoint;
    @Steps
    PostCommentInvalidEndpoint PostCommentInvalidEndpoint;


    @Steps
    GetAllProductsInvalidMethod GetAllProductInvalidMethod;
    @Steps
    GetProductByIDInvalidMethod GetProductByIDInvalidMethod;
    @Steps
    GetProductRatingsInvalidMethod GetProductRatingsInvalidMethod;
    @Steps
    GetProductCommentsInvalidMethod GetProductCommentsInvalidMethod;
    @Steps
    DeleteProductInvalidMethod DeleteProductInvalidMethod;
    @Steps
    PostProductInvalidMethod PostProductInvalidMethod;
    @Steps
    PostCommentInvalidMethod PostCommentInvalidMethod;
    @Steps
    PostProductInvalidPayload PostProductInvalidPayload;
    @Steps
    PostProductRatingInvalidEndpoint PostProductRatingInvalidEndpoint;
    @Steps
    PostProductRatingInvalidMethod PostProductRatingInvalidMethod;


    @Given("I set GET all products invalid endpoint")
    public void setGetAllProductInvalidEndpoints(){
        GetAllProductInvalidEndpoint.setGetAllProductInvalidEndpoints();
    }
    @When("I send GET HTTP request all products invalid endpoint")
    public void sendGetHttpRequestAllProductInvalidEndpoints(){
        GetAllProductInvalidEndpoint.sendGetHttpRequestAllProductInvalidEndpoints();
    }
    @Then("I receive response code 404 for Get all products invalid endpoint")
    public void responseCode200ForGetAllProductInvalidEndpoints(){
        GetAllProductInvalidEndpoint.responseCode404ForGetAllProductInvalidEndpoints();
    }

    @Given("I set GET product By ID invalid endpoint")
    public void setGetProductByIDInvalidEndpoint(){
        GetProductByIDInvalidEndpoint.setGetProductByIDInvalidEndpoint();
    }
    @When("I send GET HTTP request product By ID invalid endpoint")
    public void sendGetHttpRequestProductByIDInvalidEndpoint(){
        GetProductByIDInvalidEndpoint.sendGetHttpRequestProductByIDInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get product By ID invalid endpoint")
    public void responseCode200ForGetProductByIDInvalidEndpoint(){
        GetProductByIDInvalidEndpoint.responseCode404ForGetProductByIDInvalidEndpoint();
    }

    @Given("I set GET product ratings invalid endpoint")
    public void setGetProductRatingsInvalidEndpoints(){
        GetProductRatingsInvalidEndpoint.setGetProductRatingsInvalidEndpoints();
    }
    @When("I send GET HTTP request product ratings invalid endpoint")
    public void sendGetHttpRequestProductRatingsInvalidEndpoints(){
        GetProductRatingsInvalidEndpoint.sendGetHttpRequestProductRatingsInvalidEndpoints();
    }
    @Then("I receive response code 404 for Get product ratings invalid endpoint")
    public void responseCode404ForGetProductRatingsInvalidEndpoints(){
        GetProductRatingsInvalidEndpoint.responseCode404ForGetProductRatingsInvalidEndpoints();
    }

    @Given("I set GET product comments invalid endpoint")
    public void setGetEndpointsProductCommentsInvalidEndpoints(){
        GetProductCommentsInvalidEndpoint.setGetEndpointsProductCommentsInvalidEndpoints();
    }
    @When("I send GET HTTP request product comments invalid endpoint")
    public void sendGetHttpRequestGetProductCommentsInvalidEndpoints(){
        GetProductCommentsInvalidEndpoint.sendGetHttpRequestGetProductCommentsInvalidEndpoints();
    }
    @Then("I receive response code 404 for Get product comments invalid endpoint")
    public void responseCode404ForGetProductCommentsInvalidEndpoints(){
        GetProductCommentsInvalidEndpoint.responseCode404ForGetProductCommentsInvalidEndpoints();
    }

    @Given("I set DELETE Delete a product invalid endpoint")
    public void setDeleteProductInvalidEndpoint(){
        DeleteProductInvalidEndpoint.setDeleteProductInvalidEndpoint();
    }
    @When("I send DELETE HTTP request Delete a product invalid endpoint")
    public void sendHttpRequestDeleteProductInvalidEndpoint(){
        DeleteProductInvalidEndpoint.sendHttpRequestDeleteProductInvalidEndpoint();
    }
    @Then("I receive response code 404 for Delete a product")
    public void responseCode404ForDeleteProductInvalidEndpoint(){
        DeleteProductInvalidEndpoint.responseCode404ForDeleteProductInvalidEndpoint();
    }
    @Given("I set POST Create a new product invalid endpoint")
    public void setPostCreateProductInvalidEndpoint(){
        PostProductInvalidEndpoint.setPostCreateProductInvalidEndpoint();
    }
    @When("I send POST HTTP request Create a new product invalid endpoint")
    public void sendPostHttpRequestCreateProductInvalidEndpoint(){
        PostProductInvalidEndpoint.sendPostHttpRequestCreateProductInvalidEndpoint();
    }
    @Then("I receive response code 404 for Create a new product")
    public void responseCode404CreateProductInvalidEndpoint(){
        PostProductInvalidEndpoint.responseCode404CreateProductInvalidEndpoint();
    }
    @Given("I set POST Create a comment for product invalid endpoint")
    public void setPostCreateCommentInvalidEndpoint(){
        PostCommentInvalidEndpoint.setPostCreateCommentInvalidEndpoint();
    }
    @When("I send POST HTTP request Create a comment for product invalid endpoint")
    public void sendPostHttpRequestCreateCommentInvalidEndpoint(){
        PostCommentInvalidEndpoint.sendPostHttpRequestCreateCommentInvalidEndpoint();
    }
    @Then("I receive response code 404 for Create a comment for product")
    public void responseCode404CreateCommentInvalidEndpoint(){
        PostCommentInvalidEndpoint.responseCode404CreateCommentInvalidEndpoint();
    }




    @Given("I set GET all products invalid method")
    public void setGetAllProductInvalidMethods(){
        GetAllProductInvalidMethod.setGetAllProductInvalidMethods();
    }
    @When("I send GET HTTP request all products invalid method")
    public void sendGetHttpRequestAllProductInvalidMethods(){
        GetAllProductInvalidMethod.sendGetHttpRequestAllProductInvalidMethods();
    }
    @Then("I receive response code 405 for Get all products invalid method")
    public void responseCode200ForGetAllProductInvalidMethods(){
        GetAllProductInvalidMethod.responseCode405ForGetAllProductInvalidMethods();
    }

    @Given("I set GET product By ID invalid method")
    public void setGetProductByIDInvalidMethod(){
        GetProductByIDInvalidMethod.setGetProductByIDInvalidMethod();
    }
    @When("I send GET HTTP request product By ID invalid method")
    public void sendGetHttpRequestProductByIDInvalidMethod(){
        GetProductByIDInvalidMethod.sendGetHttpRequestProductByIDInvalidMethod();
    }
    @Then("I receive response code 405 for Get product By ID invalid method")
    public void responseCode200ForGetProductByIDInvalidMethod(){
        GetProductByIDInvalidMethod.responseCode405ForGetProductByIDInvalidMethod();
    }

    @Given("I set GET product ratings invalid method")
    public void setGetProductRatingsInvalidMethods(){
        GetProductRatingsInvalidMethod.setGetProductRatingsInvalidMethods();
    }
    @When("I send GET HTTP request product ratings invalid method")
    public void sendGetHttpRequestProductRatingsInvalidMethods(){
        GetProductRatingsInvalidMethod.sendGetHttpRequestProductRatingsInvalidMethods();
    }
    @Then("I receive response code 405 for Get product ratings invalid method")
    public void responseCode405ForGetProductRatingsInvalidMethods(){
        GetProductRatingsInvalidMethod.responseCode405ForGetProductRatingsInvalidMethods();
    }

    @Given("I set GET product comments invalid method")
    public void setGetMethodsProductCommentsInvalidMethods(){
        GetProductCommentsInvalidMethod.setGetMethodsProductCommentsInvalidMethods();
    }
    @When("I send GET HTTP request product comments invalid method")
    public void sendGetHttpRequestGetProductCommentsInvalidMethods(){
        GetProductCommentsInvalidMethod.sendGetHttpRequestGetProductCommentsInvalidMethods();
    }
    @Then("I receive response code 405 for Get product comments invalid method")
    public void responseCode405ForGetProductCommentsInvalidMethods(){
        GetProductCommentsInvalidMethod.responseCode405ForGetProductCommentsInvalidMethods();
    }

    @Given("I set DELETE Delete a product invalid method")
    public void setDeleteProductInvalidMethod(){
        DeleteProductInvalidMethod.setDeleteProductInvalidMethod();
    }
    @When("I send DELETE HTTP request Delete a product invalid method")
    public void sendHttpRequestDeleteProductInvalidMethod(){
        DeleteProductInvalidMethod.sendHttpRequestDeleteProductInvalidMethod();
    }
    @Then("I receive response code 405 for Delete a product invalid method")
    public void responseCode405ForDeleteProductInvalidMethod(){
        DeleteProductInvalidMethod.responseCode405ForDeleteProductInvalidMethod();
    }
    @Given("I set POST Create a new product invalid method")
    public void setPostCreateProductInvalidMethod(){
        PostProductInvalidMethod.setPostCreateProductInvalidMethod();
    }
    @When("I send POST HTTP request Create a new product invalid method")
    public void sendPostHttpRequestCreateProductInvalidMethod(){
        PostProductInvalidMethod.sendPostHttpRequestCreateProductInvalidMethod();
    }
    @Then("I receive response code 405 for Create a new product invalid method")
    public void responseCode405CreateProductInvalidMethod(){
        PostProductInvalidMethod.responseCode405CreateProductInvalidMethod();
    }
    @Given("I set POST Create a comment for product invalid method")
    public void setPostCreateCommentInvalidMethod(){
        PostCommentInvalidMethod.setPostCreateCommentInvalidMethod();
    }
    @When("I send POST HTTP request Create a comment for product invalid method")
    public void sendPostHttpRequestCreateCommentInvalidMethod(){
        PostCommentInvalidMethod.sendPostHttpRequestCreateCommentInvalidMethod();
    }
    @Then("I receive response code 405 for Create a comment for product invalid method")
    public void responseCode405CreateCommentInvalidMethod(){
        PostCommentInvalidMethod.responseCode405CreateCommentInvalidMethod();
    }

    @Given("I set POST Create a product invalid payload")
    public void setPostCreateProductInvalidPayload(){
        PostProductInvalidPayload.setPostCreateProductInvalidPayload();
    }
    @When("I send POST HTTP request Create a product invalid payload")
    public void sendPostHttpRequestCreateProductInvalidPayload(){
        PostProductInvalidPayload.sendPostHttpRequestCreateProductInvalidPayload();
    }
    @Then("I receive response code 400 for Create a product invalid payload")
    public void responseCode400CreateProductInvalidPayload(){
        PostProductInvalidPayload.responseCode400CreateProductInvalidPayload();
    }



    @Given("I set POST Assign a product rating invalid endpoint")
    public void setPostProductRatingInvalidEndpoint(){
        PostProductRatingInvalidEndpoint.setPostProductRatingInvalidEndpoint();
    }
    @When("I send POST HTTP request Assign a product rating invalid endpoint")
    public void sendPostHttpRequestProductRatingInvalidEndpoint(){
        PostProductRatingInvalidEndpoint.sendPostHttpRequestProductRatingInvalidEndpoint();
    }
    @Then("I receive response code 404 for Assign a product rating")
    public void responseCode404ProductRatingInvalidEndpoint(){
        PostProductRatingInvalidEndpoint.responseCode404ProductRatingInvalidEndpoint();
    }

    @Given("I set POST Assign a product rating invalid method")
    public void setPostProductRatingInvalidMethod(){
        PostProductRatingInvalidMethod.setPostProductRatingInvalidMethod();
    }
    @When("I send POST HTTP request Assign a product rating invalid method")
    public void sendPostHttpRequestProductRatingInvalidMethod(){
        PostProductRatingInvalidMethod.sendPostHttpRequestProductRatingInvalidMethod();
    }
    @Then("I receive response code 405 for Assign a product rating invalid method")
    public void responseCode405ProductRatingInvalidMethod(){
        PostProductRatingInvalidMethod.responseCode405ProductRatingInvalidMethod();
    }







}
