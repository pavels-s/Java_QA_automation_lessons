package lecture8.Task2_ForumCinemaLogin;

import lecture8.Task2_ForumCinemaLogin.pages.CinemaBasePage;
import lecture8.Task2_ForumCinemaLogin.pages.CinemaLoginPage;
import lecture8.Task2_ForumCinemaLogin.pages.CinemaProfilePage;
import org.junit.Test;

public class CinemaTestExecute {

    CinemaBasePage cinemaBasePage = new CinemaBasePage();
    CinemaLoginPage cinemaLoginPage = new CinemaLoginPage();
    CinemaProfilePage cinemaProfilePage = new CinemaProfilePage();
    String newFirstName = "Ivan";
    String newLastName = "Ivanov";
    String newDay = "1";
    String newMonth = "1";
    String newYear = "2000";
    String newPhoneNumber = "0000000";
    String newCity = "New York";
    String newLanguage = "1002";

    @Test
    public void cinemaLoginTest() {
        cinemaBasePage.openChromeUrl("https://www.forumcinemas.lv/mypage/logon/?returnUrl=%252f");
        cinemaLoginPage.validateUrl();
        //cinemaLoginPage.enterLoginPage();
        cinemaLoginPage.accountLogin("pavels.sarkels@gmail.com", "javaguru01");
        cinemaLoginPage.enterProfile();

        cinemaProfilePage.editFirstName(newFirstName);
        cinemaProfilePage.validateFirstName(newFirstName);
        cinemaProfilePage.editLastName(newLastName);
        cinemaProfilePage.validateLastName(newLastName);
        cinemaProfilePage.editBDay(newDay, newMonth,newYear);
        cinemaProfilePage.validateBDay(newDay, newMonth,newYear);
        cinemaProfilePage.editPhone(newPhoneNumber);
        cinemaProfilePage.validatePhone(newPhoneNumber);
        cinemaProfilePage.editCity(newCity);
        cinemaProfilePage.validateCity(newCity);
        cinemaProfilePage.editGender();
        cinemaProfilePage.validateGender();
        cinemaProfilePage.editLanguage(newLanguage);
        cinemaProfilePage.validateLanguage(newLanguage);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cinemaBasePage.closeChrome();
    }
}
