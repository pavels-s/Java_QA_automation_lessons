package lecture9.Task2;

import lecture9.task1.pages.User;
import lecture9.Task2.pages.BasePage;
import lecture9.Task2.pages.PomPageModels;
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

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        basePage.closeChrome();
    }
}
