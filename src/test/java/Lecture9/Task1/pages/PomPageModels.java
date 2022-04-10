package Lecture9.Task1.pages;

import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class PomPageModels extends BasePage {

    private final By emailField = By.id("email");
    private final By passField = By.id("pass");

    User user = new User();

    public void validateEmailAndPass(String userName, String userPassword) {
        driver.findElement(emailField).sendKeys(userName);
        driver.findElement(passField).sendKeys(userPassword);
        driver.findElement(By.id("send2")).submit();
    }

    public void validateEnter() {
        assertThat(driver.getCurrentUrl()).isEqualTo("https://www.janisroze.lv/lv/customer/account/");
    }
}
