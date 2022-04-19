package Lecture10.Task2_Cinema.Steps;

import Lecture8.Task2_ForumCinemaLogin.pages.CinemaBasePage;
import Lecture8.Task2_ForumCinemaLogin.pages.CinemaLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.checkerframework.checker.units.qual.C;

public class LoginSteps {

    CinemaBasePage cinemaBasePage = new CinemaBasePage();
    CinemaLoginPage cinemaLoginPage = new CinemaLoginPage();

    @Given("Open login page")
    public void openLoginPage() {
        cinemaBasePage.openChromeUrl("https://www.forumcinemas.lv/mypage/logon/?returnUrl=%252f");
    }

    @And("Validate that login page is opened")
    public void validateThatLoginPageIsOpened() {
        cinemaLoginPage.validateUrl();
    }
}
