package Lecture8.CarTest.Pages;

import org.assertj.core.api.AssertionsForClassTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsPagePom extends BasePage {

    public String baseUrl = "https://www.ss.com/lv/transport/cars/";
    private final By priceMin = By.id("f_o_8_min");
    private final By priceMax = By.id("f_o_8_max");
    private final By yearMin = By.id("f_o_18_min");
    Select maxEngine = new Select(driver.findElement(By.id("f_o_15_max")));
    Select carColor = new Select(driver.findElement(By.id("f_o_17")));
    String carColorValue = driver.findElement(By.id("f_o_17")).getAttribute("value");


    public void validateUrl() {
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo(baseUrl);
    }

    public void setPrice(String min, String max) {
        driver.findElement(priceMin).sendKeys(min);
        driver.findElement(priceMax).sendKeys(max);
    }

    public void validatePrice(String min, String max) {
        AssertionsForClassTypes.assertThat(priceMin).isEqualTo(min);
        AssertionsForClassTypes.assertThat(priceMax).isEqualTo(max);
    }

    public void setYear(String year) {
        Select minYear = new Select(driver.findElement(yearMin));
        minYear.selectByValue(year);
    }

    public void validateYear(String year) {
        String minYearValue = driver.findElement(yearMin).getAttribute("value");
        assertThat(minYearValue).isEqualTo(year);
    }

    public void setEngineMax(String engine) {
        maxEngine.selectByValue(engine);
    }

    public void setColor(String color) {
        carColor.selectByValue(color);
    }

    public void checkColor(String color) {
        AssertionsForClassTypes.assertThat(carColorValue).isEqualTo(color);
    }

    public void submit() {
        driver.findElement(By.xpath("//input[@class='b s12']"));
    }
}
