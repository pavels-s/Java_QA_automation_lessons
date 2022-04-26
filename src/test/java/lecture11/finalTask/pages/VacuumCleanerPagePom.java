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
        sleep(3000);
        $(byText("Populārākās preces")).scrollIntoView(true);

        $(withText("Populārākās preces")).scrollTo().click();
   }

   public void chooseProduct() {

        $(By.xpath("//a[@data-gtm-link='159116']")).scrollIntoView(true);
        sleep(2000);
       $(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/a[2]")).click();
//       List<WebElement> sameProducts = new List<>();
//        sameProducts = $$(By.xpath("//a[@data-gtm-link='159116']"));

   }
}
