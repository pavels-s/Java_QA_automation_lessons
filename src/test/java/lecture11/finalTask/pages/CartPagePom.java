package lecture11.finalTask.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CartPagePom {

    public void submitPurchase() {
        $(By.name("commit")).click();
    }

    public void enterEmailForPurchase() {
        $$(By.xpath("//input[@id = 'user_email']")).get(1).sendKeys("example111@yahoo.com");
        $$(By.xpath("//input[@id = 'user_email']")).get(1).submit();
    }

    public void chooseCollectionAtOffice() {
        $$(By.className("title")).get(1).click();
    }

    public void chooseCityOfCollection() {
        $(byText("Kraujas iela 2, K SENUKAI Daugavpils")).click();
    }

    public void enterName() {
        $(By.id("address_first_name")).sendKeys("Ivan");
    }

    public void enterSurname() {
        $(By.id("address_last_name")).sendKeys("Ivanov");
    }

    public void enterPhoneNumber() {
        $(By.id("address_phone_number")).sendKeys("26041265");
    }

    public void checkOut() {
        $(byText("Turpināt")).click();
        sleep(2000);
        $(byText("Turpināt")).click();
    }

    public void choosePayWithCash() {
        $(byText("Apmaksa saņemot preci")).click();
    }

}
