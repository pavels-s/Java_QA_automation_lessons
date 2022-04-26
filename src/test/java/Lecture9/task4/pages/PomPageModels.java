package Lecture9.task4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PomPageModels extends BasePage {

    private final By emailField = By.id("email");
    private final By passField = By.id("pass");
    private final By searchField = By.xpath("//input[@id ='search']");
    private final By foundProducts = By.className("item");

    User user = new User();

    public void enterAccount(String userName, String userPassword) {
        driver.findElement(emailField).sendKeys(userName);
        driver.findElement(passField).sendKeys(userPassword);
        driver.findElement(By.id("send2")).submit();
    }

    public void validateEnter() {
        assertThat(driver.getCurrentUrl()).isEqualTo("https://www.janisroze.lv/lv/customer/account/login/");
    }

    public void searchForProduct() {
        driver.findElement(searchField).sendKeys("superman");
        driver.findElement(searchField).submit();
    }

    public void assertForFirstFoundResult() {
        List<WebElement> foundProductList = driver.findElements(foundProducts);
        assertThat(foundProductList.get(0)).isEqualTo(driver.findElement(By.id("product-82776")));
    }
}
