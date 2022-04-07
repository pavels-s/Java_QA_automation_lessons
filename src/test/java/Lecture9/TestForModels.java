package Lecture9;

import Lecture9.models.BasePage;
import Lecture9.models.PomPageModels;
import Lecture9.models.User;
import Lecture9.models.UserStatic;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestForModels {

    static User user = new User();
    PomPageModels pomPageModels = new PomPageModels();
    UserStatic userStatic = new UserStatic();
    BasePage basePage = new BasePage();

    @BeforeClass
    public static void setupUser() {
        user.setUsername("myEmail@email.com");
        user.setPassword("pass");
    }

    @Test
    public void loginToJanisrozeDynamic() {
        basePage.openChromeByUrl("https://www.janisroze.lv/lv/customer/account/login/");
        pomPageModels.validateEmailAndPass();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        basePage.closeChrome();
    }

//    @Test
//    public void loginToJanisRozeStatic() {
//        loginToWebPage
//    }



}
