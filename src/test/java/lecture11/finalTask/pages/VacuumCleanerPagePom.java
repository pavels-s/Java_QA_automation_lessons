package lecture11.finalTask.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class VacuumCleanerPagePom {

    public void sortByPopularity() {
//        $(byClassName("ks-js-sort-desktop")).click();

//        $(byText("Populārākās preces")).scrollTo().click();

        $(byName("Putekļsūcējs - robots iRobot Roomba 980")).scrollTo();
        sleep(1000);
        $(byXpath("//a[@data-gtm-link = '159116' and @href= '/p/puteklsucejs-robots-irobot-roomba-980/3erw?mtd=search&pos=regular&src=searchnode']")).click();
    }
}
