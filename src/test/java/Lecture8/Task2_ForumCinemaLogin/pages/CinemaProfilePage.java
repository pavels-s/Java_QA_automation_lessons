package Lecture8.Task2_ForumCinemaLogin.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class CinemaProfilePage extends CinemaBasePage {

    private final By firstNameField = By.id("inputFirstName");
    private final By lastNameField = By.id("inputLastName");
    private final By dayField = By.id("bdDay");
    private final By monthField = By.id("bdMonth");
    private final By yearField = By.id("bdYear");
    private final By phoneField = By.id("inputMobile");
    private final By cityField = By.id("inputCity");
    private final By femaleGenderCheckbox = By.xpath("//input[@id='genderFemale']");
    private final By languageBox = By.id("preferredLanguage");


    public void editFirstName(String newFirstName) {
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(newFirstName);
    }

    public void validateFirstName(String newFirstName) {
        assertThat(driver.findElement(firstNameField).getAttribute("value")).isEqualTo(newFirstName);
    }

    public void editLastName(String newLastName) {
        driver.findElement(lastNameField).clear();
        driver.findElement(lastNameField).sendKeys(newLastName);
    }

    public void validateLastName(String newLastName) {
        assertThat(driver.findElement(lastNameField).getAttribute("value")).isEqualTo(newLastName);
    }

    public void editBDay(String day, String month, String year) {
        Select dayDropDown = new Select(driver.findElement(dayField));
        dayDropDown.selectByValue(day);

        Select monthDropDown = new Select(driver.findElement(monthField));
        monthDropDown.selectByValue(month);

        Select yearDropDown = new Select(driver.findElement(yearField));
        yearDropDown.selectByValue(year);
    }

    public void validateBDay(String day, String month, String year) {
        Assert.assertEquals(driver.findElement(dayField).getAttribute("value"), day);
        Assert.assertEquals(driver.findElement(monthField).getAttribute("value"), month);
        Assert.assertEquals(driver.findElement(yearField).getAttribute("value"), year);
    }

    public void editPhone(String newPhoneNumber) {
        driver.findElement(phoneField).clear();
        driver.findElement(phoneField).sendKeys(newPhoneNumber);
    }

    public void validatePhone(String newPhoneNumber) {
        assertThat(driver.findElement(phoneField).getAttribute("value")).isEqualTo(newPhoneNumber);
    }

    public void editCity(String newCity) {
        driver.findElement(cityField).clear();
        driver.findElement(cityField).sendKeys(newCity);
    }

    public void validateCity(String newCity) {
        assertThat(driver.findElement(cityField).getAttribute("value")).isEqualTo(newCity);
    }

    public void editGender() {
        driver.findElement(femaleGenderCheckbox).click();
    }

    public void validateGender() {
        Assert.assertTrue(driver.findElement(femaleGenderCheckbox).isSelected());
    }

    public void editLanguage(String newLanguage) {
        Select languageDropDown = new Select(driver.findElement(languageBox));
        languageDropDown.selectByValue(newLanguage);
    }

    public void validateLanguage(String newLanguage) {
        Select languageDropDown = new Select(driver.findElement(languageBox));
        assertThat(languageDropDown.getFirstSelectedOption().getAttribute("value")).isEqualTo(newLanguage);
    }
}
