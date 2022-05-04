package lecture11.finalTask;

import lecture11.finalTask.pages.CartPagePom;
import lecture11.finalTask.pages.HomePagePom;
import lecture11.finalTask.pages.VacuumCleanerPagePom;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Test1a {

    HomePagePom homePagePom = new HomePagePom();
    VacuumCleanerPagePom vacuumCleanerPagePom = new VacuumCleanerPagePom();
    CartPagePom cartPagePom = new CartPagePom();

    @Test
    public void selenide1aTest() {
        homePagePom.openHomePage("https://www.1a.lv/");
        homePagePom.validatePageUrl("https://www.1a.lv/");
        homePagePom.searchByProduct("irobot");
        homePagePom.chooseVacuumCleanerCategory();
        vacuumCleanerPagePom.chooseProduct();
        vacuumCleanerPagePom.addToCard();
        cartPagePom.submitPurchase();
        cartPagePom.enterEmailForPurchase("example111@yahoo.com");
        cartPagePom.chooseCollectionAtOffice();
        cartPagePom.chooseCityOfCollection();
        cartPagePom.enterName("Ivan");
        cartPagePom.enterSurname("Ivanov");
        cartPagePom.enterPhoneNumber("26026262");
        cartPagePom.checkOut();
        cartPagePom.choosePayWithCash();
        cartPagePom.validatePrice("599,00 €");

        sleep(3000);
    }
}
