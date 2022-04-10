package Lecture9.Task1;

import Lecture9.Task1.pages.BasePage;
import Lecture9.Task1.pages.PomPageModels;
import Lecture9.Task1.pages.User;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestForModels {

    static User user = new User();
    PomPageModels pomPageModels = new PomPageModels();
    BasePage basePage = new BasePage();

    @BeforeClass
    public static void setupUser() {
        user.setUsername("pavels.sarkels@gmail.com");
        user.setPassword("k0k0l0k0");
    }

    @Test
    public void loginToJanisrozeDynamic() {
        basePage.openChromeByUrl("https://www.janisroze.lv/lv/customer/account/login/");


        pomPageModels.validateEmailAndPass(user.getUsername(), user.getPassword());
        pomPageModels.validateEnter();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        basePage.closeChrome();
    }
}
