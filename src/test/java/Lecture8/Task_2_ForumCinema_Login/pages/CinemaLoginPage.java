package Lecture8.Task_2_ForumCinema_Login.pages;

import org.openqa.selenium.By;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;

public class CinemaLoginPage extends CinemaBasePage {

    private final String baseUrl = "https://www.forumcinemas.lv/mypage/logon/?returnUrl=%252f";
    //private final By loginButton = By.xpath("//a[@class='btn btn-login btn-default']");
    private final By loginField = By.id("input-userName");
    private final By passwordField = By.id("input-password");
    private final By submitButton = By.xpath("//button[@class='btn btn-primary btn-block']");
    private final By profileButton = By.xpath("//button[@class='btn btn-success']");

    public void validateUrl() {
        String currentUlr = driver.getCurrentUrl();
        assertThat(currentUlr).isEqualTo(baseUrl);
    }

//    //public void enterLoginPage() {
//        driver.findElement(loginButton).click();
//    }

    public void accountLogin(String email, String pswrd) {
        driver.findElement(loginField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(pswrd);
        driver.findElement(submitButton).click();
    }

    public boolean isLoginCompleted() {
        try {
            driver.findElement(profileButton);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }
}
