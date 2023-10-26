package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.products.positive.*;

public class ProductSteps {
    @Steps
    GetAllProducts getAllProducts;
    @Steps
    GetProductByID GetProductByID;
    @Steps
    GetProductRatings GetProductRatings;
    @Steps
    GetProductComments GetProductComments;
    @Steps
    DeleteProduct DeleteProduct;
    @Steps
    PostProduct PostProduct;
    @Steps
    PostComment PostComment;


    @Given("I set GET endpoints all products")
    public void setGetEndpointsAllProducts(){
        getAllProducts.setGetEndpointsAllProducts();
    }
    @When("I send GET HTTP request all products")
    public void sendGetHttpRequestAllProducts(){
        getAllProducts.sendGetHttpRequestAllProducts();
    }
    @Then("I receive response code 200 for get all products")
    public void responseCode200ForGetAllProducts(){
        getAllProducts.responseCode200ForGetAllProducts();
    }

    @Given("I set GET endpoints product By ID")
    public void setGetEndpointsProductByID(){
        GetProductByID.setGetEndpointsProductByID();
    }
    @When("I send GET HTTP request product By ID")
    public void sendGetHttpRequestProductByID(){
        GetProductByID.sendGetHttpRequestProductByID();
    }
    @Then("I receive response code 200 for get product By ID")
    public void responseCode200ForGetProductByID(){
        GetProductByID.responseCode200ForGetProductByID();
    }

    @Given("I set GET endpoints product ratings")
    public void setGetEndpointsProductRatings(){
        GetProductRatings.setGetEndpointsProductRatings();
    }
    @When("I send GET HTTP request product ratings")
    public void sendGetHttpRequestProductRatings(){
        GetProductRatings.sendGetHttpRequestProductRatings();
    }
    @Then("I receive response code 200 for get product ratings")
    public void responseCode200ForGetProductRatings(){
        GetProductRatings.responseCode200ForGetProductRatings();
    }

    @Given("I set GET endpoints product comments")
    public void setGetEndpointsProductComments(){
        GetProductComments.setGetEndpointsProductComments();
    }
    @When("I send GET HTTP request product comments")
    public void sendGetHttpRequestProductComments(){
        GetProductComments.sendGetHttpRequestGetProductComments();
    }
    @Then("I receive response code 200 for get product comments")
    public void responseCode200ForGetProductComments(){
        GetProductComments.responseCode200ForGetProductComments();
    }

    @Given("I set DELETE endpoints Delete a product")
    public void setDeleteEndpointDeleteProduct(){
        DeleteProduct.setDeleteEndpointDeleteProduct();
    }
    @When("I send DELETE HTTP request Delete a product")
    public void sendDeleteHttpRequestDeleteProduct(){
        DeleteProduct.sendDeleteHttpRequestDeleteProduct();
    }
    @Then("I receive response code 200 Delete a product")
    public void responseCode200DeleteProduct(){
        DeleteProduct.responseCode200DeleteProduct();
    }


    @Given("I set POST endpoints Create a new product")
    public void setPostCreateProductEndpoint(){
        PostProduct.setPostCreateProductEndpoint();
    }
    @When("I send POST HTTP request Create a new product")
    public void sendPostHttpRequestCreateProductEndpoint(){
        PostProduct.sendPostHttpRequestCreateProductEndpoint();
    }
    @Then("I receive response code 200 Create a new product")
    public void responseCode200CreateProductEndpoint(){
        PostProduct.responseCode200CreateProductEndpoint();
    }
    @And("I receive valid data for Create a new product")
    public void receiveValidDataForCreateProduct(){
        PostProduct.receiveValidDataForCreateProduct();
    }

    @Given("I set POST endpoints Create a comment for product")
    public void setPostCreateCommentEndpoint(){
        PostComment.setPostCreateCommentEndpoint();
    }
    @When("I send POST HTTP request Create a comment for product")
    public void sendPostHttpRequestCreateCommentEndpoint(){
        PostComment.sendPostHttpRequestCreateCommentEndpoint();
    }
    @Then("I receive response code 200 Create a comment for product")
    public void responseCode200CreateCommentEndpoint(){
        PostComment.responseCode200CreateCommentEndpoint();
    }
    @And("I receive valid data for Create a comment for product")
    public void receiveValidDataForCreateComment(){
        PostComment.receiveValidDataForCreateComment();
    }




}
