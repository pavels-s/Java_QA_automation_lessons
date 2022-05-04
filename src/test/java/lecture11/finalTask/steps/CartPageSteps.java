package lecture11.finalTask.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartPageSteps {

    @And("Submit purchase, set product name and price")
    public void submitPurchaseSetProductNameAndPrice() {
    }

    @And("^Enter email (.*) for purchase$")
    public void enterEmailForPurchase(String email) {
    }

    @And("Choose collection at office")
    public void chooseCollectionAtOffice() {

    }

    @And("^Choose (.*) city to collect product$")
    public void chooseCityToCollectProduct() {

    }

    @And("^Enter name (.*), surname (.*) and phone number(.*)$")
    public void enterNameSurnameAndPhoneNumber(String name, String surname, String proneNumber) {

    }

    @Then("Checkout")
    public void checkout() {

    }

    @And("Choose payment by cash")
    public void choosePaymentByCash() {
    }

    @And("^Validate that price is (.*)$")
    public void validateThatPriceIs(String productPrice) {
    }
}
