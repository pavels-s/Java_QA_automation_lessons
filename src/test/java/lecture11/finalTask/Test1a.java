package lecture11.finalTask;

import lecture11.finalTask.pages.CartPagePom;
import lecture11.finalTask.pages.HomePagePom;
import lecture11.finalTask.pages.VacuumCleanerPagePom;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Test1a {

    HomePagePom homePagePom = new HomePagePom();
    VacuumCleanerPagePom vacuumCleanerPagePom = new VacuumCleanerPagePom();
    CartPagePom cartPagePom = new CartPagePom();

    @Test
    public void selenide1aTest() {
        open("https://www.1a.lv/");
        getWebDriver().manage().window().maximize();
        homePagePom.validatePageUrl();
        homePagePom.searchByProduct();
        homePagePom.chooseCategory();
        //vacuumCleanerPagePom.sortByPopularity();
        vacuumCleanerPagePom.chooseProduct();
        vacuumCleanerPagePom.addToCard();
        cartPagePom.submitPurchase();
        cartPagePom.enterEmailForPurchase();
        cartPagePom.chooseCollectionAtOffice();
        cartPagePom.chooseCityOfCollection();
        cartPagePom.enterName();
        cartPagePom.enterSurname();
        cartPagePom.enterPhoneNumber();
        cartPagePom.checkOut();
        cartPagePom.choosePayWithCash();

        sleep(3000);
    }
}
