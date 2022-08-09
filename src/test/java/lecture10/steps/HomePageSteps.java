package lecture10.steps;

import lecture8.Task1_DogTest.pages.BasePage;
import lecture8.Task1_DogTest.pages.HomePagePom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class HomePageSteps {

    BasePage basePage = new BasePage();
    HomePagePom homePagePom = new HomePagePom();

    @Given("Open HomePage")
    public void openHomePage() {
        basePage.openChromeByUrl("https://www.ss.com/lv/");
    }

    @And("Open Dog Category")
    public void openDogCategory() {
        homePagePom.openPageByCategory("dogs");
    }
}
