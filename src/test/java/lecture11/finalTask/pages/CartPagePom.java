package lecture11.finalTask.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CartPagePom {

    private final By finalPrice = byXpath("//span[@class = 'checkout-order-summary-total__price']");
    private final By submitPurchaseButton = By.name("commit");
    private final By emailFields = byXpath("//input[@id = 'user_email']");
    private final By collectionAtOfficeButton = byClassName("title");
    private final By collectionAtDaugavpils = byText("Kraujas iela 2, K SENUKAI Daugavpils");
    private final By nameField = byId("address_first_name");
    private final By surnameField = byId("address_last_name");
    private final By customerPhoneNumberField = byId("address_phone_number");
    private final By checkOutButton = byText("Turpināt");
    private final By payWithCashButton = byText("Apmaksa saņemot preci");

    public void submitPurchase() {
        $(submitPurchaseButton).click();
    }

    public void enterEmailForPurchase(String customerEmail) {
        $$(emailFields).get(1).sendKeys(customerEmail);
        $$(emailFields).get(1).submit();
    }

    public void chooseCollectionAtOffice() {
        $$(collectionAtOfficeButton).get(1).click();
    }

    public void chooseCityOfCollection() {
        $(collectionAtDaugavpils).click();
    }

    public void enterName(String customerName) {
        $(nameField).sendKeys(customerName);
    }

    public void enterSurname(String customerSurname) {
        $(surnameField).sendKeys(customerSurname);
    }

    public void enterPhoneNumber(String customerPhoneNumber) {
        $(customerPhoneNumberField).sendKeys(customerPhoneNumber);
    }

    public void checkOut() {
        $(checkOutButton).click();
        sleep(2000);
        $(checkOutButton).click();
    }

    public void choosePayWithCash() {
        $(payWithCashButton).click();
    }

    public void validatePrice(String productPrice) {
        String priceValue = $(finalPrice).getText();
        assertThat(priceValue).isEqualTo(productPrice);
    }

}
