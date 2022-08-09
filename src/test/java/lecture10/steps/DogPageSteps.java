package lecture10.steps;
import lecture8.Task1_DogTest.pages.DogsPagePom;
import lecture8.Task1_DogTest.pages.HomePagePom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DogPageSteps {

    DogsPagePom dogsPagePom = new DogsPagePom();
    HomePagePom homePagePom = new HomePagePom();

    @And("Validate that Dog page is open")
    public void validateThatDogPageIsOpen() {
        dogsPagePom.validatePageUrl();
    }

    @When("^Set min price to (.*) and max price (.*)$")
    public void setMinPriceToAndMaxPrice(String minPrice, String maxPrice) {
        dogsPagePom.setPrice("1000", "");
    }

    @And("^Set min age to (.*) and max age (.*)$")
    public void setMinAgeToAndMaxAge(String minAge, String maxAge) {
        dogsPagePom.setAge("1", "12");
    }

    @And("^Change region to (Riga|all)$")
    public void changeRegionTo(String region) {
        dogsPagePom.selectRegion("Riga");

    }

    @Then("Press search button")
    public void pressSearchButton() {
        dogsPagePom.pressMekletButton();
    }


}

