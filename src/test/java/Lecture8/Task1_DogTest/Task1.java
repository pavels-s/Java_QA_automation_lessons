package Lecture8.Task1_DogTest;

import Lecture8.Task1_DogTest.pages.BasePage;
import Lecture8.Task1_DogTest.pages.DogsPagePom;
import Lecture8.Task1_DogTest.pages.HomePagePom;
import org.junit.Test;

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