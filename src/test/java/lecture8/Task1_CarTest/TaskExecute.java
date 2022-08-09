package lecture8.Task1_CarTest;

import lecture8.Task1_CarTest.Pages.BasePage;
import lecture8.Task1_CarTest.Pages.CarsPagePom;
import org.junit.Test;

public class TaskExecute extends BasePage {

    BasePage basePage = new BasePage();
    CarsPagePom carsPagePom = new CarsPagePom();

    @Test
    public void carTest() {
        basePage.openChromeByUrl("https://www.ss.com/lv/transport/cars/");
        carsPagePom.validateUrl();
        carsPagePom.setPrice("6000", "10000");
        carsPagePom.validatePrice("6000", "10000");
        carsPagePom.setYear("2001");
        carsPagePom.validateYear("2001");
        carsPagePom.setEngineMax("3.0");
        carsPagePom.setColor(1);
        carsPagePom.checkColor("6318");
        carsPagePom.submit();
        basePage.closeChrome();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
