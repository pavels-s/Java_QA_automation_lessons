package lecture10.task2_cinema.steps;

import lecture8.Task2_ForumCinemaLogin.pages.CinemaLoginPage;
import lecture8.Task2_ForumCinemaLogin.pages.CinemaProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {

    CinemaLoginPage cinemaLoginPage = new CinemaLoginPage();
    CinemaProfilePage cinemaProfilePage = new CinemaProfilePage();

    @When("Enter your login and password")
    public void enterYourLoginAndPassword() {
      cinemaLoginPage.accountLogin("pavels.sarkels@gmail.com", "javaguru01");
    }

    @Then("Enter your profile")
    public void enterYourProfile() {
        cinemaLoginPage.enterProfile();
    }

    @Then("Validate name and surname")
    public void validateNameAndSurname() {
        cinemaProfilePage.validateFirstName("Ivan");
        cinemaProfilePage.validateLastName("Ivanov");
    }
}
