package Lecture8;

import Lecture8.pages.BasePage;
import Lecture8.pages.DogsPagePom;
import Lecture8.pages.HomePagePom;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class Task1 {

    BasePage basePage = new BasePage();
    HomePagePom homePagePom = new HomePagePom();
    DogsPagePom dogsPagePom = new DogsPagePom();


    @Test
    public void ssLvTest() {
        basePage.openChromeByUrl("https://www.ss.com/lv/");
        homePagePom.openPageByCategory("dogs");
        dogsPagePom.validatePageUrl();
        dogsPagePom.setPrice("1000", "");
        dogsPagePom.setAge("1", "12");
        dogsPagePom.validateAge("1", "12");
        dogsPagePom.selectRegion("Riga");
        dogsPagePom.pressMekletButton();
//
        //        Wait for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        basePage.closeChrome();
    }
}