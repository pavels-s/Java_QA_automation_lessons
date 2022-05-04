package lecture11.finalTask.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class VacuumCleanerPagePom {

    private final By irobotRoombaProduct = By.xpath("//a[@data-gtm-link ='159116']");
    private final By addProductToCart = By.id("add_to_cart_btn");
    private final By checkOutToCart = By.xpath("//a[@class ='main-button']");

   public void chooseProduct() {
       $$(irobotRoombaProduct).get(1).click();
   }

   public void addToCard() {
        $(addProductToCart).submit();
        sleep(2000);
        $(checkOutToCart).click();
   }

}
