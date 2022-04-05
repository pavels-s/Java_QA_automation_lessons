package Lecture8.Task_2_ForumCinema_Login;

import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class CinemaLoginPage extends CinemaBasePage {

    private final String baseUrl = "https://www.forumcinemas.lv/";
    private final By loginButton = By.xpath("//a[@class='btn btn-login btn-default']");
    private final By loginField = By.id("input-userName");
    private final By passwordField = By.id("input-password");

    public void validateUrl() {
        String currentUlr = driver.getCurrentUrl();
        assertThat(currentUlr).isEqualTo(baseUrl);
    }

    public void enterLoginPage() {
        driver.findElement(loginButton).click();
    }

    public void accountLogin(String email, String pswrd) {
        driver.findElement(loginButton).sendKeys(email);
        driver.findElement(passwordField).sendKeys(pswrd);
    }
}
