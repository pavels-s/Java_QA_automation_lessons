package lecture11.finalTask.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class VacuumCleanerPagePom {

    public void sortByPopularity() {
        $(byClassName("ks-js-sort-desktop")).click();
        $(By.xpath("//li[@class = 'select2-results__option select2-results__option--highlighted']")).scrollIntoView(true);
        sleep(3000);
        $(By.xpath("//li[@id = 'select2-yku7-result-wga3-[\"-inStock\",\"priceLoyalty\"]']")).click();
        sleep(3000);
   }

   public void chooseProduct() {
       $(By.xpath("//a[@data-gtm-link ='159116']")).scrollIntoView(true);
       sleep(3000);
       $$(By.xpath("//a[@data-gtm-link ='159116']")).get(1).click();
   }

   public void addToCard() {
        $(By.id("add_to_cart_btn")).submit();
        sleep(2000);
        $(By.xpath("//a[@class ='main-button']")).click();
   }

}
