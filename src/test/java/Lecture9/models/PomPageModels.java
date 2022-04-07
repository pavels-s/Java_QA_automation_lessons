package Lecture9.models;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PomPageModels extends BasePage {

    private final By emailField = By.id("email");
    private final By passField = By.id("pass");

    public void validateEmailAndPass() {
        driver.findElement(emailField).sendKeys("pavels.sarkels@gmail.com");
        driver.findElement(passField).sendKeys("k0k0l0k0");
        driver.findElement(By.id("send2")).click();
    }
}
