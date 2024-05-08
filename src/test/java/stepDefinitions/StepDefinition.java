package stepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinition {

    @Given("the user has navigated to the login page")
    public void theUserHasNavigatedToTheLoginPage() {
        System.out.println("Executing step: the user has navigated to the login page");
    }

    @When("the user enters {string} and {string}")
    public void theUserEntersAnd(String username, String password) {
        System.out.println("Executing step: the user enters {string} and {string}");
    }

    @Then("the system should display a successful login message")
    public void theSystemShouldDisplayASuccessfulLoginMessage() {
        System.out.println("Executing step: the system should display a successful login message");
    }

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        System.out.println("Executing step: the user is logged in");
    }

    @When("the user searches for the {string}")
    public void theUserSearchesForThe(String product) {
        System.out.println("Executing step: the user searches for the {string}");
    }

    @Then("the system should display the product results related to {string}")
    public void theSystemShouldDisplayTheProductResultsRelatedTo(String product) {
        System.out.println("Executing step: the system should display the product results related to {string}");
    }

    @Given("the user has selected products and proceeded to checkout")
    public void theUserHasSelectedProductsAndProceededToCheckout() {
        System.out.println("Executing step: the user has selected products and proceeded to checkout");
    }

    @When("the user attempts to pay with invalid card details {string}")
    public void theUserAttemptsToPayWithInvalidCardDetails(String card_number) {
        System.out.println("Executing step: the user attempts to pay with invalid card details {string}");
    }

    @Then("the system should display a payment failed message")
    public void theSystemShouldDisplayAPaymentFailedMessage() {
        System.out.println("Executing step: the system should display a payment failed message");
    }

    @Given("a user is on a product {string} details page")
    public void aUserIsOnAProductDetailsPage(String product) {
        System.out.println("Executing step: a user is on a product {string} details page");
    }

    @When("the user clicks on add to cart")
    public void theUserClicksOnAddToCart() {
        System.out.println("Executing step: the user clicks on add to cart");
    }

    @Then("the product should be successfully added to the cart")
    public void theProductShouldBeSuccessfullyAddedToTheCart() {
        System.out.println("Executing step: the product should be successfully added to the cart");
    }

    @Given("a user is on an out-of-stock product {string} page")
    public void aUserIsOnAnOutofstockProductPage(String product) {
        System.out.println("Executing step: a user is on an out-of-stock product {string} page");
    }

    @When("the user attempts to add the product to the cart")
    public void theUserAttemptsToAddTheProductToTheCart() {
        System.out.println("Executing step: the user attempts to add the product to the cart");
    }

    @Then("the system should notify the user that the product is out of stock")
    public void theSystemShouldNotifyTheUserThatTheProductIsOutOfStock() {
        System.out.println("Executing step: the system should notify the user that the product is out of stock");
    }

}
