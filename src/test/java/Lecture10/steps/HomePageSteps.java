package Lecture10.steps;

import Lecture8.Task1_DogTest.pages.BasePage;
import Lecture8.Task1_DogTest.pages.HomePagePom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import Lecture8.Task1_DogTest.pages.DogsPagePom;


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
