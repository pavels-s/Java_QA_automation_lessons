package lecture11.finalTask.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;


public class HomePagePom {


    public void validatePageUrl() {
        String currentUrl = url();
        assertThat(currentUrl).isEqualTo(currentUrl);
    }

    public void searchByProduct() {
        $(byId("q")).sendKeys("irobot");
        $(byClassName("main-search-submit")).click();
    }

    public void chooseCategory() {
        $(byClassName("frftyoh")).click();
    }
}
