package lecture11.finalTask.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class VacuumCleanerPagePom {

    public void sortByPopularity() {
        $(byClassName("ks-js-sort-desktop")).click();
        sleep(1000);
        $$(By.className("select2-results__option")).get(0).click();
   }

   public void chooseProduct() {
       $$(By.className("ks-new-product-name")).get(1).scrollIntoView(true);
       sleep(2000);
       $$(By.xpath("//a[@data-gtm-link ='159116']")).get(1).click();
   }

   public void addToCard() {
        $(By.id("add_to_cart_btn")).submit();
        sleep(2000);
        $(By.xpath("//a[@class ='main-button']")).click();
   }

}
