package stepDefinitions;

import implementation.Product;
import implementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstPageSteps {
	Product product;
	Search search;
	
	@Given("I have a search field on the Amazon page")
	public void i_have_a_search_field_on_the_amazon_page() {
	System.out.println("Step 1: I am on search page");   
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
	    System.out.println("Step 2: Search with name :"+productName+" and price: "+price);
	    
	    product=new Product(productName, price);
	}
	
	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	    System.out.println("Step 3: Product : "+productName+" is displayed.");
	    
	    search=new Search();
	    String name = search.displayProduct(product);
	    System.out.println("Searched product is : " +name);
	    
	    
	    
	}
	
	

}
