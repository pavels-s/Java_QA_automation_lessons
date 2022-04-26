package Lecture9.task4;

import Lecture9.task4.pages.BasePage;
import Lecture9.task4.pages.PomPageModels;
import Lecture9.task4.pages.User;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestForModels {

    static User user = new User();
    PomPageModels pomPageModels = new PomPageModels();
    BasePage basePage = new BasePage();

    @BeforeClass
    public static void setupUser() {
        user.setUsername("example");
        user.setPassword("example");
    }

    @Test
    public void loginToJanisrozeDynamic() {
        basePage.openChromeByUrl("https://www.janisroze.lv/lv/customer/account/login/");


        pomPageModels.enterAccount(user.getUsername(), user.getPassword());
        pomPageModels.validateEnter();
        pomPageModels.searchForProduct();
        //pomPageModels.assertForFirstFoundResult();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        basePage.closeChrome();
    }
}
