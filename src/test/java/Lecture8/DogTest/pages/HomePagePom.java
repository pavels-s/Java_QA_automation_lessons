package Lecture8.DogTest.pages;

import org.openqa.selenium.By;

public class HomePagePom extends BasePage {

    private By categoryDogs = By.id("mtd_300");
    private By categoryCars = By.id("mtd_400");

    public void openPageByCategory(String category) {
        if ("dogs".equals(category)) {
            driver.findElement(categoryDogs).click();
        } else if ("cars".equals(category)) {
            driver.findElement(categoryCars).click();
        }

    }
}
