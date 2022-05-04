package lecture11.finalTask.steps;

import io.cucumber.java.en.And;
import lecture11.finalTask.pages.VacuumCleanerPagePom;

public class ProductPageSteps {

    VacuumCleanerPagePom vacuumCleanerPagePom = new VacuumCleanerPagePom();

    @And("Choose a product and click on it")
    public void chooseAProductAndClickOnIt() {
        vacuumCleanerPagePom.chooseProduct();
    }

    @And("Set up product price")
    public void setUpProductPrice() {
        vacuumCleanerPagePom.setUpProductPrice();
    }

    @And("Add it to the cart")
    public void addItToTheCart() {
        vacuumCleanerPagePom.addToCard();
    }

}
