package com.automation.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;

public class StepDefinition {
    @And("user open website")
    public void user_open_website() {
        System.out.println("user open website");
    }

    @And("verify user is on login page")
    public void verify_user_is_on_login_page() {
        System.out.println("verify user is on login page");
    }

    @When("user entered the valid credentials")
    public void user_enter_the_valid_credentials() {
        System.out.println("user entered the valid credentials");
    }

    @Then("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {
        System.out.println("user is navigated to homepage");
    }

    @When("user enter the invalid credentials")
    public void user_enter_the_invalid_credentials() {
        System.out.println("user enter the invalid credentials");
    }


    @When("user search with TV")
    public void user_search_with_tv() {
        System.out.println("user search with TV");
    }

    @Then("verify user is on product listing page")
    public void verify_user_is_on_product_listing_page() {
        System.out.println("verify user is on product listing page");
    }

    @When("user click on the first product from the list")
    public void user_click_on_the_first_product_from_the_list() {
        System.out.println("user click on the first product from the list");
    }

    @Then("verify user is on product detail page")
    public void verify_user_is_on_product_detail_page() {
        System.out.println("verify user is on product detail page");
    }

    @When("user click on add to cart button")
    public void user_click_on_add_to_cart_button() {
        System.out.println("user click on add to cart button");
    }

    @Then("verify cart page is displayed")
    public void verify_cart_page_is_displayed() {
        System.out.println("verify cart page is displayed");
    }

    @Then("verify item on the cart page")
    public void verify_item_on_the_cart_page() {
        System.out.println("verify item on the cart page");
    }

    @When("user remove item from the cart")
    public void user_remove_item_from_the_cart() {
        System.out.println("user remove item from the cart");
    }

    @Then("verify that item is not in the cart")
    public void verify_that_item_is_not_in_the_cart() {
        System.out.println("verify that item is not in the cart");
    }

    @When("user change quantity of the item")
    public void user_change_quantity_of_the_item() {
        System.out.println("user change quantity of the item");
    }

    @Then("verify total quantity updated on the cart")
    public void verify_total_quantity_updated_on_the_cart() {
        System.out.println("verify total quantity updated on the cart");
    }

    @Then("verify invalid login error message is displayed")
    public void verify_invalid_login_error_message_is_displayed() {
        System.out.println("verify invalid login error message is displayed");
    }

    @When("user entered username {string} and password {string}")
    public void userEnteredUsernameAndPassword(String username, String password) {
        System.out.println("=========="+username);
        System.out.println("=========="+password);
    }
    @Then("verify dropdown option")
    public void verify_dropdown_option(DataTable dt) {
        List<String> data = dt.asList();
        for(String str: data){
            System.out.println(str);
        }
    }
    @Then("verify table data")
    public void verify_table_data(DataTable dt) {
        List<List<String>> table = dt.asLists();
        for(List<String> row: table){
            for(String item: row){
                System.out.print(item+"    ");
            }
            System.out.println();
        }
    }
}
