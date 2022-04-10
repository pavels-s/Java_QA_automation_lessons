package Lecture8.Task_2_ForumCinema_Login;

import Lecture8.Task_2_ForumCinema_Login.pages.CinemaBasePage;
import Lecture8.Task_2_ForumCinema_Login.pages.CinemaLoginPage;
import org.junit.Test;

public class CinemaExecute {

    CinemaBasePage cinemaBasePage = new CinemaBasePage();
    CinemaLoginPage cinemaLoginPage = new CinemaLoginPage();

    @Test
    public void cinemaLoginTest() {
        cinemaBasePage.openChromeUrl("https://www.forumcinemas.lv/mypage/logon/?returnUrl=%252f");
        cinemaLoginPage.validateUrl();
        //cinemaLoginPage.enterLoginPage();
        cinemaLoginPage.accountLogin("pavels.sarkels@gmail.com", "javaguru01");
        cinemaLoginPage.isLoginCompleted();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cinemaBasePage.closeChrome();
    }
}
